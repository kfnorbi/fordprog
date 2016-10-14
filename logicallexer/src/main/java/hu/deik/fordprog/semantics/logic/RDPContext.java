package hu.deik.fordprog.semantics.logic;

import hu.deik.fordprog.semantics.RDPState;

public class RDPContext {

	public static RDPState getStartState(){
		return new LeftParenthesis();
	}
	
}
