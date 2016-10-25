package hu.unideb.inf.fordprog;

import java.io.FileNotFoundException;

import hu.unideb.inf.fordprog.library.State;
import hu.unideb.inf.fordprog.library.StateMatrix;
import hu.unideb.inf.fordprog.library.StateTransitionMethod;
import hu.unideb.inf.fordprog.library.UnsatisfiedRuleException;
import hu.unideb.inf.fordprog.library.parser.ParseException;

public class SevenStateTransitionMethod<T> implements StateTransitionMethod<T> {

	private StateMatrix<T> stateMatrix;

	public SevenStateTransitionMethod(String fileName) throws FileNotFoundException,ParseException {
		stateMatrix = new StateMatrix<T>(fileName);
	}

	@Override
	public State transition(State actualState, T input) throws UnsatisfiedRuleException {
		return stateMatrix.transition(actualState, input);
	}

	@Override
	public State getStartState() {
		return stateMatrix.getStartState();
	}

}
