package hu.deik.fordprog.semantics;

import java.util.Map;

import org.omg.CosNaming.IstringHelper;

import hu.deik.fordprog.Token;
import hu.deik.fordprog.TokenType;

public abstract class RDPState {

	protected abstract Map<TokenType, Class<? extends RDPState>> getTokenMatchers();

	public boolean matches(TokenType input) {
		return getTokenMatchers().containsKey(input);
	}

	public RDPState nextState(Token token) {
		try {
			return getTokenMatchers().get(token.getType()).newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			return null;
		}
	}
	
	public abstract boolean isTerminal();

}
