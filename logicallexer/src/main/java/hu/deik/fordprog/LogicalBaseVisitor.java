package hu.deik.fordprog;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import generated.LogicBaseVisitor;
import generated.LogicParser.AndExprContext;
import generated.LogicParser.ImplicationExprContext;
import generated.LogicParser.OrExprContext;
import generated.LogicParser.ParExprContext;
import generated.LogicParser.UnExprContext;
import generated.LogicParser.VarExpressionContext;

public class LogicalBaseVisitor extends LogicBaseVisitor<Boolean> {

	private Map<String, Boolean> memory = new HashMap<>();

	@Override
	public Boolean visitImplicationExpr(ImplicationExprContext ctx) {
		Boolean leftValue = visit(ctx.left);
		Boolean rightValue = visit(ctx.right);
		return (!leftValue) | rightValue;
	}

	private void getVariableValue(String token) {
		Boolean val = null;
		do {
			System.out.println(token + ": ");
			Scanner sc = new Scanner(System.in);
			val = Boolean.parseBoolean(sc.next());
			memory.put(token, val);
		} while (val == null);
	}

	@Override
	public Boolean visitVarExpression(VarExpressionContext ctx) {
		if (!memory.containsKey(ctx.getText())) {
			getVariableValue(ctx.getText());
		}
		return memory.get(ctx.getText());
	}

	@Override
	public Boolean visitOrExpr(OrExprContext ctx) {
		Boolean leftValue = visit(ctx.left);
		Boolean rightValue = visit(ctx.right);
		return leftValue | rightValue;
	}

	@Override
	public Boolean visitAndExpr(AndExprContext ctx) {
		Boolean leftValue = visit(ctx.left);
		Boolean rightValue = visit(ctx.right);
		return rightValue && leftValue;
	}

	@Override
	public Boolean visitUnExpr(UnExprContext ctx) {
		Boolean subExp = visit(ctx.subexpression);
		return !subExp;
	}

	@Override
	public Boolean visitParExpr(ParExprContext ctx) {
		Boolean subexpr = visit(ctx.expr);
		return subexpr;
	}

}
