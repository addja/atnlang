package interp;

import java.util.HashMap;
import parser.*;

public class ATNInterp  {

    private HashMap<String,ATNTree> node2Tree;
    private String startingNode;
    private ATNTree tree;
    private Interp interp;
    private HashMap<String,Data> atnVars;

    public ATNInterp (ATNTree t, Interp interp) {
        node2Tree = new HashMap<String,ATNTree>();
        ATNTree node_list = t.getChild(1);
        atnVars = new HashMap<String,Data>();

        for (int i = 0; i < node_list.getChildCount(); i++) {
            ATNTree f = node_list.getChild(i);
            if (f.getType() == ATNLexer.ASSIGN) {
                Data value = interp.evaluateExpression(f.getChild(1));
                if (f.getChild(0).getType() == ATNLexer.BRACKET) {
                    String id = f.getChild(0).getChild(0).getText();
                    Data index = interp.evaluateExpression(f.getChild(0).getChild(1));
                    if (!index.isInteger()) throw new RuntimeException("Array indexes can only be integers");
                    defineATNArray(id, value, index.getIntegerValue());
                }
                else defineATNVar(f.getChild(0).getText(), value);
            }
            else {
                if (startingNode == null) startingNode = node_list.getChild(i).getChild(0).getText();
                createNode(node_list.getChild(i));
            }
        }

        tree = t;
        this.interp = interp;
    }

    public ATNTree getTree() { return tree; }

    public Data Run () {
        interp.getStack().pushAtnVars(atnVars);
        Data d = new Data(executeNode(startingNode));
        interp.getStack().popAtnVars();
        return d;
    }

    private boolean executeNode (String name) {
        ATNTree arc_list = node2Tree.get(name);
        if (arc_list.getType() == ATNLexer.ACCEPT) return true;
        
		for (int i = 0; i < arc_list.getChildCount() && !interp.textParsed(); ++i) {
            HashMap<String,Data> global_backup = new HashMap<String,Data>(interp.getStack().getGlobalVars());
            int index_backup = interp.getParseIndex();
            ATNTree arc = arc_list.getChild(i);
            if (interp.evaluateExpression(arc.getChild(0)).getBooleanValue()) {
                String problem = "last token consumed: " + interp.getLastTokenParsed().toString()
                				 + "\n|> node " + name + " at arc nº" + String.valueOf(i);
				
				ATNTree after_code = arc.getChild(2);
				if (after_code != null) 
                	executeAfterArc(after_code, name + " at arc nº" + String.valueOf(i));

                String nextNode = arc.getChild(1).getChild(0).getText();
                interp.forwardParseIndex();
                if (executeNode(nextNode)) return true;
            }
            interp.getStack().setGlobalVars(global_backup);
            interp.setParseIndex(index_backup);
        }
        return false;
    }

    private void executeAfterArc (ATNTree t, String arcName) {
        interp.getStack().pushActivationRecord(arcName, interp.lineNumber());
        interp.setLineNumber(t);
        Data result = interp.executeListInstructions(t);
        if (result != null) throw new RuntimeException("Arcs cannot have return keyword");
        interp.getStack().popActivationRecord();
    }

    private void createNode (ATNTree t) {
        node2Tree.put(t.getChild(0).getText(), t.getChild(1));
    }

    private void defineATNVar(String name, Data value) {
        Data d = atnVars.get(name);
        if (d == null) atnVars.put(name, value); // New definition
        else d.setData(value); // Use the previous data 
    }

    private void defineATNArray(String name, Data value, int index) {
        Data d = atnVars.get(name);
        if (d == null) {
            Data array;
            if (value.isBoolean()) array = new Data(index,value.getBooleanValue());
            else if (value.isInteger()) array = new Data(index,value.getIntegerValue());
            else array = new Data(index,value.getStringValue());
            atnVars.put(name, array); 
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
}

