// Generated from DatabaseHandler.g4 by ANTLR 4.5.3

package hu.unideb.inf.fordprog.antlr4;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DatabaseHandlerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, TABLE=2, INSERT=3, INTO=4, VALUES=5, COLUMN_TPYE=6, LKPAR=7, 
		RKPAR=8, LPAR=9, RPAR=10, SEMICOLON=11, COMA=12, ID=13, CHAR=14, WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CREATE", "TABLE", "INSERT", "INTO", "VALUES", "COLUMN_TPYE", "LKPAR", 
		"RKPAR", "LPAR", "RPAR", "SEMICOLON", "COMA", "ID", "CHAR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'{'", "'}'", "'('", "')'", 
		"';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CREATE", "TABLE", "INSERT", "INTO", "VALUES", "COLUMN_TPYE", "LKPAR", 
		"RKPAR", "LPAR", "RPAR", "SEMICOLON", "COMA", "ID", "CHAR", "WS"
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


	public DatabaseHandlerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DatabaseHandler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u0094\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2.\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4H\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6`\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7s\n\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\7\16\u0083\n\16\f\16\16\16\u0086"+
		"\13\16\3\17\7\17\u0089\n\17\f\17\16\17\u008c\13\17\3\20\6\20\u008f\n\20"+
		"\r\20\16\20\u0090\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\6\5\2C\\aac|\6\2\62;C\\a"+
		"ac|\7\2))\62;C\\aac|\5\2\13\f\17\17\"\"\u009d\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\3-\3\2\2\2\59\3\2\2\2\7G\3\2\2\2\tQ\3\2\2"+
		"\2\13_\3\2\2\2\rr\3\2\2\2\17t\3\2\2\2\21v\3\2\2\2\23x\3\2\2\2\25z\3\2"+
		"\2\2\27|\3\2\2\2\31~\3\2\2\2\33\u0080\3\2\2\2\35\u008a\3\2\2\2\37\u008e"+
		"\3\2\2\2!\"\7e\2\2\"#\7t\2\2#$\7g\2\2$%\7c\2\2%&\7v\2\2&.\7g\2\2\'(\7"+
		"E\2\2()\7T\2\2)*\7G\2\2*+\7C\2\2+,\7V\2\2,.\7G\2\2-!\3\2\2\2-\'\3\2\2"+
		"\2.\4\3\2\2\2/\60\7v\2\2\60\61\7c\2\2\61\62\7d\2\2\62\63\7n\2\2\63:\7"+
		"g\2\2\64\65\7V\2\2\65\66\7C\2\2\66\67\7D\2\2\678\7N\2\28:\7G\2\29/\3\2"+
		"\2\29\64\3\2\2\2:\6\3\2\2\2;<\7k\2\2<=\7p\2\2=>\7u\2\2>?\7g\2\2?@\7t\2"+
		"\2@H\7v\2\2AB\7K\2\2BC\7P\2\2CD\7U\2\2DE\7G\2\2EF\7T\2\2FH\7V\2\2G;\3"+
		"\2\2\2GA\3\2\2\2H\b\3\2\2\2IJ\7k\2\2JK\7p\2\2KL\7v\2\2LR\7q\2\2MN\7K\2"+
		"\2NO\7P\2\2OP\7V\2\2PR\7Q\2\2QI\3\2\2\2QM\3\2\2\2R\n\3\2\2\2ST\7x\2\2"+
		"TU\7c\2\2UV\7n\2\2VW\7w\2\2WX\7g\2\2X`\7u\2\2YZ\7X\2\2Z[\7C\2\2[\\\7N"+
		"\2\2\\]\7W\2\2]^\7G\2\2^`\7U\2\2_S\3\2\2\2_Y\3\2\2\2`\f\3\2\2\2ab\7x\2"+
		"\2bc\7c\2\2cd\7t\2\2de\7e\2\2ef\7j\2\2fg\7c\2\2gs\7t\2\2hi\7p\2\2ij\7"+
		"w\2\2jk\7o\2\2kl\7d\2\2lm\7g\2\2ms\7t\2\2no\7f\2\2op\7c\2\2pq\7v\2\2q"+
		"s\7g\2\2ra\3\2\2\2rh\3\2\2\2rn\3\2\2\2s\16\3\2\2\2tu\7}\2\2u\20\3\2\2"+
		"\2vw\7\177\2\2w\22\3\2\2\2xy\7*\2\2y\24\3\2\2\2z{\7+\2\2{\26\3\2\2\2|"+
		"}\7=\2\2}\30\3\2\2\2~\177\7.\2\2\177\32\3\2\2\2\u0080\u0084\t\2\2\2\u0081"+
		"\u0083\t\3\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\34\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089"+
		"\t\4\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\36\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f\t\5\2"+
		"\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\20\2\2\u0093 \3\2\2\2\f\2-"+
		"9GQ_r\u0084\u008a\u0090\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}