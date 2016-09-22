package hu.unideb.inf.fordprog.library;

import hu.unideb.inf.fordprog.library.parser.ParseException;

public class Language {
	private Abc abc;
	private StateTransitionMethod<Character> method;

	public Language(Abc abc, StateTransitionMethod<Character> method) {
		this.abc = abc;
		this.method = method;
	}

	public ParseResult<Character> parse(String sample) {
		ParseResult<Character> parseResult = new ParseResult<Character>();

		if (!preCheck(sample)) {
			try {
				State actualState = method.getStartState();
				for (Character c : sample.toCharArray()) {
					parseResult.addResultElement(actualState);
					actualState = method.transition(actualState, c);
				}
			} catch (Throwable t) {
				parseResult.setAccepted(false);
			}
		}else{
			parseResult.setAccepted(false);
		}
		return parseResult;
	}

	private boolean preCheck(String sample) {
		for (Character c : sample.toCharArray()) {
			if (!abc.contains(c)) {
				return false;
			}
		}
		return true;
	}

}
