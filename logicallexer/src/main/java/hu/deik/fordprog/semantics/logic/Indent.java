package hu.deik.fordprog.semantics.logic;

import java.util.Map;

import hu.deik.fordprog.TokenType;
import hu.deik.fordprog.semantics.RDPState;

public class Indent extends RDPState {

	@Override
	public Map<TokenType, Class<? extends RDPState>> getTokenMatchers() {
		return previous.getTokenMatchers();
	}

	@Override
	public boolean isTerminal() {
		return previous.isTerminal();
	}

	@Override
	public Map<TokenType, Class<? extends RDPState>> buildTokenMap(Map<TokenType, Class<? extends RDPState>> map) {
		return previous.buildTokenMap(map);
	}

}
