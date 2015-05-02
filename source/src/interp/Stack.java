package interp;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Class to represent the memory of the virtual machine of the
 * interpreter. The memory is organized as a stack of activation
 * records and each entry in the activation record contains is a pair
 * <name of variable,value>.
 */
 
public class Stack {

    /** Stack of activation records */
    private LinkedList<HashMap<String,Data>> Stack;

    /** Reference to the current activation record */
    private HashMap<String,Data> CurrentAR = null;

    /** Global variable hasmap */
    private HashMap<String,Data> Global = null;

    /**
     * Class to represent an item of the Stack trace.
     * For each function call, the function name and
     * the line number of the call are stored.
     */
    class StackTraceItem {
        public String fname; // Function name
        public int line; // Line number
        public StackTraceItem (String name, int l) {
            fname = name; line = l;
        }
    }

    /** Stack trace to keep track of function calls */
    private LinkedList<StackTraceItem> StackTrace;

    /** Stack trace to keep track of atn arc calls */
    private LinkedList<StackTraceItem> StackTraceATN;
    
    /** Constructor of the memory */
    public Stack() {
        Stack = new LinkedList<HashMap<String,Data>>();
        CurrentAR = null;
        StackTrace = new LinkedList<StackTraceItem>();
        StackTraceATN = new LinkedList<StackTraceItem>();
        Global = new HashMap<String,Data>();
    }

    /** Creates a new activation record on the top of the stack */
    public void pushActivationRecord(String name, int line) {
        CurrentAR = new HashMap<String,Data>();
        Stack.addLast (CurrentAR);
        StackTrace.addLast (new StackTraceItem(name, line));
    }

    /** Creates a new ecord for arc called on the atn */
    public void pushArc(String name, int line) {
        StackTraceATN.addLast (new StackTraceItem(name, line));
    }

    /** Destroys the current activation record */
    public void popActivationRecord() {
        Stack.removeLast();
        if (Stack.isEmpty()) CurrentAR = null;
        else CurrentAR = Stack.getLast();
        StackTrace.removeLast();
    }

    /** Destroys the current atn arcs record */
    public void popArcs() {
        StackTraceATN = new LinkedList<StackTraceItem>();
    }

    /** Defines the value of a variable. If the variable does not
     * exist, it is created. If it exists, the value and type of
     * the variable are re-defined.
     * @param name The name of the variable
     * @param value The value of the variable
     */
    public void defineVariable(String name, Data value) {
        Data d = CurrentAR.get(name);
        if (d == null) CurrentAR.put(name, value); // New definition
        else d.setData(value); // Use the previous data 
    }

    /** Defines the value of a global variable. If the variable does not
     * exist, it is created. If it exists, the value and type of
     * the variable are re-defined.
     * @param name The name of the variable
     * @param value The value of the variable
     */
    public void defineVariableGlobal(String name, Data value) {
        Data d = Global.get(name);
        if (d == null) Global.put(name, value); // New definition
        else d.setData(value); // Use the previous data 
    }


    /** Defines the value of an array variable. If the array does not
     * exist, it is created with null slots. If it exists, the value and type of
     * the variable are re-defined.
     * @param name The name of the variable
     * @param value The value of the variable
     * @param index The index in which the value must be assigned in the array
     */
    public void defineArrayVariable(String name, Data value, int index) {
        Data d = CurrentAR.get(name);
        if (d == null) {
            Data array;
            if (value.isBoolean()) array = new Data(index,value.getBooleanValue());
            else if (value.isInteger()) array = new Data(index,value.getIntegerValue());
            else array = new Data(index,value.getStringValue());
            CurrentAR.put(name, array); 
        }
        else {
            if (d.getArrayType() != value.getType()){
                Data newarr;
                if (value.isBoolean())
                    newarr = new Data(index, value.getBooleanValue());
                else if (value.isInteger())
                    newarr = new Data(index, value.getIntegerValue());
                else newarr = new Data(index, value.getStringValue());
                d.setData(newarr);
            }
            else { // same type of data
                if (value.isBoolean()) d.setValue(index,value.getBooleanValue());
                else if (value.isInteger()) d.setValue(index,value.getIntegerValue());
                else d.setValue(index,value.getStringValue());
            }
        }
    }


    /** Gets the value of the variable. The value is represented as
     * a Data object. In this way, any modification of the object
     * implicitly modifies the value of the variable.
     * @param name The name of the variable
     * @return The value of the variable
     */
    public Data getVariable(String name) {
        Data v = Global.get(name);
        if (v == null) {
            v = CurrentAR.get(name);
            if (v == null) {
                throw new RuntimeException ("Variable " + name + " not defined");
            }
        }
        return v;
    }

    /**
     * Generates a string with the contents of the stack trace.
     * Each line contains a function name and the line number where
     * the next function is called. Finally, the line number in
     * the current function is written.
     * @param current_line program line executed when this function
     *        is called.
     * @return A string with the contents of the stack trace.
     */ 
    public String getStackTrace(int current_line) {
        int size = StackTrace.size();
        ListIterator<StackTraceItem> itr = StackTrace.listIterator(size);
        StringBuffer trace = new StringBuffer("---------------%n| Stack trace |%n---------------%n");
        trace.append("** Depth = ").append(size).append("%n");
        while (itr.hasPrevious()) {
            StackTraceItem it = itr.previous();
            trace.append("|> ").append(it.fname).append(": line ").append(current_line).append("%n");
            current_line = it.line;
        }
        return trace.toString();
    }

    /**
     * Generates a string with a summarized contents of the stack trace.
     * Only the first and last items of the stack trace are returned.
     * @param current_line program line executed when this function
     *        is called.
     * @param nitems number of function calls returned in the string
     *        at the beginning and at the end of the stack.
     * @return A string with the contents of the stack trace.
     */ 
    public String getStackTrace(int current_line, int nitems) {
        int size = StackTrace.size();
        if (2*nitems >= size) return getStackTrace(current_line);
        ListIterator<StackTraceItem> itr = StackTrace.listIterator(size);
        StringBuffer trace = new StringBuffer("---------------%n| Stack trace |%n---------------%n");
        trace.append("** Depth = ").append(size).append("%n");
        int i;
        for (i = 0; i < nitems; ++i) {
           StackTraceItem it = itr.previous();
           trace.append("|> ").append(it.fname).append(": line ").append(current_line).append("%n");current_line = it.line;
        }
        trace.append("|> ...%n");
        for (; i < size-nitems; ++i) current_line = itr.previous().line;
        for (; i < size; ++i) {
           StackTraceItem it = itr.previous();
           trace.append("|> ").append(it.fname).append(": line ").append(current_line).append("%n");current_line = it.line;
        }
        return trace.toString();
    } 

    /**
     * Generates a string with the contents of the atn trace.
     * Each line contains a node name and the line number where
     * the next arc is followed. Finally, the line number in
     * the current node is written.
     * @param current_line program line executed when this function
     *        is called.
     * @return A string with the contents of the atn trace.
     */ 
    public String getAtnTrace(int current_line) {
        int size = StackTraceATN.size();
        ListIterator<StackTraceItem> itr = StackTraceATN.listIterator(size);
        StringBuffer trace = new StringBuffer("---------------%n| Atn trace |%n---------------%n");
        trace.append("** Depth = ").append(size).append("%n");
        while (itr.hasPrevious()) {
            StackTraceItem it = itr.previous();
            trace.append("|> ").append(it.fname).append(": line ").append(current_line).append("%n");
            current_line = it.line;
        }
        return trace.toString();
    }

}
    
