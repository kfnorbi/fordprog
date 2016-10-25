// Generated from Telefonszam.g4 by ANTLR 4.5.3

package generated;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TelefonszamLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Plusz=1, INT1=2, INT2=3, INT3=4, INT4=5, INT5=6, INT6=7, INT7=8, INT8=9, 
		INT9=10, Kotojel=11, WS=12, DIGIT=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Plusz", "INT1", "INT2", "INT3", "INT4", "INT5", "INT6", "INT7", "INT8", 
		"INT9", "Kotojel", "WS", "DIGIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", null, null, null, null, null, null, null, null, null, "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Plusz", "INT1", "INT2", "INT3", "INT4", "INT5", "INT6", "INT7", 
		"INT8", "INT9", "Kotojel", "WS", "DIGIT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public TelefonszamLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Telefonszam.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17`\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\6\r"+
		"Y\n\r\r\r\16\rZ\3\r\3\r\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\3\2\4\5\2\f\f\17\17\"\"\3\2\62;`\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t$\3\2\2\2"+
		"\13(\3\2\2\2\r-\3\2\2\2\17\63\3\2\2\2\21:\3\2\2\2\23B\3\2\2\2\25K\3\2"+
		"\2\2\27U\3\2\2\2\31X\3\2\2\2\33^\3\2\2\2\35\36\7-\2\2\36\4\3\2\2\2\37"+
		" \5\33\16\2 \6\3\2\2\2!\"\5\33\16\2\"#\5\33\16\2#\b\3\2\2\2$%\5\33\16"+
		"\2%&\5\33\16\2&\'\5\33\16\2\'\n\3\2\2\2()\5\33\16\2)*\5\33\16\2*+\5\33"+
		"\16\2+,\5\33\16\2,\f\3\2\2\2-.\5\33\16\2./\5\33\16\2/\60\5\33\16\2\60"+
		"\61\5\33\16\2\61\62\5\33\16\2\62\16\3\2\2\2\63\64\5\33\16\2\64\65\5\33"+
		"\16\2\65\66\5\33\16\2\66\67\5\33\16\2\678\5\33\16\289\5\33\16\29\20\3"+
		"\2\2\2:;\5\33\16\2;<\5\33\16\2<=\5\33\16\2=>\5\33\16\2>?\5\33\16\2?@\5"+
		"\33\16\2@A\5\33\16\2A\22\3\2\2\2BC\5\33\16\2CD\5\33\16\2DE\5\33\16\2E"+
		"F\5\33\16\2FG\5\33\16\2GH\5\33\16\2HI\5\33\16\2IJ\5\33\16\2J\24\3\2\2"+
		"\2KL\5\33\16\2LM\5\33\16\2MN\5\33\16\2NO\5\33\16\2OP\5\33\16\2PQ\5\33"+
		"\16\2QR\5\33\16\2RS\5\33\16\2ST\5\33\16\2T\26\3\2\2\2UV\7/\2\2V\30\3\2"+
		"\2\2WY\t\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\b"+
		"\r\2\2]\32\3\2\2\2^_\t\3\2\2_\34\3\2\2\2\4\2Z\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}