package hu.deik.fordprog.semantics;

import java.util.HashMap;
import java.util.Map;

import hu.deik.fordprog.Token;
import hu.deik.fordprog.TokenType;
import hu.deik.fordprog.semantics.logic.Indent;
import hu.deik.fordprog.semantics.logic.InvalidParenthesisException;
import hu.deik.fordprog.semantics.logic.LeftParenthesis;
import hu.deik.fordprog.semantics.logic.ParenthesisValidator;
import hu.deik.fordprog.semantics.logic.RightParenthesis;

public abstract class RDPState {

	@SuppressWarnings("unused")
	protected RDPState previous;

	public Map<TokenType, Class<? extends RDPState>> getTokenMatchers(){
		Map<TokenType, Class<? extends RDPState>> state = new HashMap<>();
		state.put(TokenType.INDENT, Indent.class);
		return buildTokenMap(state);
	}
	
	public abstract Map<TokenType, Class<? extends RDPState>> buildTokenMap(Map<TokenType, Class<? extends RDPState>> map); 

	public RDPState getMatchingState(TokenType type) {
		try {
			return getTokenMatchers().get(type).newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			return null;
		}
	}

	public boolean matches(TokenType input) {
		return getTokenMatchers().containsKey(input);
	}

	public RDPState nextState(RDPState previous, Token token, ParenthesisValidator validator)
			throws InvalidParenthesisException {
		RDPState state = getMatchingState(token.getType());
		state.previous = this;
		if (token.getType() == TokenType.LEFTPARENTHESIS) {
			validator.openParenthesis();
		} else if (token.getType() == TokenType.RIGHTPARENTHESIS) {
			validator.closeParenthesis();
		}
		return state;

	}

	public abstract boolean isTerminal();

}
