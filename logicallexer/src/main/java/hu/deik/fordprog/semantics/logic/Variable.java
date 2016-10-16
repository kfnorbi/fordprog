package hu.deik.fordprog.semantics.logic;

import java.util.HashMap;
import java.util.Map;

import hu.deik.fordprog.TokenType;
import hu.deik.fordprog.semantics.RDPState;

/**
 * 
 * VAR
 *
 */
public class Variable extends RDPState {

	@Override
	public boolean isTerminal() {
		return true;
	}

	@Override
	public Map<TokenType, Class<? extends RDPState>> buildTokenMap(Map<TokenType, Class<? extends RDPState>> map) {
		map.put(TokenType.AND, BinaryOperators.class);
		map.put(TokenType.OR, BinaryOperators.class);
		map.put(TokenType.IMPLICATION, BinaryOperators.class);
		map.put(TokenType.RIGHTPARENTHESIS, Variable.class);
		return map;
	}

}
