package hu.unideb.inf.fordprog.library.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import hu.unideb.inf.fordprog.library.State;

public class DomRuleParser<T> implements RuleParser<T> {

	private Map<State, Map<T, State>> result;

	private State startState;

	private Map<Integer, State> halfResolvedState;

	public DomRuleParser() {
		result = new HashMap<>();
		halfResolvedState = new HashMap<>();
	}

	private InputStream getFileAsStream(String fileName) {
		InputStream is = this.getClass().getClassLoader().getResourceAsStream(fileName);
		return is;
	}

	@Override
	public Map<State, Map<T, State>> getRules(String ruleFileName) throws FileNotFoundException {
		try {
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder;
			builder = documentBuilderFactory.newDocumentBuilder();
			
			
			InputStream is = getFileAsStream(ruleFileName);
			Document document = builder.parse(is);

			Node node = document.getFirstChild();
			NodeList states = node.getChildNodes();
			for (int i = 0; i < states.getLength(); i++) {
				Node state = states.item(i);
				prepareState(state);
			}

			for (int i = 0; i < states.getLength(); i++) {
				Node state = states.item(i);
				Map<T, State> ruleMap = handleStateRules(state);

				Element element = (Element) state;

				Integer id = Integer.parseInt(element.getAttribute("id"));
				State resolvedState = resolveState(id);
				result.put(resolvedState, ruleMap);
			}

		} catch (ParserConfigurationException | SAXException | IOException e) {
			throw new ParseException(e);
		}
		return result;
	}

	private void prepareState(Node stateNode) {

		State state = new State();
		Element element = (Element) stateNode;

		if (element.hasAttribute("start")) {
			startState = state;
		}

		int id = Integer.parseInt(element.getAttribute("id"));
		state.setId(id);
		halfResolvedState.put(id, state);
	}

	@Override
	public State getStartState() {
		return startState;
	}

	@SuppressWarnings("unchecked")
	public Map<T, State> handleStateRules(Node stateNode) {
		Node rulesWrapper = stateNode.getFirstChild();
		NodeList rules = rulesWrapper.getChildNodes();
		Map<T, State> ruleMap = new HashMap<>();
		for (int i = 0; i < rules.getLength(); i++) {
			Node rule = rules.item(i);
			NodeList attributes = rule.getChildNodes();
			WeakStateTransition<T> transition = new WeakStateTransition<>();
			for (int j = 0; j < attributes.getLength(); j++) {
				Node attribute = attributes.item(j);
				if (attribute.getNodeName().equals("result")) {
					transition.setTo(Integer.parseInt(attribute.getTextContent()));
				} else if (attribute.getNodeName().equals("input")) {
					transition.setInput((T) attribute.getTextContent());
				}
			}
			ruleMap.put(transition.getInput(), resolveState(transition.getTo()));
		}
		return ruleMap;
	}

	private State resolveState(Integer id) {
		return halfResolvedState.get(id);
	}

}