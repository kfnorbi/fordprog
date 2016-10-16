package hu.deik.fordprog.semantics.logic;

import java.util.HashMap;
import java.util.Map;

import hu.deik.fordprog.TokenType;
import hu.deik.fordprog.semantics.RDPState;

/**
 * 
 * -
 *
 */
public class Negate extends RDPState {
	@Override
	public boolean isTerminal() {
		return false;
	}

	@Override
	public Map<TokenType, Class<? extends RDPState>> buildTokenMap(Map<TokenType, Class<? extends RDPState>> map) {
		map.put(TokenType.NEGATE, Negate.class);
		map.put(TokenType.VAR, Variable.class);
		map.put(TokenType.LEFTPARENTHESIS, Variable.class);
		return map;
	}

}
