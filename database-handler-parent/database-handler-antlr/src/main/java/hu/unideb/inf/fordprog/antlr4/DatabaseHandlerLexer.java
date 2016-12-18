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
		AND=9, OR=10, EQ=11, LTH=12, GTH=13, NOT_EQ=14, NOT=15, LOGICAL=16, COLUMN_TPYE=17, 
		LKPAR=18, RKPAR=19, LPAR=20, RPAR=21, SEMICOLON=22, COMA=23, ASTERIX=24, 
		ID=25, CHAR=26, WS=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CREATE", "TABLE", "INSERT", "INTO", "VALUES", "SELECT", "FROM", "WHERE", 
		"AND", "OR", "EQ", "LTH", "GTH", "NOT_EQ", "NOT", "LOGICAL", "COLUMN_TPYE", 
		"LKPAR", "RKPAR", "LPAR", "RPAR", "SEMICOLON", "COMA", "ASTERIX", "ID", 
		"CHAR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "'='", 
		"'<'", "'>'", "'!='", "'not'", null, null, "'{'", "'}'", "'('", "')'", 
		"';'", "','", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CREATE", "TABLE", "INSERT", "INTO", "VALUES", "SELECT", "FROM", 
		"WHERE", "AND", "OR", "EQ", "LTH", "GTH", "NOT_EQ", "NOT", "LOGICAL", 
		"COLUMN_TPYE", "LKPAR", "RKPAR", "LPAR", "RPAR", "SEMICOLON", "COMA", 
		"ASTERIX", "ID", "CHAR", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00f5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\5\2F\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3R\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4`\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5j\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6x\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u0086\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0090\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009c\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00a6\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ae\n\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\5\21"+
		"\u00bf\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00d2\n\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\7\32\u00e4\n\32\f\32"+
		"\16\32\u00e7\13\32\3\33\7\33\u00ea\n\33\f\33\16\33\u00ed\13\33\3\34\6"+
		"\34\u00f0\n\34\r\34\16\34\u00f1\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\6\5\2C\\aac|\6\2\62;C\\a"+
		"ac|\b\2))/\60\62;C\\aac|\5\2\13\f\17\17\"\"\u0106\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\3E\3\2\2\2\5Q\3\2\2\2\7_\3\2\2\2\ti\3"+
		"\2\2\2\13w\3\2\2\2\r\u0085\3\2\2\2\17\u008f\3\2\2\2\21\u009b\3\2\2\2\23"+
		"\u00a5\3\2\2\2\25\u00ad\3\2\2\2\27\u00af\3\2\2\2\31\u00b1\3\2\2\2\33\u00b3"+
		"\3\2\2\2\35\u00b5\3\2\2\2\37\u00b8\3\2\2\2!\u00be\3\2\2\2#\u00d1\3\2\2"+
		"\2%\u00d3\3\2\2\2\'\u00d5\3\2\2\2)\u00d7\3\2\2\2+\u00d9\3\2\2\2-\u00db"+
		"\3\2\2\2/\u00dd\3\2\2\2\61\u00df\3\2\2\2\63\u00e1\3\2\2\2\65\u00eb\3\2"+
		"\2\2\67\u00ef\3\2\2\29:\7e\2\2:;\7t\2\2;<\7g\2\2<=\7c\2\2=>\7v\2\2>F\7"+
		"g\2\2?@\7E\2\2@A\7T\2\2AB\7G\2\2BC\7C\2\2CD\7V\2\2DF\7G\2\2E9\3\2\2\2"+
		"E?\3\2\2\2F\4\3\2\2\2GH\7v\2\2HI\7c\2\2IJ\7d\2\2JK\7n\2\2KR\7g\2\2LM\7"+
		"V\2\2MN\7C\2\2NO\7D\2\2OP\7N\2\2PR\7G\2\2QG\3\2\2\2QL\3\2\2\2R\6\3\2\2"+
		"\2ST\7k\2\2TU\7p\2\2UV\7u\2\2VW\7g\2\2WX\7t\2\2X`\7v\2\2YZ\7K\2\2Z[\7"+
		"P\2\2[\\\7U\2\2\\]\7G\2\2]^\7T\2\2^`\7V\2\2_S\3\2\2\2_Y\3\2\2\2`\b\3\2"+
		"\2\2ab\7k\2\2bc\7p\2\2cd\7v\2\2dj\7q\2\2ef\7K\2\2fg\7P\2\2gh\7V\2\2hj"+
		"\7Q\2\2ia\3\2\2\2ie\3\2\2\2j\n\3\2\2\2kl\7x\2\2lm\7c\2\2mn\7n\2\2no\7"+
		"w\2\2op\7g\2\2px\7u\2\2qr\7X\2\2rs\7C\2\2st\7N\2\2tu\7W\2\2uv\7G\2\2v"+
		"x\7U\2\2wk\3\2\2\2wq\3\2\2\2x\f\3\2\2\2yz\7u\2\2z{\7g\2\2{|\7n\2\2|}\7"+
		"g\2\2}~\7e\2\2~\u0086\7v\2\2\177\u0080\7U\2\2\u0080\u0081\7G\2\2\u0081"+
		"\u0082\7N\2\2\u0082\u0083\7G\2\2\u0083\u0084\7E\2\2\u0084\u0086\7V\2\2"+
		"\u0085y\3\2\2\2\u0085\177\3\2\2\2\u0086\16\3\2\2\2\u0087\u0088\7h\2\2"+
		"\u0088\u0089\7t\2\2\u0089\u008a\7q\2\2\u008a\u0090\7o\2\2\u008b\u008c"+
		"\7H\2\2\u008c\u008d\7T\2\2\u008d\u008e\7Q\2\2\u008e\u0090\7O\2\2\u008f"+
		"\u0087\3\2\2\2\u008f\u008b\3\2\2\2\u0090\20\3\2\2\2\u0091\u0092\7y\2\2"+
		"\u0092\u0093\7j\2\2\u0093\u0094\7g\2\2\u0094\u0095\7t\2\2\u0095\u009c"+
		"\7g\2\2\u0096\u0097\7Y\2\2\u0097\u0098\7J\2\2\u0098\u0099\7G\2\2\u0099"+
		"\u009a\7T\2\2\u009a\u009c\7G\2\2\u009b\u0091\3\2\2\2\u009b\u0096\3\2\2"+
		"\2\u009c\22\3\2\2\2\u009d\u009e\7c\2\2\u009e\u009f\7p\2\2\u009f\u00a6"+
		"\7f\2\2\u00a0\u00a1\7C\2\2\u00a1\u00a2\7P\2\2\u00a2\u00a6\7F\2\2\u00a3"+
		"\u00a4\7(\2\2\u00a4\u00a6\7(\2\2\u00a5\u009d\3\2\2\2\u00a5\u00a0\3\2\2"+
		"\2\u00a5\u00a3\3\2\2\2\u00a6\24\3\2\2\2\u00a7\u00a8\7q\2\2\u00a8\u00ae"+
		"\7t\2\2\u00a9\u00aa\7Q\2\2\u00aa\u00ae\7T\2\2\u00ab\u00ac\7~\2\2\u00ac"+
		"\u00ae\7~\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ae\26\3\2\2\2\u00af\u00b0\7?\2\2\u00b0\30\3\2\2\2\u00b1\u00b2"+
		"\7>\2\2\u00b2\32\3\2\2\2\u00b3\u00b4\7@\2\2\u00b4\34\3\2\2\2\u00b5\u00b6"+
		"\7#\2\2\u00b6\u00b7\7?\2\2\u00b7\36\3\2\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba"+
		"\7q\2\2\u00ba\u00bb\7v\2\2\u00bb \3\2\2\2\u00bc\u00bf\5\23\n\2\u00bd\u00bf"+
		"\5\25\13\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\"\3\2\2\2\u00c0"+
		"\u00c1\7x\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7e\2\2"+
		"\u00c4\u00c5\7j\2\2\u00c5\u00c6\7c\2\2\u00c6\u00d2\7t\2\2\u00c7\u00c8"+
		"\7p\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7o\2\2\u00ca\u00cb\7d\2\2\u00cb"+
		"\u00cc\7g\2\2\u00cc\u00d2\7t\2\2\u00cd\u00ce\7f\2\2\u00ce\u00cf\7c\2\2"+
		"\u00cf\u00d0\7v\2\2\u00d0\u00d2\7g\2\2\u00d1\u00c0\3\2\2\2\u00d1\u00c7"+
		"\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d2$\3\2\2\2\u00d3\u00d4\7}\2\2\u00d4&"+
		"\3\2\2\2\u00d5\u00d6\7\177\2\2\u00d6(\3\2\2\2\u00d7\u00d8\7*\2\2\u00d8"+
		"*\3\2\2\2\u00d9\u00da\7+\2\2\u00da,\3\2\2\2\u00db\u00dc\7=\2\2\u00dc."+
		"\3\2\2\2\u00dd\u00de\7.\2\2\u00de\60\3\2\2\2\u00df\u00e0\7,\2\2\u00e0"+
		"\62\3\2\2\2\u00e1\u00e5\t\2\2\2\u00e2\u00e4\t\3\2\2\u00e3\u00e2\3\2\2"+
		"\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\64"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\t\4\2\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\66\3\2\2"+
		"\2\u00ed\u00eb\3\2\2\2\u00ee\u00f0\t\5\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\b\34\2\2\u00f48\3\2\2\2\22\2EQ_iw\u0085\u008f\u009b\u00a5\u00ad"+
		"\u00be\u00d1\u00e5\u00eb\u00f1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}