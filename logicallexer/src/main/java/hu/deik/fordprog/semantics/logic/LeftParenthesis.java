package hu.deik.fordprog.semantics.logic;

import java.util.HashMap;
import java.util.Map;

import hu.deik.fordprog.TokenType;
import hu.deik.fordprog.semantics.RDPState;


/**
 * 
 * (
 *
 */
public class LeftParenthesis extends RDPState{

	@Override
	protected Map<TokenType, Class<? extends RDPState>> getTokenMatchers() {
		Map<TokenType, Class<? extends RDPState>> states = new HashMap<>();
		states.put(TokenType.NEGATE, Negate.class);
		states.put(TokenType.VAR, Variable.class);
		states.put(TokenType.LEFTPARENTHESIS, LeftParenthesis.class);
		return states;	}

	@Override
	public boolean isTerminal() {
		return false;
	}

}
