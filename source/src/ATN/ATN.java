package ATN;

// Imports for ANTLR
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

// Imports from Java
import org.apache.commons.cli.*; // Command Language Interface
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


// Parser and Interpreter
import parser.*;
import interp.*;

/**
 * The class <code>ATN</code> implement the main function of the
 * interpreter. It accepts a set of options to generate the AST in
 * dot format and avoid the execution of the program. To know about
 * the accepted options, run the command ATN -help.
 */

public class ATN {

    /** The file name of the program. */
    private static String infile = null;
    /** Name of the file representing the AST. */
    private static String astfile = null;
    /** Name of the file to read the text to Parse  */
    private static String parsefile = null;
    /** Flag indicating that the AST must be written in dot format. */
    private static boolean dotformat = false;
    /** Name of the file storing the trace of the program. */
    private static String tracefile = null;
    /** Flag to indicate whether the program must be executed after parsing. */
    private static boolean execute = true;
      
    /** Main program that invokes the parser and the interpreter. */
    
    public static void main(String[] args) throws Exception {
        // Parser for command line options
        if (!readOptions (args)) System.exit(1);

        // Parsing of the input file
        
        CharStream input = null;
        try {
            input = new ANTLRFileStream(infile);
        } catch (IOException e) {
            System.err.println ("Error: file " + infile + " could not be opened.");
            System.exit(1);
        }

        // Creates the lexer
        ATNLexer lex = new ATNLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);

        // Creates and runs the parser. As a result, an AST is created
        ATNParser parser = new ATNParser(tokens);
        ATNTreeAdaptor adaptor = new ATNTreeAdaptor();
        parser.setTreeAdaptor(adaptor);
        ATNParser.prog_return result = null;
        try {
            result = parser.prog();
        } catch (Exception e) {
        } // Just catch the exception (nothing to do)
        
        // Check for parsing errors
        int nerrors = parser.getNumberOfSyntaxErrors();
        if (nerrors > 0) {
            System.err.println (nerrors + " errors detected. " +
                                "The program has not been executed.");
            System.exit(1);
        }

        // Get the AST
        ATNTree t = (ATNTree)result.getTree();

        // Generate a file for the AST (option -ast file)
        if (astfile != null) {
            File ast = new File(astfile);
            BufferedWriter output = new BufferedWriter(new FileWriter(ast));
            if (dotformat) {
                DOTTreeGenerator gen = new DOTTreeGenerator();
                output.write(gen.toDOT(t).toString());
            } else {
                output.write(t.toStringTree());
            }
            output.close();
        }

        String x = "";
        ArrayList<String> aux = new ArrayList<String>();
        aux.add(x);
        ArrayList<ArrayList<String>> freelingInput = new ArrayList<ArrayList<String>>();
        freelingInput.add(aux);
        if (parsefile != null) {
             freelingInput = readInput();
        }

        // Start interpretation (only if execution required)
        if (execute) {
            // Creates and prepares the interpreter
            Interp I = null;
            int linenumber = -1;
            try {
                I = new Interp(t, tracefile, freelingInput); // prepares the interpreter
                I.Run();                  // Executes the code
            } catch (RuntimeException e) {
                if (I != null) linenumber = I.lineNumber();
                System.err.print ("Runtime error");
                if (linenumber < 0) System.err.print (": ");
                else System.err.print (" (" + infile + ", line " + linenumber + "): ");
                System.err.println (e.getMessage() + ".");
                System.err.format (I.getStackTrace());
            } catch (StackOverflowError e) {
                if (I != null) linenumber = I.lineNumber();
                System.err.print("Stack overflow error");
                if (linenumber < 0) System.err.print (".");
                else System.err.println (" (" + infile + ", line " + linenumber + ").");
                System.err.format (I.getStackTrace(5));
            }
        }
    }

    /**
     * Read the input to parse from the file indicated with -parse flag
     * in FreeLing format.
     */
    private static ArrayList<ArrayList<String>> readInput() {
        CharStream chrstrm = null;
        try {
            chrstrm = new ANTLRFileStream(parsefile);
        } catch (IOException e) {
            System.err.println ("Error: file " + parsefile + " could not be opened.");
            System.exit(1);
        }
        ArrayList<String> a = new ArrayList<String>(Arrays.asList(chrstrm.toString().split("\n")));        
        ArrayList<ArrayList<String>> r = new ArrayList<ArrayList<String>>();
        for (String s:a) r.add(new ArrayList<String>(Arrays.asList(s.split(" "))));
        return r;
    }


    /**
     * Function to parse the command line. It defines some of
     * the attributes of the class. It returns true if the parsing
     * hass been successful, and false otherwise.
     */

    private static boolean readOptions(String[] args) {
        // Define the options
        Option help = new Option("help", "print this message");
        Option noexec = new Option("noexec", "do not execute the program");
        Option dot = new Option("dot", "dump the AST in dot format");
        Option ast = OptionBuilder
                        .withArgName ("file")
                        .hasArg()
                        .withDescription ("write the AST")
                        .create ("ast");
        Option trace = OptionBuilder
                        .withArgName ("file")
                        .hasArg()
                        .withDescription ("write a trace of function calls during the execution of the program")
                        .create ("trace");
        Option parse = OptionBuilder
                        .withArgName ("file")
                        .hasArg()
                        .withDescription ("file to read the FreeLing generated output")
                        .create("parse");
                                       
        Options options = new Options();
        options.addOption(help);
        options.addOption(dot);
        options.addOption(ast);
        options.addOption(trace);
        options.addOption(noexec);
        options.addOption(parse);
        CommandLineParser clp = new GnuParser();
        CommandLine line = null;

        String cmdline = "ATN [options] file";
        
        // Parse the options
        try {
            line = clp.parse (options, args);
        }
        catch (ParseException exp) {
            System.err.println ("Incorrect command line: " + exp.getMessage());
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp (cmdline, options);
            return false;
        }

        // Option -help
        if (line.hasOption ("help")) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp (cmdline, options);
            return false;
        }
        
        // Option -dot
        if (line.hasOption ("dot")) dotformat = true;

        // Option -ast dotfile
        if (line.hasOption ("ast")) astfile = line.getOptionValue ("ast");
        
        // Option -trace dotfile
        if (line.hasOption ("trace")) tracefile = line.getOptionValue ("trace");
        
        // Option -noexec
        if (line.hasOption ("noexec")) execute = false;

        // Option -parse
        if (line.hasOption ("parse")) parsefile = line.getOptionValue("parse");

        // Remaining arguments (the input file)
        String[] files = line.getArgs();
        if (files.length != 1) {
            System.err.println ("Incorrect command line.");
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp (cmdline, options);
            return false;
        }
        
        infile = files[0];
        return true;
    }
}

