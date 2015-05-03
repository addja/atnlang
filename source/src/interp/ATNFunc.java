package interp;

import java.util.HashMap;

public class ATNFunc {

	private HashMap<String,ATNTree> node2Tree;
	private String startingNode;
	private ATNTree tree;
	private String parseText;

	public ATNFunc(ATNTree t) {

		node2Tree = new HashMap<String,ATNTree>();

		for (int i = 0; i < t.getChildCount(); i++) {
			createNode(t.getChild(i));
		}

		startingNode = t.getChild(0).getChild(0).getText();

		tree = t;

	}

	public ATNTree getTree() { return tree; }

	// Stack.popArc(), Stack.pushArc();
	public Data run(String text, Stack Stack) {

		parseText = text;
		boolean b = executeNode(startingNode);

		return new Data(b);
	}

	private boolean executeNode(String name) {

		ATNTree node = node2Tree.get(name);

		if (node.getChild(1) == ATNLexer.ACCEPT) return true;

		ArrayList<int> list = new ArrayList<int>();

		for (int i = 1; i < node.getChildCount(); i++) {
			ATNTree arc = node.getChild(i);
			if (evaluateExpression(arc.getChild(0))) {
				list.add(i);
			}
		}

		if (!list.empty()) {
			for (int x:list) {
				executeListInstructions(node.getChild(x).getChild(2));
				boolean b = executeNode(node.getChild(x).getChild(1).getText());
				if (b) return true;
				// desfer el executeListInstructions -> push pop activation record + copia vars globals
			}
		}

		return false;

	}

	private void createNode(ATNTree t) {
		node2Tree.put(t.getChild(0).getText(), t.getChild(1));
	}

}