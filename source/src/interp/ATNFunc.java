package interp;

import java.util.HashMap;

public class ATNFunc {

	private HashMap<String,ATNTree> nodes;
	private String startingNode;
	private ATNTree tree;

	public ATNFunc(ATNTree t) {

		nodes = new HashMap<String,ATNTree>();

		for (int i = 0; i < t.getChildCount(); i++) {
			createNode(t.getChild(i));
		}

		startingNode = t.getChild(0).getChild(0).getText();

		tree = t;

	}

	public ATNTree getTree() { return tree; }

	// Stack.popArc(), Stack.pushArc();
	public Data run(String text, Stack Stack) {

		return new Data(false);
	}

	private void createNode(ATNTree t) {
		nodes.put(t.getChild(0).getText(), t.getChild(1));
	}

}