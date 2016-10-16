package hu.deik.fordprog.semantics;

import java.util.List;

import hu.deik.fordprog.Token;
import hu.deik.fordprog.semantics.logic.InvalidParenthesisException;
import hu.deik.fordprog.semantics.logic.ParenthesisValidator;
import hu.deik.fordprog.semantics.logic.RDPContext;
import hu.deik.fordprog.semantics.logic.RightParenthesis;

public class RDPChecker {

	private ParenthesisValidator validator;
	
	public RDPChecker() {
		validator = new ParenthesisValidator();
	}

	public boolean check(List<Token> input) {
		RDPState state = RDPContext.getStartState();
		for (Token token : input) {
			if (!state.matches(token.getType())) {
				return false;
			}
			try {
				state = state.nextState(state,token,validator);
			} catch (InvalidParenthesisException e) {
				return false;
			}
		}
		if (state.isTerminal() && validator.isClear()) {
			return true;
		} else {
			return false;
		}
	}

}
