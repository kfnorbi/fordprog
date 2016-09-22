package hu.unideb.inf.fordprog;

import java.io.FileNotFoundException;

import hu.unideb.inf.fordprog.library.State;
import hu.unideb.inf.fordprog.library.StateMatrix;
import hu.unideb.inf.fordprog.library.StateTransitionMethod;
import hu.unideb.inf.fordprog.library.UnsatisfiedRuleException;
import hu.unideb.inf.fordprog.library.parser.ParseException;

public class SevenStateTransitionMethod implements StateTransitionMethod<Character> {

	private StateMatrix<Character> stateMatrix;

	public SevenStateTransitionMethod(String fileName) throws FileNotFoundException,ParseException {
		stateMatrix = new StateMatrix<>(fileName);
	}

	@Override
	public State transition(State actualState, Character input) throws UnsatisfiedRuleException {
		return stateMatrix.transition(actualState, input);
	}

	@Override
	public State getStartState() {
		return stateMatrix.getStartState();
	}

}
