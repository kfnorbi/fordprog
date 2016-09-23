package hu.unideb.inf.fordprog.library;

import javax.swing.plaf.ActionMapUIResource;

import hu.unideb.inf.fordprog.library.parser.ParseException;

public class Language {
	private Abc abc;
	private StateTransitionMethod<String> method;

	public Language(Abc abc, StateTransitionMethod<String> method) {
		this.abc = abc;
		this.method = method;
	}

	public ParseResult<String> parse(String sample) {
		ParseResult<String> parseResult = new ParseResult<String>();

		if (!preCheck(sample)) {
			try {
				State actualState = method.getStartState();
				for (Character c : sample.toCharArray()) {
					parseResult.addResultElement(actualState);
					actualState = method.transition(actualState, c.toString());
				}
			} catch (Throwable t) {
				parseResult.setAccepted(false);
			}
		} else {
			parseResult.setAccepted(false);
		}
		
		if (!parseResult.getResult().isEmpty()) {
			if (parseResult.getResult().get(parseResult.getResult().size() - 1).isRejector()) {
				parseResult.setAccepted(false);
			}
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
