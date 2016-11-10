package hu.deik.fordprog;
import java.util.Comparator;

import org.antlr.v4.runtime.RuleContext;

import generated.LogicParser.AndExprContext;
import generated.LogicParser.ImplicationExprContext;
import generated.LogicParser.OrExprContext;
import generated.LogicParser.UnExprContext;

public class AntlrContextComparator implements Comparator<RuleContext> {

	@Override
	public int compare(RuleContext o1, RuleContext o2) {
		if (o1 instanceof UnExprContext && (o2 instanceof AndExprContext || o2 instanceof OrExprContext
				|| o2 instanceof ImplicationExprContext)) {
			return 1;
		}
		if (o1 instanceof AndExprContext && (o2 instanceof OrExprContext || o2 instanceof ImplicationExprContext)) {
			return 1;
		}
		if (o1 instanceof OrExprContext && o2 instanceof ImplicationExprContext) {
			return 1;
		}
		return -1;
	}

}
