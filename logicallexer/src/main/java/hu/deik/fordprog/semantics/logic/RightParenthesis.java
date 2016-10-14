package hu.deik.fordprog.semantics.logic;

import java.util.HashMap;
import java.util.Map;

import hu.deik.fordprog.TokenType;
import hu.deik.fordprog.semantics.RDPState;

/**
 * 
 * )
 *
 */
public class RightParenthesis extends RDPState {
	@Override
	protected Map<TokenType, Class<? extends RDPState>> getTokenMatchers() {
		Map<TokenType, Class<? extends RDPState>> states = new HashMap<>();
		states.put(TokenType.AND, BinaryOperators.class);
		states.put(TokenType.OR, BinaryOperators.class);
		states.put(TokenType.IMPLICATION, BinaryOperators.class);
		return states;
	}

	@Override
	public boolean isTerminal() {
		return true;
	}
}
