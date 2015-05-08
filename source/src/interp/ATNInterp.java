package interp;

import java.util.HashMap;
import parser.*;

public class ATNInterp  {

    private HashMap<String,ATNTree> node2Tree;
    private String startingNode;
    private ATNTree tree;
    private String text;
    private Interp interp;

    public ATNInterp (ATNTree t, Interp interp) {
        node2Tree = new HashMap<String,ATNTree>();

        for (int i = 0; i < t.getChildCount(); i++) {
            createNode(t.getChild(i));
        }

        startingNode = t.getChild(0).getChild(0).getText();
        tree = t;
        this.interp = interp;
    }

    public ATNTree getTree() { return tree; }

    public Data Run (String text) {
        this.text = text;
        return new Data(executeNode(startingNode));
    }

    private boolean executeNode (String name) {
        ATNTree node = node2Tree.get(name);
        ATNTree arc_list = node.getChild(1);

        if (arc_list.getType() == ATNLexer.ACCEPT) return true;

        for (int i = 0; i < arc_list.getChildCount(); ++i) {
            HashMap<String,Data> global_backup = new HashMap<String,Data>(interp.getStack().getGlobalVars());
            ATNTree arc = arc_list.getChild(i);
            if (interp.evaluateExpression(arc.getChild(0), interp.Caller.ATN).getBooleanValue()) {
                executeArc(arc.getChild(2), name + String.valueOf(i));
                String nextNode = arc.getChild(1).getChild(0).getText();
                if (executeNode(nextNode)) return true;
            }
            interp.getStack().setGlobalVars(global_backup);
        }
        return false;
    }

    private void executeArc (ATNTree t, String arcName) {
        interp.getStack().pushActivationRecord(arcName, interp.lineNumber());
        interp.setLineNumber(t);

        Data result = interp.executeListInstructions(t, interp.Caller.ATN);
        if (!result.isVoid()) throw new RuntimeException("Arcs cannot have return keyword");
        interp.getStack().popActivationRecord();
    }

    private void createNode (ATNTree t) {
        node2Tree.put(t.getChild(0).getText(), t.getChild(1));
    }

}