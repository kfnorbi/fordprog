package hu.unideb.inf.fordprog.library.parser;

import java.io.FileNotFoundException;
import java.util.Map;

import hu.unideb.inf.fordprog.library.State;

public interface RuleParser<T> {

	Map<State, Map<T, State>> getRules(String ruleFileName) throws FileNotFoundException;

	State getStartState();
}
