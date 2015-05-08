package interp;

import parser.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

/** Class that implements the interpreter of the language. */

public class Interp {

    /** Identifier for the interpreters */
    public enum Caller {NORMAL, ATN;}


    /** Memory of the virtual machine. */
    private Stack Stack;

    /** input text to parse variables */
    private int parseIndex;
    private ArrayList<ArrayList<String>> inputToParse;

    /**
     * Map between function names (keys) and ASTs (values).
     * Each entry of the map stores the root of the AST
     * correponding to the function.
     */
    private HashMap<String,ATNTree> FuncName2Tree;

    /**
     * Map between function names (keys) and ATN.
     * Each entry of the map stores the root of the ATN
     * object.
     */
    private HashMap<String,ATNInterp> ATNname2Tree;

    /**
    * // TODO input extention
    * // Standard input of the interpreter (System.in).
    * private Scanner stdin;
    */

    /**
     * Stores the line number of the current statement.
     * The line number is used to report runtime errors.
     */
    private int linenumber = -1;

    /** File to write the trace of function calls. */
    private PrintWriter trace = null;

    /** Nested levels of function calls. */
    private int function_nesting = -1;
    
    /**
     * Constructor of the interpreter. It prepares the main
     * data structures for the execution of the main program.
     */
    public Interp(ATNTree T, String tracefile, ArrayList<ArrayList<String>> input) {
        assert T != null;
        inputToParse = input;
        parseIndex = 0;

        Stack = new Stack(); // Creates the memory of the virtual machine
        PreProcessAST(T); // Some internal pre-processing ot the AST
        ParseProgram(T);  // Creates the table to map function names into AST nodes
        // Initializes the standard input of the program

        /** TODO: input extention
        * stdin = new Scanner (new BufferedReader(new InputStreamReader(System.in)));
        */
        if (tracefile != null) {
            try {
                trace = new PrintWriter(new FileWriter(tracefile));
            } catch (IOException e) {
                System.err.println(e);
                System.exit(1);
            }
        }
        function_nesting = -1;
    }

    /** Runs the program by calling the main function without parameters. */
    public void Run() {
        executeFunction ("main", null, Caller.NORMAL);
    }

    /** Returns the contents of the stack trace */
    public String getStackTrace() {
        return Stack.getStackTrace(lineNumber());
    }

    /** Returns a summarized contents of the stack trace */
    public String getStackTrace(int nitems) {
        return Stack.getStackTrace(lineNumber(), nitems);
    }

    /** Returns the interpreter stack */
    public Stack getStack() {
        return Stack;
    }
    
    /**
     * Gathers information from the AST and creates the map from
     * function names to the corresponding AST nodes.
     */
    private void ParseProgram(ATNTree T) {
        assert T != null && T.getType() == ATNLexer.PROGRAM;
        FuncName2Tree = new HashMap<String,ATNTree>();
        ATNname2Tree = new HashMap<String,ATNInterp>();
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) {
            ATNTree f = T.getChild(i);
            switch(f.getType()) {
                case ATNLexer.DEF:
                    String fname = f.getChild(0).getText();
                    if (FuncName2Tree.containsKey(fname)) {
                        throw new RuntimeException("Multiple definitions of function " + fname);
                    }
                    FuncName2Tree.put(fname, f);
                    break;

                case ATNLexer.ASSIGN:
                    Data value = evaluateExpression(f.getChild(1),Caller.NORMAL);
                    if (f.getChild(0).getType() == ATNLexer.BRACKET) {
                        String id = f.getChild(0).getChild(0).getText();
                        int index = f.getChild(0).getChild(1).getIntValue();
                        Stack.defineArrayVariableGlobal(id, value, index);
                    }
                    Stack.defineVariableGlobal(f.getChild(0).getText(), value);
                    break;

                case ATNLexer.ATN:
                    String name = f.getChild(0).getText();
                    if (ATNname2Tree.containsKey(name)) {
                        throw new RuntimeException("Multiple definitions of atn " + name);
                    }
                    ATNname2Tree.put(name, new ATNInterp(f, this));
                    break;

                default:
                    throw new RuntimeException("Incorrect declaration");
            }
        } 
    }

    /**
     * Performs some pre-processing on the AST. Basically, it
     * calculates the value of the literals and stores a simpler
     * representation. See ATNTree.java for details.
     */
    private void PreProcessAST(ATNTree T) {
        if (T == null) return;
        switch(T.getType()) {
            case ATNLexer.INT: T.setIntValue(); break;
            case ATNLexer.STRING: T.setStringValue(); break;
            case ATNLexer.BOOLEAN: T.setBooleanValue(); break;
            default: break;
        }
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) PreProcessAST(T.getChild(i));
    }

    /**
     * Gets the current line number. In case of a runtime error,
     * it returns the line number of the statement causing the
     * error.
     */
    public int lineNumber() { return linenumber; }

    /** Defines the current line number associated to an AST node. */
    public void setLineNumber(ATNTree t) { linenumber = t.getLine();}

    /** Defines the current line number with a specific value */
    private void setLineNumber(int l) { linenumber = l;}
    
    /** updates the parse text index */
    public void setParseIndex(int i) {
        parseIndex = i;
    }

    /** returns the parse input indez */
    public int getParseIndex() { return parseIndex; }

    /** advences the parse index one position */
    public void forwardParseIndex() { ++parseIndex; }

    /**
     * Executes a function.
     * @param funcname The name of the function.
     * @param args The AST node representing the list of arguments of the caller.
     * @return The data returned by the function.
     */
    private Data executeFunction(String funcname, ATNTree args, Caller flag) {
        // Get the AST of the function
        ATNTree f = FuncName2Tree.get(funcname);
        if (f == null) throw new RuntimeException(" function " + funcname + " not declared");

        // Gather the list of arguments of the caller. This function
        // performs all the checks required for the compatibility of
        // parameters.
        ArrayList<Data> Arg_values = listArguments(f, args, flag);

        // Dumps trace information (function call and arguments)
        if (trace != null) traceFunctionCall(f, Arg_values, flag);
        
        // List of parameters of the callee
        ATNTree p = f.getChild(1);
        int nparam = p.getChildCount(); // Number of parameters

        // Create the activation record in memory
        Stack.pushActivationRecord(funcname, lineNumber());

        // Track line number
        setLineNumber(f);
         
        // Copy the parameters to the current activation record
        for (int i = 0; i < nparam; ++i) {
            String param_name = p.getChild(i).getText();
            Stack.defineVariable(param_name, Arg_values.get(i));
        }

        // Execute the instructions
        Data result = executeListInstructions(f.getChild(2), flag);

        // If the result is null, then the function returns void
        if (result == null) result = new Data();
        
        // Dumps trace information
        if (trace != null) traceReturn(f, result, Arg_values, flag);
        
        // Destroy the activation record
        Stack.popActivationRecord();

        return result;
    }

    /**
     * Executes an ATN.
     * @param atnname The name of the function.
     * @param args The AST node representing the list of arguments of the caller.
     * @return The data returned by the function.
     */
    private Data executeATN (String atnname) {
        // Get the AST of the atn
        ATNInterp atn = ATNname2Tree.get(atnname);
        if (atn == null) throw new RuntimeException(" atn " + atnname + " not declared");

        // Gather the list of arguments of the caller. This function
        // performs all the checks required for the compatibility of
        // parameters.
        ArrayList<Data> Arg_values = new ArrayList<Data>();

        // Dumps trace information (function call and arguments)
        if (trace != null) traceFunctionCall(atn.getTree(), Arg_values, Caller.ATN);

        // Create the activation record in memory
        Stack.pushActivationRecord(atnname, lineNumber());

        // Track line number
        setLineNumber(atn.getTree());
         
        // Execute the instructions
        Data result = atn.Run();

        // Dumps trace information
        if (trace != null) traceReturn(atn.getTree(), result, Arg_values, Caller.ATN);
        
        // If the result is null, then the function returns void
        if (!result.isBoolean()) {
            throw new RuntimeException ("Atn did not return a boolean");
        } 
        
        // Destroy the activation record
        Stack.popActivationRecord();

        return result;
    }

    /**
     * Executes a block of instructions. The block is terminated
     * as soon as an instruction returns a non-null result.
     * Non-null results are only returned by "return" statements.
     * @param t The AST of the block of instructions.
     * @return The data returned by the instructions (null if no return
     * statement has been executed).
     */
    public Data executeListInstructions(ATNTree t,Caller flag) {
        assert t != null;
        Data result = null;
        int ninstr = t.getChildCount();
        for (int i = 0; i < ninstr; ++i) {
            result = executeInstruction(t.getChild(i),flag);
            if (result != null) return result;
        }
        return null;
    }
    
    /**
     * Executes an instruction. 
     * Non-null results are only returned by "return" statements.
     * @param t The AST of the instruction.
     * @return The data returned by the instruction. The data will be
     * non-null only if a return statement is executed or a block
     * of instructions executing a return.
     */
    private Data executeInstruction (ATNTree t, Caller flag) {
        assert t != null;
        
        setLineNumber(t);
        Data value; // The returned value

        // A big switch for all type of instructions
        switch (t.getType()) {

            // Assignment
            case ATNLexer.ASSIGN:
                value = evaluateExpression(t.getChild(1),flag);
                if (t.getChild(0).getType() == ATNLexer.BRACKET) {
                    String id = t.getChild(0).getChild(0).getText();
                    int index = t.getChild(0).getChild(1).getIntValue();
                    Stack.defineArrayVariable (id, value, index);
                }
                else Stack.defineVariable (t.getChild(0).getText(), value);
                return null;

            // If-then-else
            case ATNLexer.IF:
                value = evaluateExpression(t.getChild(0),flag);
                checkBoolean(value);
                if (value.getBooleanValue()) return executeListInstructions(t.getChild(1),flag);
                // Is there else statement ?
                if (t.getChildCount() == 3) return executeListInstructions(t.getChild(2),flag);
                return null;

            // While
            case ATNLexer.WHILE:
                while (true) {
                    value = evaluateExpression(t.getChild(0),flag);
                    checkBoolean(value);
                    if (!value.getBooleanValue()) return null;
                    Data r = executeListInstructions(t.getChild(1),flag);
                    if (r != null) return r;
                }

            // Return
            case ATNLexer.RETURN:
                if (flag == Caller.ATN) {
                    throw new RuntimeException ("Return statement can't be called from an atn");
                }
                if (t.getChildCount() != 0) {
                    return evaluateExpression(t.getChild(0),flag);
                }
                return new Data(); // No expression: returns void data

            /*  
            // Read statement: reads a variable and raises an exception
            // in case of a format error.
            case ATNLexer.READ:
                String token = null;
                Data val = new Data(0);;
                try {
                    token = stdin.next();
                    val.setValue(Integer.parseInt(token)); 
                } catch (NumberFormatException ex) {
                    throw new RuntimeException ("Format error when reading a number: " + token);
                }
                Stack.defineVariable (t.getChild(0).getText(), val);
                return null;
            */

            // Write statement: it can write an expression or a string.
            case ATNLexer.PRINT:
                int n = t.getChildCount();
                String s = "";
                for (int i = 0; i < n; ++i) {
                    // Write an expression
                    s += evaluateExpression(t.getChild(i),flag).toString();
                }
                System.out.format(s);
                return null;

            // Function call
            case ATNLexer.FUNCALL:
                executeFunction(t.getChild(0).getText(), t.getChild(1),flag);
                return null;

            case ATNLexer.ATNCALL:
                executeATN(t.getChild(0).getText());
                // TODO : interrupt execution or raise exception when a void
                // atn is executed and fails
                return null;

            default: assert false; // Should never happen
        }

        // All possible instructions should have been treated.
        assert false;
        return null;
    }

    /**
     * Evaluates the expression represented in the AST t.
     * @param t The AST of the expression
     * @return The value of the expression.
     */
     
    public Data evaluateExpression(ATNTree t, Caller flag) {
        assert t != null;

        int previous_line = lineNumber();
        setLineNumber(t);
        int type = t.getType();

        Data value = null;
        // Atoms
        switch (type) {
            // A hash from atn
            case ATNLexer.HASH:
                if (flag == Caller.NORMAL) {
                    throw new RuntimeException ("Atn input special option can't be called"
                        + "outside an atn");
                }
                int i = t.getChild(0).getIntValue();
                if (i >= inputToParse.get(parseIndex).size()){
                     throw new RuntimeException ("Index " + i + " out of bounds in the # tuple");
                }
                value = new Data(inputToParse.get(parseIndex).get(i));
                break;
            // A variable
            case ATNLexer.ID:
                value = new Data(Stack.getVariable(t.getText()));
                break;
            // An integer literal
            case ATNLexer.INT:
                value = new Data(t.getIntValue());
                break;
            // A Boolean literal
            case ATNLexer.BOOLEAN:
                value = new Data(t.getBooleanValue());
                break;
            // An array value
            case ATNLexer.BRACKET:
                String id = t.getChild(0).getText();
                int index = t.getChild(1).getIntValue();
                Data array = Stack.getVariable(id);
                if (array.isBooleanArray()) 
                    value = new Data(array.getBooleanArrayValue(index));
                else if (array.isStringArray()) 
                    value = new Data(array.getStringArrayValue(index));
                else value = new Data(array.getIntegerArrayValue(index));
                break;
            // A function call. Checks that the function returns a result.
            case ATNLexer.FUNCALL:
                value = executeFunction(t.getChild(0).getText(), t.getChild(1),flag);
                assert value != null;
                if (value.isVoid()) {
                    throw new RuntimeException ("function expected to return a value");
                }
                break;
            case ATNLexer.ATNCALL:
                value = executeATN(t.getChild(0).getText());
                assert value != null;
                if (value.isVoid()) {
                    throw new RuntimeException ("atn failed to return a value");
                }
                break;
            // Request of array length
            case ATNLexer.ARRAYLENGTH:
                Data temp = new Data(Stack.getVariable(t.getChild(0).getText()));
                checkArray(temp);
                value = new Data(temp.getArrayLength());
                break;
            // String literal
            case ATNLexer.STRING:
                value = new Data(t.getStringValue());
                break;
            default: break;
        }

        // Retrieve the original line and return
        if (value != null) {
            setLineNumber(previous_line);
            return value;
        }
        
        // Unary operators
        value = evaluateExpression(t.getChild(0),flag);
        if (t.getChildCount() == 1) {
            switch (type) {
                case ATNLexer.PLUS:
                    checkInteger(value);
                    break;
                case ATNLexer.MINUS:
                    checkInteger(value);
                    value.setValue(-value.getIntegerValue());
                    break;
                case ATNLexer.NOT:
                    checkBoolean(value);
                    value.setValue(!value.getBooleanValue());
                    break;
                default: assert false; // Should never happen
            }
            setLineNumber(previous_line);
            return value;
        }

        // Two operands
        Data value2;
        switch (type) {
            // Relational operators
            case ATNLexer.EQ_COMP:
            case ATNLexer.NOT_EQUAL:
            case ATNLexer.LT:
            case ATNLexer.LE:
            case ATNLexer.GT:
            case ATNLexer.GE:
                value2 = evaluateExpression(t.getChild(1),flag);
                if (value.getType() != value2.getType()) {
                  throw new RuntimeException ("Incompatible types in relational expression");
                }
                value = value.evaluateRelational(type, value2);
                break;

            // Arithmetic operators
            case ATNLexer.PLUS:
                value2 = evaluateExpression(t.getChild(1),flag);
                if (value.isInteger()) {
                    checkInteger(value); checkInteger(value2);
                }
                else { checkString(value); checkString(value); }
                value.evaluateArithmetic(type, value2);
                break;
            case ATNLexer.MINUS:
            case ATNLexer.MUL:
            case ATNLexer.DIV:
            case ATNLexer.MOD:
                value2 = evaluateExpression(t.getChild(1),flag);
                checkInteger(value); checkInteger(value2);
                value.evaluateArithmetic(type, value2);
                break;

            // Boolean operators
            case ATNLexer.AND:
            case ATNLexer.OR:
                // The first operand is evaluated, but the second
                // is deferred (lazy, short-circuit evaluation).
                checkBoolean(value);
                value = evaluateBoolean(type, value, t.getChild(1),flag);
                break;

            default: assert false; // Should never happen
        }
        
        setLineNumber(previous_line);
        return value;
    }
    
    /**
     * Evaluation of Boolean expressions. This function implements
     * a short-circuit evaluation. The second operand is still a tree
     * and is only evaluated if the value of the expression cannot be
     * determined by the first operand.
     * @param type Type of operator (token).
     * @param v First operand.
     * @param t AST node of the second operand.
     * @return An Boolean data with the value of the expression.
     */
    private Data evaluateBoolean(int type, Data v, ATNTree t, Caller flag) {
        // Boolean evaluation with short-circuit

        switch (type) {
            case ATNLexer.AND:
                // Short circuit if v is false
                if (!v.getBooleanValue()) return v;
                break;
        
            case ATNLexer.OR:
                // Short circuit if v is true
                if (v.getBooleanValue()) return v;
                break;
                
            default: assert false;
        }

        // Return the value of the second expression
        v = evaluateExpression(t,flag);
        checkBoolean(v);
        return v;
    }

    /** Checks that the data is Boolean and raises an exception if it is not. */
    private void checkBoolean (Data b) {
        if (!b.isBoolean()) {
            throw new RuntimeException ("Expecting Boolean expression");
        }
    }
    
    /** Checks that the data is integer and raises an exception if it is not. */
    private void checkInteger (Data b) {
        if (!b.isInteger()) {
            throw new RuntimeException ("Expecting numerical expression");
        }
    }

    /** Checks that the data is integer and raises an exception if it is not. */
    private void checkArray (Data b) {
        if (!b.isArray()) {
            throw new RuntimeException ("Length can only be executed on array variables");
        }
    }

    /** Checks that the data is integer and raises an exception if it is not. */
    private void checkString (Data b) {
        if (!b.isString()) {
            throw new RuntimeException ("Expecting a String concatenation");
        }
    }

    /**
     * Gathers the list of arguments of a function call. It also checks
     * that the arguments are compatible with the parameters. In particular,
     * it checks that the number of parameters is the same and that no
     * expressions are passed as parametres by reference.
     * @param AstF The AST of the callee.
     * @param args The AST of the list of arguments passed by the caller.
     * @return The list of evaluated arguments.
     */
     
    private ArrayList<Data> listArguments(ATNTree AstF, ATNTree args, Caller flag) {
        if (args != null) setLineNumber(args);
        ATNTree pars = AstF.getChild(1);   // Parameters of the function
        
        // Create the list of parameters
        ArrayList<Data> Params = new ArrayList<Data> ();
        int n = pars.getChildCount();

        // Check that the number of parameters is the same
        int nargs = (args == null) ? 0 : args.getChildCount();
        if (n != nargs) {
            throw new RuntimeException("Incorrect number of parameters calling function " +
                                        AstF.getChild(0).getText());
        }

        // Checks the compatibility of the parameters passed by
        // reference and calculates the values and references of
        // the parameters.
        for (int i = 0; i < n; ++i) {
            ATNTree p = pars.getChild(i); // Parameters of the callee
            ATNTree a = args.getChild(i); // Arguments passed by the caller
            setLineNumber(a);
            if (p.getType() == ATNLexer.PVALUE) {
                // Pass by value: evaluate the expression
                Params.add(i,evaluateExpression(a,flag));
            } else {
                // Pass by reference: check that it is a variable
                if (a.getType() != ATNLexer.ID) {
                    throw new RuntimeException("Wrong argument for pass by reference");
                }
                // Find the variable and pass the reference
                Data v = Stack.getVariable(a.getText());
                Params.add(i,v);
            }
        }
        return Params;
    }

    /**
     * Writes trace information of a function call in the trace file.
     * The information is the name of the function, the value of the
     * parameters and the line number where the function call is produced.
     * @param f AST of the function
     * @param arg_values Values of the parameters passed to the function
     */
    private void traceFunctionCall(ATNTree f, ArrayList<Data> arg_values, Caller flag) {
        function_nesting++;
        ATNTree params = f.getChild(1);
        int nargs = params.getChildCount();
        for (int i=0; i < function_nesting; ++i) trace.print("|   ");

        // Print function name and parameters
        trace.print(f.getChild(0) + "(");
        if (flag == Caller.NORMAL) {
            for (int i = 0; i < nargs; ++i) {
                if (i > 0) trace.print(", ");
                ATNTree p = params.getChild(i);
                if (p.getType() == ATNLexer.PREF) trace.print("&");
                trace.print(p.getText() + "=" + arg_values.get(i));
            }
        }
        trace.print(") ");
        
        if (function_nesting == 0) trace.println("<entry point>");
        else trace.println("<line " + lineNumber() + ">");
    }

    /**
     * Writes the trace information about the return of a function.
     * The information is the value of the returned value and of the
     * variables passed by reference. It also reports the line number
     * of the return.
     * @param f AST of the function
     * @param result The value of the result
     * @param arg_values The value of the parameters passed to the function
     */
    private void traceReturn(ATNTree f, Data result, ArrayList<Data> arg_values, Caller flag) {
        for (int i=0; i < function_nesting; ++i) trace.print("|   ");
        function_nesting--;
        trace.print("return");
        if (!result.isVoid()) trace.print(" " + result);
        
        // Print the value of arguments passed by reference
        ATNTree params = f.getChild(1);
        int nargs = params.getChildCount();
        if (flag == Caller.NORMAL) {
            for (int i = 0; i < nargs; ++i) {
                ATNTree p = params.getChild(i);
                if (p.getType() == ATNLexer.PVALUE) continue;
                trace.print(", &" + p.getText() + "=" + arg_values.get(i));
            }
        }
        
        trace.println(" <line " + lineNumber() + ">");
        if (function_nesting < 0) trace.close();
    }
}
