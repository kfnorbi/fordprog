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
		CREATE=1, TABLE=2, INSERT=3, INTO=4, VALUES=5, SELECT=6, FROM=7, WHERE=8, 
		AND=9, OR=10, EQ=11, LTH=12, GTH=13, LTE=14, GTE=15, NOT_EQ=16, NOT=17, 
		LOGICAL=18, COLUMN_TPYE=19, SUM=20, AVG=21, MIN=22, MAX=23, COUNT=24, 
		LKPAR=25, RKPAR=26, LPAR=27, RPAR=28, SEMICOLON=29, COMA=30, ASTERIX=31, 
		ID=32, CHAR=33, WS=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CREATE", "TABLE", "INSERT", "INTO", "VALUES", "SELECT", "FROM", "WHERE", 
		"AND", "OR", "EQ", "LTH", "GTH", "LTE", "GTE", "NOT_EQ", "NOT", "LOGICAL", 
		"COLUMN_TPYE", "SUM", "AVG", "MIN", "MAX", "COUNT", "LKPAR", "RKPAR", 
		"LPAR", "RPAR", "SEMICOLON", "COMA", "ASTERIX", "ID", "CHAR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "'='", 
		"'<'", "'>'", "'<='", "'>='", "'!='", "'not'", null, null, null, null, 
		null, null, null, "'{'", "'}'", "'('", "')'", "';'", "','", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CREATE", "TABLE", "INSERT", "INTO", "VALUES", "SELECT", "FROM", 
		"WHERE", "AND", "OR", "EQ", "LTH", "GTH", "LTE", "GTE", "NOT_EQ", "NOT", 
		"LOGICAL", "COLUMN_TPYE", "SUM", "AVG", "MIN", "MAX", "COUNT", "LKPAR", 
		"RKPAR", "LPAR", "RPAR", "SEMICOLON", "COMA", "ASTERIX", "ID", "CHAR", 
		"WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u0135\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2"+
		"T\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3`\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4n\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5x\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0086"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0094\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009e\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00aa\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b4\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00bc\n\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\5\23\u00d3\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00e6\n\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u00ee\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00f6"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00fe\n\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0106\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0112\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\7!\u0124\n!\f!\16!\u0127\13!\3\"\7\"\u012a\n\""+
		"\f\"\16\"\u012d\13\"\3#\6#\u0130\n#\r#\16#\u0131\3#\3#\2\2$\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\b\2))/\60\62;C\\aac|\5\2\13\f\17\17"+
		"\"\"\u014b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\3S\3\2\2\2\5_\3\2\2\2\7m\3\2\2\2\tw\3\2\2\2\13\u0085\3\2\2\2\r\u0093"+
		"\3\2\2\2\17\u009d\3\2\2\2\21\u00a9\3\2\2\2\23\u00b3\3\2\2\2\25\u00bb\3"+
		"\2\2\2\27\u00bd\3\2\2\2\31\u00bf\3\2\2\2\33\u00c1\3\2\2\2\35\u00c3\3\2"+
		"\2\2\37\u00c6\3\2\2\2!\u00c9\3\2\2\2#\u00cc\3\2\2\2%\u00d2\3\2\2\2\'\u00e5"+
		"\3\2\2\2)\u00ed\3\2\2\2+\u00f5\3\2\2\2-\u00fd\3\2\2\2/\u0105\3\2\2\2\61"+
		"\u0111\3\2\2\2\63\u0113\3\2\2\2\65\u0115\3\2\2\2\67\u0117\3\2\2\29\u0119"+
		"\3\2\2\2;\u011b\3\2\2\2=\u011d\3\2\2\2?\u011f\3\2\2\2A\u0121\3\2\2\2C"+
		"\u012b\3\2\2\2E\u012f\3\2\2\2GH\7e\2\2HI\7t\2\2IJ\7g\2\2JK\7c\2\2KL\7"+
		"v\2\2LT\7g\2\2MN\7E\2\2NO\7T\2\2OP\7G\2\2PQ\7C\2\2QR\7V\2\2RT\7G\2\2S"+
		"G\3\2\2\2SM\3\2\2\2T\4\3\2\2\2UV\7v\2\2VW\7c\2\2WX\7d\2\2XY\7n\2\2Y`\7"+
		"g\2\2Z[\7V\2\2[\\\7C\2\2\\]\7D\2\2]^\7N\2\2^`\7G\2\2_U\3\2\2\2_Z\3\2\2"+
		"\2`\6\3\2\2\2ab\7k\2\2bc\7p\2\2cd\7u\2\2de\7g\2\2ef\7t\2\2fn\7v\2\2gh"+
		"\7K\2\2hi\7P\2\2ij\7U\2\2jk\7G\2\2kl\7T\2\2ln\7V\2\2ma\3\2\2\2mg\3\2\2"+
		"\2n\b\3\2\2\2op\7k\2\2pq\7p\2\2qr\7v\2\2rx\7q\2\2st\7K\2\2tu\7P\2\2uv"+
		"\7V\2\2vx\7Q\2\2wo\3\2\2\2ws\3\2\2\2x\n\3\2\2\2yz\7x\2\2z{\7c\2\2{|\7"+
		"n\2\2|}\7w\2\2}~\7g\2\2~\u0086\7u\2\2\177\u0080\7X\2\2\u0080\u0081\7C"+
		"\2\2\u0081\u0082\7N\2\2\u0082\u0083\7W\2\2\u0083\u0084\7G\2\2\u0084\u0086"+
		"\7U\2\2\u0085y\3\2\2\2\u0085\177\3\2\2\2\u0086\f\3\2\2\2\u0087\u0088\7"+
		"u\2\2\u0088\u0089\7g\2\2\u0089\u008a\7n\2\2\u008a\u008b\7g\2\2\u008b\u008c"+
		"\7e\2\2\u008c\u0094\7v\2\2\u008d\u008e\7U\2\2\u008e\u008f\7G\2\2\u008f"+
		"\u0090\7N\2\2\u0090\u0091\7G\2\2\u0091\u0092\7E\2\2\u0092\u0094\7V\2\2"+
		"\u0093\u0087\3\2\2\2\u0093\u008d\3\2\2\2\u0094\16\3\2\2\2\u0095\u0096"+
		"\7h\2\2\u0096\u0097\7t\2\2\u0097\u0098\7q\2\2\u0098\u009e\7o\2\2\u0099"+
		"\u009a\7H\2\2\u009a\u009b\7T\2\2\u009b\u009c\7Q\2\2\u009c\u009e\7O\2\2"+
		"\u009d\u0095\3\2\2\2\u009d\u0099\3\2\2\2\u009e\20\3\2\2\2\u009f\u00a0"+
		"\7y\2\2\u00a0\u00a1\7j\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7t\2\2\u00a3"+
		"\u00aa\7g\2\2\u00a4\u00a5\7Y\2\2\u00a5\u00a6\7J\2\2\u00a6\u00a7\7G\2\2"+
		"\u00a7\u00a8\7T\2\2\u00a8\u00aa\7G\2\2\u00a9\u009f\3\2\2\2\u00a9\u00a4"+
		"\3\2\2\2\u00aa\22\3\2\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7p\2\2\u00ad"+
		"\u00b4\7f\2\2\u00ae\u00af\7C\2\2\u00af\u00b0\7P\2\2\u00b0\u00b4\7F\2\2"+
		"\u00b1\u00b2\7(\2\2\u00b2\u00b4\7(\2\2\u00b3\u00ab\3\2\2\2\u00b3\u00ae"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\24\3\2\2\2\u00b5\u00b6\7q\2\2\u00b6"+
		"\u00bc\7t\2\2\u00b7\u00b8\7Q\2\2\u00b8\u00bc\7T\2\2\u00b9\u00ba\7~\2\2"+
		"\u00ba\u00bc\7~\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bc\26\3\2\2\2\u00bd\u00be\7?\2\2\u00be\30\3\2\2\2\u00bf\u00c0"+
		"\7>\2\2\u00c0\32\3\2\2\2\u00c1\u00c2\7@\2\2\u00c2\34\3\2\2\2\u00c3\u00c4"+
		"\7>\2\2\u00c4\u00c5\7?\2\2\u00c5\36\3\2\2\2\u00c6\u00c7\7@\2\2\u00c7\u00c8"+
		"\7?\2\2\u00c8 \3\2\2\2\u00c9\u00ca\7#\2\2\u00ca\u00cb\7?\2\2\u00cb\"\3"+
		"\2\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7v\2\2\u00cf"+
		"$\3\2\2\2\u00d0\u00d3\5\23\n\2\u00d1\u00d3\5\25\13\2\u00d2\u00d0\3\2\2"+
		"\2\u00d2\u00d1\3\2\2\2\u00d3&\3\2\2\2\u00d4\u00d5\7x\2\2\u00d5\u00d6\7"+
		"c\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7e\2\2\u00d8\u00d9\7j\2\2\u00d9\u00da"+
		"\7c\2\2\u00da\u00e6\7t\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7w\2\2\u00dd"+
		"\u00de\7o\2\2\u00de\u00df\7d\2\2\u00df\u00e0\7g\2\2\u00e0\u00e6\7t\2\2"+
		"\u00e1\u00e2\7f\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e6"+
		"\7g\2\2\u00e5\u00d4\3\2\2\2\u00e5\u00db\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e6"+
		"(\3\2\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ee\7o\2\2\u00ea"+
		"\u00eb\7U\2\2\u00eb\u00ec\7W\2\2\u00ec\u00ee\7O\2\2\u00ed\u00e7\3\2\2"+
		"\2\u00ed\u00ea\3\2\2\2\u00ee*\3\2\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7"+
		"x\2\2\u00f1\u00f6\7i\2\2\u00f2\u00f3\7C\2\2\u00f3\u00f4\7X\2\2\u00f4\u00f6"+
		"\7I\2\2\u00f5\u00ef\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f6,\3\2\2\2\u00f7\u00f8"+
		"\7o\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fe\7p\2\2\u00fa\u00fb\7O\2\2\u00fb"+
		"\u00fc\7K\2\2\u00fc\u00fe\7P\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00fa\3\2\2"+
		"\2\u00fe.\3\2\2\2\u00ff\u0100\7o\2\2\u0100\u0101\7c\2\2\u0101\u0106\7"+
		"z\2\2\u0102\u0103\7O\2\2\u0103\u0104\7C\2\2\u0104\u0106\7Z\2\2\u0105\u00ff"+
		"\3\2\2\2\u0105\u0102\3\2\2\2\u0106\60\3\2\2\2\u0107\u0108\7e\2\2\u0108"+
		"\u0109\7q\2\2\u0109\u010a\7w\2\2\u010a\u010b\7p\2\2\u010b\u0112\7v\2\2"+
		"\u010c\u010d\7E\2\2\u010d\u010e\7Q\2\2\u010e\u010f\7W\2\2\u010f\u0110"+
		"\7P\2\2\u0110\u0112\7V\2\2\u0111\u0107\3\2\2\2\u0111\u010c\3\2\2\2\u0112"+
		"\62\3\2\2\2\u0113\u0114\7}\2\2\u0114\64\3\2\2\2\u0115\u0116\7\177\2\2"+
		"\u0116\66\3\2\2\2\u0117\u0118\7*\2\2\u01188\3\2\2\2\u0119\u011a\7+\2\2"+
		"\u011a:\3\2\2\2\u011b\u011c\7=\2\2\u011c<\3\2\2\2\u011d\u011e\7.\2\2\u011e"+
		">\3\2\2\2\u011f\u0120\7,\2\2\u0120@\3\2\2\2\u0121\u0125\t\2\2\2\u0122"+
		"\u0124\t\3\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126B\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012a"+
		"\t\4\2\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012cD\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0130\t\5\2\2"+
		"\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\b#\2\2\u0134F\3\2\2\2\27\2S_"+
		"mw\u0085\u0093\u009d\u00a9\u00b3\u00bb\u00d2\u00e5\u00ed\u00f5\u00fd\u0105"+
		"\u0111\u0125\u012b\u0131\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}