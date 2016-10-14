package hu.deik.fordprog.semantics;

import java.util.List;

import hu.deik.fordprog.Token;
import hu.deik.fordprog.semantics.logic.RDPContext;

public class RDPChecker {

	public RDPChecker() {
	}

	public boolean check(List<Token> input) {
		RDPState state = RDPContext.getStartState();
		for (Token token : input) {
			if (!state.matches(token.getType())) {
				return false;
			}
			state = state.nextState(token);
		}
		if (state.isTerminal()) {
			return true;
		} else {
			return false;
		}
	}

}
