package hu.deik.fordprog.semantics;

import java.util.List;

import hu.deik.fordprog.Token;

public class RDPUtil {

	public static Token beheadList(List<Token> input) {
		return input.remove(0);
	}

}
