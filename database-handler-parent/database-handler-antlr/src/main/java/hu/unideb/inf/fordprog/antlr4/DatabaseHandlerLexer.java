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
		DISTINCT=25, LKPAR=26, RKPAR=27, LPAR=28, RPAR=29, SEMICOLON=30, COMA=31, 
		ASTERIX=32, ID=33, CHAR=34, WS=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CREATE", "TABLE", "INSERT", "INTO", "VALUES", "SELECT", "FROM", "WHERE", 
		"AND", "OR", "EQ", "LTH", "GTH", "LTE", "GTE", "NOT_EQ", "NOT", "LOGICAL", 
		"COLUMN_TPYE", "SUM", "AVG", "MIN", "MAX", "COUNT", "DISTINCT", "LKPAR", 
		"RKPAR", "LPAR", "RPAR", "SEMICOLON", "COMA", "ASTERIX", "ID", "CHAR", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "'='", 
		"'<'", "'>'", "'<='", "'>='", "'!='", "'not'", null, null, null, null, 
		null, null, null, null, "'{'", "'}'", "'('", "')'", "';'", "','", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CREATE", "TABLE", "INSERT", "INTO", "VALUES", "SELECT", "FROM", 
		"WHERE", "AND", "OR", "EQ", "LTH", "GTH", "LTE", "GTE", "NOT_EQ", "NOT", 
		"LOGICAL", "COLUMN_TPYE", "SUM", "AVG", "MIN", "MAX", "COUNT", "DISTINCT", 
		"LKPAR", "RKPAR", "LPAR", "RPAR", "SEMICOLON", "COMA", "ASTERIX", "ID", 
		"CHAR", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u0149\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2V\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3b\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4p\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5z\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u0088\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0096"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a0\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u00ac\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00b6\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00be\n\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\5\23\u00d5\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00e8\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u00f0\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00f8\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0100\n\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\5\30\u0108\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u0114\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0126\n\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\7\"\u0138"+
		"\n\"\f\"\16\"\u013b\13\"\3#\7#\u013e\n#\f#\16#\u0141\13#\3$\6$\u0144\n"+
		"$\r$\16$\u0145\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\6\5\2C\\aac|\6\2\62;C\\aa"+
		"c|\b\2))/\60\62;C\\aac|\5\2\13\f\17\17\"\"\u0160\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3U\3\2\2\2\5a\3\2\2"+
		"\2\7o\3\2\2\2\ty\3\2\2\2\13\u0087\3\2\2\2\r\u0095\3\2\2\2\17\u009f\3\2"+
		"\2\2\21\u00ab\3\2\2\2\23\u00b5\3\2\2\2\25\u00bd\3\2\2\2\27\u00bf\3\2\2"+
		"\2\31\u00c1\3\2\2\2\33\u00c3\3\2\2\2\35\u00c5\3\2\2\2\37\u00c8\3\2\2\2"+
		"!\u00cb\3\2\2\2#\u00ce\3\2\2\2%\u00d4\3\2\2\2\'\u00e7\3\2\2\2)\u00ef\3"+
		"\2\2\2+\u00f7\3\2\2\2-\u00ff\3\2\2\2/\u0107\3\2\2\2\61\u0113\3\2\2\2\63"+
		"\u0125\3\2\2\2\65\u0127\3\2\2\2\67\u0129\3\2\2\29\u012b\3\2\2\2;\u012d"+
		"\3\2\2\2=\u012f\3\2\2\2?\u0131\3\2\2\2A\u0133\3\2\2\2C\u0135\3\2\2\2E"+
		"\u013f\3\2\2\2G\u0143\3\2\2\2IJ\7e\2\2JK\7t\2\2KL\7g\2\2LM\7c\2\2MN\7"+
		"v\2\2NV\7g\2\2OP\7E\2\2PQ\7T\2\2QR\7G\2\2RS\7C\2\2ST\7V\2\2TV\7G\2\2U"+
		"I\3\2\2\2UO\3\2\2\2V\4\3\2\2\2WX\7v\2\2XY\7c\2\2YZ\7d\2\2Z[\7n\2\2[b\7"+
		"g\2\2\\]\7V\2\2]^\7C\2\2^_\7D\2\2_`\7N\2\2`b\7G\2\2aW\3\2\2\2a\\\3\2\2"+
		"\2b\6\3\2\2\2cd\7k\2\2de\7p\2\2ef\7u\2\2fg\7g\2\2gh\7t\2\2hp\7v\2\2ij"+
		"\7K\2\2jk\7P\2\2kl\7U\2\2lm\7G\2\2mn\7T\2\2np\7V\2\2oc\3\2\2\2oi\3\2\2"+
		"\2p\b\3\2\2\2qr\7k\2\2rs\7p\2\2st\7v\2\2tz\7q\2\2uv\7K\2\2vw\7P\2\2wx"+
		"\7V\2\2xz\7Q\2\2yq\3\2\2\2yu\3\2\2\2z\n\3\2\2\2{|\7x\2\2|}\7c\2\2}~\7"+
		"n\2\2~\177\7w\2\2\177\u0080\7g\2\2\u0080\u0088\7u\2\2\u0081\u0082\7X\2"+
		"\2\u0082\u0083\7C\2\2\u0083\u0084\7N\2\2\u0084\u0085\7W\2\2\u0085\u0086"+
		"\7G\2\2\u0086\u0088\7U\2\2\u0087{\3\2\2\2\u0087\u0081\3\2\2\2\u0088\f"+
		"\3\2\2\2\u0089\u008a\7u\2\2\u008a\u008b\7g\2\2\u008b\u008c\7n\2\2\u008c"+
		"\u008d\7g\2\2\u008d\u008e\7e\2\2\u008e\u0096\7v\2\2\u008f\u0090\7U\2\2"+
		"\u0090\u0091\7G\2\2\u0091\u0092\7N\2\2\u0092\u0093\7G\2\2\u0093\u0094"+
		"\7E\2\2\u0094\u0096\7V\2\2\u0095\u0089\3\2\2\2\u0095\u008f\3\2\2\2\u0096"+
		"\16\3\2\2\2\u0097\u0098\7h\2\2\u0098\u0099\7t\2\2\u0099\u009a\7q\2\2\u009a"+
		"\u00a0\7o\2\2\u009b\u009c\7H\2\2\u009c\u009d\7T\2\2\u009d\u009e\7Q\2\2"+
		"\u009e\u00a0\7O\2\2\u009f\u0097\3\2\2\2\u009f\u009b\3\2\2\2\u00a0\20\3"+
		"\2\2\2\u00a1\u00a2\7y\2\2\u00a2\u00a3\7j\2\2\u00a3\u00a4\7g\2\2\u00a4"+
		"\u00a5\7t\2\2\u00a5\u00ac\7g\2\2\u00a6\u00a7\7Y\2\2\u00a7\u00a8\7J\2\2"+
		"\u00a8\u00a9\7G\2\2\u00a9\u00aa\7T\2\2\u00aa\u00ac\7G\2\2\u00ab\u00a1"+
		"\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ac\22\3\2\2\2\u00ad\u00ae\7c\2\2\u00ae"+
		"\u00af\7p\2\2\u00af\u00b6\7f\2\2\u00b0\u00b1\7C\2\2\u00b1\u00b2\7P\2\2"+
		"\u00b2\u00b6\7F\2\2\u00b3\u00b4\7(\2\2\u00b4\u00b6\7(\2\2\u00b5\u00ad"+
		"\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\24\3\2\2\2\u00b7"+
		"\u00b8\7q\2\2\u00b8\u00be\7t\2\2\u00b9\u00ba\7Q\2\2\u00ba\u00be\7T\2\2"+
		"\u00bb\u00bc\7~\2\2\u00bc\u00be\7~\2\2\u00bd\u00b7\3\2\2\2\u00bd\u00b9"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\26\3\2\2\2\u00bf\u00c0\7?\2\2\u00c0"+
		"\30\3\2\2\2\u00c1\u00c2\7>\2\2\u00c2\32\3\2\2\2\u00c3\u00c4\7@\2\2\u00c4"+
		"\34\3\2\2\2\u00c5\u00c6\7>\2\2\u00c6\u00c7\7?\2\2\u00c7\36\3\2\2\2\u00c8"+
		"\u00c9\7@\2\2\u00c9\u00ca\7?\2\2\u00ca \3\2\2\2\u00cb\u00cc\7#\2\2\u00cc"+
		"\u00cd\7?\2\2\u00cd\"\3\2\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7q\2\2\u00d0"+
		"\u00d1\7v\2\2\u00d1$\3\2\2\2\u00d2\u00d5\5\23\n\2\u00d3\u00d5\5\25\13"+
		"\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5&\3\2\2\2\u00d6\u00d7"+
		"\7x\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7e\2\2\u00da"+
		"\u00db\7j\2\2\u00db\u00dc\7c\2\2\u00dc\u00e8\7t\2\2\u00dd\u00de\7p\2\2"+
		"\u00de\u00df\7w\2\2\u00df\u00e0\7o\2\2\u00e0\u00e1\7d\2\2\u00e1\u00e2"+
		"\7g\2\2\u00e2\u00e8\7t\2\2\u00e3\u00e4\7f\2\2\u00e4\u00e5\7c\2\2\u00e5"+
		"\u00e6\7v\2\2\u00e6\u00e8\7g\2\2\u00e7\u00d6\3\2\2\2\u00e7\u00dd\3\2\2"+
		"\2\u00e7\u00e3\3\2\2\2\u00e8(\3\2\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7"+
		"w\2\2\u00eb\u00f0\7o\2\2\u00ec\u00ed\7U\2\2\u00ed\u00ee\7W\2\2\u00ee\u00f0"+
		"\7O\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00ec\3\2\2\2\u00f0*\3\2\2\2\u00f1\u00f2"+
		"\7c\2\2\u00f2\u00f3\7x\2\2\u00f3\u00f8\7i\2\2\u00f4\u00f5\7C\2\2\u00f5"+
		"\u00f6\7X\2\2\u00f6\u00f8\7I\2\2\u00f7\u00f1\3\2\2\2\u00f7\u00f4\3\2\2"+
		"\2\u00f8,\3\2\2\2\u00f9\u00fa\7o\2\2\u00fa\u00fb\7k\2\2\u00fb\u0100\7"+
		"p\2\2\u00fc\u00fd\7O\2\2\u00fd\u00fe\7K\2\2\u00fe\u0100\7P\2\2\u00ff\u00f9"+
		"\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100.\3\2\2\2\u0101\u0102\7o\2\2\u0102\u0103"+
		"\7c\2\2\u0103\u0108\7z\2\2\u0104\u0105\7O\2\2\u0105\u0106\7C\2\2\u0106"+
		"\u0108\7Z\2\2\u0107\u0101\3\2\2\2\u0107\u0104\3\2\2\2\u0108\60\3\2\2\2"+
		"\u0109\u010a\7e\2\2\u010a\u010b\7q\2\2\u010b\u010c\7w\2\2\u010c\u010d"+
		"\7p\2\2\u010d\u0114\7v\2\2\u010e\u010f\7E\2\2\u010f\u0110\7Q\2\2\u0110"+
		"\u0111\7W\2\2\u0111\u0112\7P\2\2\u0112\u0114\7V\2\2\u0113\u0109\3\2\2"+
		"\2\u0113\u010e\3\2\2\2\u0114\62\3\2\2\2\u0115\u0116\7f\2\2\u0116\u0117"+
		"\7k\2\2\u0117\u0118\7u\2\2\u0118\u0119\7v\2\2\u0119\u011a\7k\2\2\u011a"+
		"\u011b\7p\2\2\u011b\u011c\7e\2\2\u011c\u0126\7v\2\2\u011d\u011e\7F\2\2"+
		"\u011e\u011f\7K\2\2\u011f\u0120\7U\2\2\u0120\u0121\7V\2\2\u0121\u0122"+
		"\7K\2\2\u0122\u0123\7P\2\2\u0123\u0124\7E\2\2\u0124\u0126\7V\2\2\u0125"+
		"\u0115\3\2\2\2\u0125\u011d\3\2\2\2\u0126\64\3\2\2\2\u0127\u0128\7}\2\2"+
		"\u0128\66\3\2\2\2\u0129\u012a\7\177\2\2\u012a8\3\2\2\2\u012b\u012c\7*"+
		"\2\2\u012c:\3\2\2\2\u012d\u012e\7+\2\2\u012e<\3\2\2\2\u012f\u0130\7=\2"+
		"\2\u0130>\3\2\2\2\u0131\u0132\7.\2\2\u0132@\3\2\2\2\u0133\u0134\7,\2\2"+
		"\u0134B\3\2\2\2\u0135\u0139\t\2\2\2\u0136\u0138\t\3\2\2\u0137\u0136\3"+
		"\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"D\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013e\t\4\2\2\u013d\u013c\3\2\2\2"+
		"\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140F\3"+
		"\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144\t\5\2\2\u0143\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u0148\b$\2\2\u0148H\3\2\2\2\30\2Uaoy\u0087\u0095\u009f\u00ab"+
		"\u00b5\u00bd\u00d4\u00e7\u00ef\u00f7\u00ff\u0107\u0113\u0125\u0139\u013f"+
		"\u0145\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}