package hu.deik.fordprog;

import java.util.Scanner;

import generated.LogicBaseVisitor;
import generated.LogicParser.AndExprContext;
import generated.LogicParser.ImplicationExprContext;
import generated.LogicParser.OrExprContext;
import generated.LogicParser.ParExprContext;
import generated.LogicParser.UnExprContext;
import generated.LogicParser.VariableContext;

public class LogicalBaseVisitor extends LogicBaseVisitor<Boolean> {

	@Override
	public Boolean visitParExpr(ParExprContext ctx) {
		Boolean childValue = visit(ctx.expr);
		return childValue;
	}

	@Override
	public Boolean visitUnExpr(UnExprContext ctx) {
		Boolean childValue = visit(ctx.expr);
		return !childValue;
	}

	@Override
	public Boolean visitImplicationExpr(ImplicationExprContext ctx) {
		Boolean rightExpr = visit(ctx.right);
		Boolean leftExpr = visit(ctx.left);
		return (!leftExpr) & rightExpr;
	}

	@Override
	public Boolean visitOrExpr(OrExprContext ctx) {
		Boolean rightExpr = visit(ctx.right);
		Boolean leftExpr = visit(ctx.left);
		return leftExpr || rightExpr;
	}

	@Override
	public Boolean visitAndExpr(AndExprContext ctx) {
		Boolean rightExpr = visit(ctx.right);
		Boolean leftExpr = visit(ctx.left);
		return leftExpr && rightExpr;
	}

	@SuppressWarnings("resource")
	@Override
	public Boolean visitVariable(VariableContext ctx) {
		System.out.println("visitVariable");
		return false;
	}

}
