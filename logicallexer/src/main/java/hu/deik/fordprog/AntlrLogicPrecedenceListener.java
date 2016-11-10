package hu.deik.fordprog;

import generated.LogicParser.OrExprContext;
import generated.LogicParser.ParExprContext;

public class AntlrLogicPrecedenceListener extends LogicAdapter {

	@Override
	public void enterParExpr(ParExprContext ctx) {
		AntlrContextComparator comparator = new AntlrContextComparator();
		if (comparator.compare(ctx.parent, ctx.expr)<0){
			ctx.children.remove(2);
			ctx.children.remove(0);
		}
	
	}

}