package hu.deik.fordprog.semantics;

import generated.LogicBaseListener;
import generated.LogicParser.VarExprContext;

public class LogicVariableDeclaratorListener extends LogicBaseListener {

	@Override
	public void enterVarExpr(VarExprContext ctx) {
		super.enterVarExpr(ctx);
	}

}
