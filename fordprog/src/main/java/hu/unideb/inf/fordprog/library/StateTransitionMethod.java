package hu.unideb.inf.fordprog.library;

public interface StateTransitionMethod<T> {

	State transition(State actualState, T input) throws UnsatisfiedRuleException;

	State getStartState();
	
}
