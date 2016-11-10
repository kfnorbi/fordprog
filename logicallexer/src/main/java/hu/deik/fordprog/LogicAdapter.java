package hu.deik.fordprog;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import generated.LogicListener;
import generated.LogicParser.AndExprContext;
import generated.LogicParser.ImplicationExprContext;
import generated.LogicParser.OrExprContext;
import generated.LogicParser.ParExprContext;
import generated.LogicParser.UnExprContext;
import generated.LogicParser.VarExpressionContext;

public abstract class LogicAdapter implements LogicListener {

	@Override
	public void enterEveryRule(ParserRuleContext arg0) {

	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {

	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {

	}

	@Override
	public void visitTerminal(TerminalNode arg0) {

	}

	@Override
	public void enterParExpr(ParExprContext ctx) {

	}

	@Override
	public void exitParExpr(ParExprContext ctx) {

	}

	@Override
	public void enterImplicationExpr(ImplicationExprContext ctx) {

	}

	@Override
	public void exitImplicationExpr(ImplicationExprContext ctx) {

	}

	@Override
	public void enterVarExpression(VarExpressionContext ctx) {

	}

	@Override
	public void exitVarExpression(VarExpressionContext ctx) {

	}

	@Override
	public void enterUnExpr(UnExprContext ctx) {

	}

	@Override
	public void exitUnExpr(UnExprContext ctx) {

	}

	@Override
	public void enterOrExpr(OrExprContext ctx) {

	}

	@Override
	public void exitOrExpr(OrExprContext ctx) {

	}

	@Override
	public void enterAndExpr(AndExprContext ctx) {

	}

	@Override
	public void exitAndExpr(AndExprContext ctx) {

	}

}