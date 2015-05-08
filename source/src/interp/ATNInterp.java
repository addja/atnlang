package interp;

import java.util.HashMap;
import parser.*;

public class ATNInterp  {

    private HashMap<String,ATNTree> node2Tree;
    private String startingNode;
    private ATNTree tree;
    private Interp interp;

    public ATNInterp (ATNTree t, Interp interp) {
        node2Tree = new HashMap<String,ATNTree>();
        ATNTree node_list = t.getChild(1);

        for (int i = 0; i < t.getChildCount(); i++) {
            createNode(node_list.getChild(i));
        }
   
        startingNode = node_list.getChild(0).getChild(0).getText();
        tree = t;
        this.interp = interp;
    }

    public ATNTree getTree() { return tree; }

    public Data Run () {
        return new Data(executeNode(startingNode));
    }

    private boolean executeNode (String name) {
        ATNTree arc_list = node2Tree.get(name);

        if (arc_list.getType() == ATNLexer.ACCEPT) return true;

        for (int i = 0; i < arc_list.getChildCount(); ++i) {
            HashMap<String,Data> global_backup = new HashMap<String,Data>(interp.getStack().getGlobalVars());
            int index_backup = interp.getParseIndex();
            ATNTree arc = arc_list.getChild(i);
            if (interp.evaluateExpression(arc.getChild(0), Interp.Caller.ATN).getBooleanValue()) {
                executeAfterArc(arc.getChild(2), name + String.valueOf(i));
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
        Data result = interp.executeListInstructions(t, Interp.Caller.ATN);
        if (result != null) throw new RuntimeException("Arcs cannot have return keyword");
        interp.getStack().popActivationRecord();
    }

    private void createNode (ATNTree t) {
        node2Tree.put(t.getChild(0).getText(), t.getChild(1));
    }

}