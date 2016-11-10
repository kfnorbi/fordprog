package hu.deik.fordprog;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import hu.deik.fordprog.LogicAdapter;

public class AntlrBasicWriter extends LogicAdapter {

	// @Override
	// public void enterEveryRule(ParserRuleContext arg0) {
	// for (ParseTree child : arg0.children) {
	// System.out.println(child.getText());
	// }
	// }

	@Override
	public void visitTerminal(TerminalNode arg0) {
		System.out.print(arg0.getText());
	}

}
