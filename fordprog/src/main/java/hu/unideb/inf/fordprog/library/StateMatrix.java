package hu.unideb.inf.fordprog.library;

import java.io.FileNotFoundException;
import java.util.Map;

import hu.unideb.inf.fordprog.library.parser.DomRuleParser;
import hu.unideb.inf.fordprog.library.parser.ParseException;
import hu.unideb.inf.fordprog.library.parser.RuleParser;

public class StateMatrix<T> {

	private Map<State, Map<T, State>> matrix;
	private RuleParser<T> parser;

	public StateMatrix(String fileName) throws ParseException, FileNotFoundException {
		this.parser = new DomRuleParser<T>();
		this.matrix = parser.getRules(fileName);
	}

	public State transition(State fromState, T input) throws UnsatisfiedRuleException {

		if (matrix.containsKey(fromState)) {
			Map<T, State> availableStates = matrix.get(fromState);
			if (availableStates.containsKey("" + input)) {
				State state = availableStates.get(""+input);
				return state;
			}
		}

		throw new UnsatisfiedRuleException();
	}

	public State getStartState() {
		return parser.getStartState();
	}

}
