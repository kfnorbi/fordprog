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
	public Map<TokenType, Class<? extends RDPState>> getTokenMatchers() {
		Map<TokenType, Class<? extends RDPState>> states = new HashMap<>();

		return states;
	}

	@Override
	public boolean isTerminal() {
		return true;
	}

	@Override
	public Map<TokenType, Class<? extends RDPState>> buildTokenMap(Map<TokenType, Class<? extends RDPState>> map) {
		map.put(TokenType.AND, BinaryOperators.class);
		map.put(TokenType.OR, BinaryOperators.class);
		map.put(TokenType.IMPLICATION, BinaryOperators.class);
		return map;
	}

}
