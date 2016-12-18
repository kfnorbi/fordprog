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
		LOGICAL=18, COLUMN_TPYE=19, LKPAR=20, RKPAR=21, LPAR=22, RPAR=23, SEMICOLON=24, 
		COMA=25, ASTERIX=26, ID=27, CHAR=28, WS=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CREATE", "TABLE", "INSERT", "INTO", "VALUES", "SELECT", "FROM", "WHERE", 
		"AND", "OR", "EQ", "LTH", "GTH", "LTE", "GTE", "NOT_EQ", "NOT", "LOGICAL", 
		"COLUMN_TPYE", "LKPAR", "RKPAR", "LPAR", "RPAR", "SEMICOLON", "COMA", 
		"ASTERIX", "ID", "CHAR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "'='", 
		"'<'", "'>'", "'<='", "'>='", "'!='", "'not'", null, null, "'{'", "'}'", 
		"'('", "')'", "';'", "','", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CREATE", "TABLE", "INSERT", "INTO", "VALUES", "SELECT", "FROM", 
		"WHERE", "AND", "OR", "EQ", "LTH", "GTH", "LTE", "GTE", "NOT_EQ", "NOT", 
		"LOGICAL", "COLUMN_TPYE", "LKPAR", "RKPAR", "LPAR", "RPAR", "SEMICOLON", 
		"COMA", "ASTERIX", "ID", "CHAR", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00ff\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2J\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3V\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4d\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5n\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6|\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u008a\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0094"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a0\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u00aa\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00b2\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u00c9\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00dc\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\7\34\u00ee\n\34\f\34\16\34\u00f1\13\34"+
		"\3\35\7\35\u00f4\n\35\f\35\16\35\u00f7\13\35\3\36\6\36\u00fa\n\36\r\36"+
		"\16\36\u00fb\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\b\2))/\60"+
		"\62;C\\aac|\5\2\13\f\17\17\"\"\u0110\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3I\3\2\2\2\5U\3\2\2\2\7c\3\2"+
		"\2\2\tm\3\2\2\2\13{\3\2\2\2\r\u0089\3\2\2\2\17\u0093\3\2\2\2\21\u009f"+
		"\3\2\2\2\23\u00a9\3\2\2\2\25\u00b1\3\2\2\2\27\u00b3\3\2\2\2\31\u00b5\3"+
		"\2\2\2\33\u00b7\3\2\2\2\35\u00b9\3\2\2\2\37\u00bc\3\2\2\2!\u00bf\3\2\2"+
		"\2#\u00c2\3\2\2\2%\u00c8\3\2\2\2\'\u00db\3\2\2\2)\u00dd\3\2\2\2+\u00df"+
		"\3\2\2\2-\u00e1\3\2\2\2/\u00e3\3\2\2\2\61\u00e5\3\2\2\2\63\u00e7\3\2\2"+
		"\2\65\u00e9\3\2\2\2\67\u00eb\3\2\2\29\u00f5\3\2\2\2;\u00f9\3\2\2\2=>\7"+
		"e\2\2>?\7t\2\2?@\7g\2\2@A\7c\2\2AB\7v\2\2BJ\7g\2\2CD\7E\2\2DE\7T\2\2E"+
		"F\7G\2\2FG\7C\2\2GH\7V\2\2HJ\7G\2\2I=\3\2\2\2IC\3\2\2\2J\4\3\2\2\2KL\7"+
		"v\2\2LM\7c\2\2MN\7d\2\2NO\7n\2\2OV\7g\2\2PQ\7V\2\2QR\7C\2\2RS\7D\2\2S"+
		"T\7N\2\2TV\7G\2\2UK\3\2\2\2UP\3\2\2\2V\6\3\2\2\2WX\7k\2\2XY\7p\2\2YZ\7"+
		"u\2\2Z[\7g\2\2[\\\7t\2\2\\d\7v\2\2]^\7K\2\2^_\7P\2\2_`\7U\2\2`a\7G\2\2"+
		"ab\7T\2\2bd\7V\2\2cW\3\2\2\2c]\3\2\2\2d\b\3\2\2\2ef\7k\2\2fg\7p\2\2gh"+
		"\7v\2\2hn\7q\2\2ij\7K\2\2jk\7P\2\2kl\7V\2\2ln\7Q\2\2me\3\2\2\2mi\3\2\2"+
		"\2n\n\3\2\2\2op\7x\2\2pq\7c\2\2qr\7n\2\2rs\7w\2\2st\7g\2\2t|\7u\2\2uv"+
		"\7X\2\2vw\7C\2\2wx\7N\2\2xy\7W\2\2yz\7G\2\2z|\7U\2\2{o\3\2\2\2{u\3\2\2"+
		"\2|\f\3\2\2\2}~\7u\2\2~\177\7g\2\2\177\u0080\7n\2\2\u0080\u0081\7g\2\2"+
		"\u0081\u0082\7e\2\2\u0082\u008a\7v\2\2\u0083\u0084\7U\2\2\u0084\u0085"+
		"\7G\2\2\u0085\u0086\7N\2\2\u0086\u0087\7G\2\2\u0087\u0088\7E\2\2\u0088"+
		"\u008a\7V\2\2\u0089}\3\2\2\2\u0089\u0083\3\2\2\2\u008a\16\3\2\2\2\u008b"+
		"\u008c\7h\2\2\u008c\u008d\7t\2\2\u008d\u008e\7q\2\2\u008e\u0094\7o\2\2"+
		"\u008f\u0090\7H\2\2\u0090\u0091\7T\2\2\u0091\u0092\7Q\2\2\u0092\u0094"+
		"\7O\2\2\u0093\u008b\3\2\2\2\u0093\u008f\3\2\2\2\u0094\20\3\2\2\2\u0095"+
		"\u0096\7y\2\2\u0096\u0097\7j\2\2\u0097\u0098\7g\2\2\u0098\u0099\7t\2\2"+
		"\u0099\u00a0\7g\2\2\u009a\u009b\7Y\2\2\u009b\u009c\7J\2\2\u009c\u009d"+
		"\7G\2\2\u009d\u009e\7T\2\2\u009e\u00a0\7G\2\2\u009f\u0095\3\2\2\2\u009f"+
		"\u009a\3\2\2\2\u00a0\22\3\2\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7p\2\2"+
		"\u00a3\u00aa\7f\2\2\u00a4\u00a5\7C\2\2\u00a5\u00a6\7P\2\2\u00a6\u00aa"+
		"\7F\2\2\u00a7\u00a8\7(\2\2\u00a8\u00aa\7(\2\2\u00a9\u00a1\3\2\2\2\u00a9"+
		"\u00a4\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\24\3\2\2\2\u00ab\u00ac\7q\2\2"+
		"\u00ac\u00b2\7t\2\2\u00ad\u00ae\7Q\2\2\u00ae\u00b2\7T\2\2\u00af\u00b0"+
		"\7~\2\2\u00b0\u00b2\7~\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\26\3\2\2\2\u00b3\u00b4\7?\2\2\u00b4\30\3\2\2\2\u00b5"+
		"\u00b6\7>\2\2\u00b6\32\3\2\2\2\u00b7\u00b8\7@\2\2\u00b8\34\3\2\2\2\u00b9"+
		"\u00ba\7>\2\2\u00ba\u00bb\7?\2\2\u00bb\36\3\2\2\2\u00bc\u00bd\7@\2\2\u00bd"+
		"\u00be\7?\2\2\u00be \3\2\2\2\u00bf\u00c0\7#\2\2\u00c0\u00c1\7?\2\2\u00c1"+
		"\"\3\2\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7v\2\2\u00c5"+
		"$\3\2\2\2\u00c6\u00c9\5\23\n\2\u00c7\u00c9\5\25\13\2\u00c8\u00c6\3\2\2"+
		"\2\u00c8\u00c7\3\2\2\2\u00c9&\3\2\2\2\u00ca\u00cb\7x\2\2\u00cb\u00cc\7"+
		"c\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf\7j\2\2\u00cf\u00d0"+
		"\7c\2\2\u00d0\u00dc\7t\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7w\2\2\u00d3"+
		"\u00d4\7o\2\2\u00d4\u00d5\7d\2\2\u00d5\u00d6\7g\2\2\u00d6\u00dc\7t\2\2"+
		"\u00d7\u00d8\7f\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7v\2\2\u00da\u00dc"+
		"\7g\2\2\u00db\u00ca\3\2\2\2\u00db\u00d1\3\2\2\2\u00db\u00d7\3\2\2\2\u00dc"+
		"(\3\2\2\2\u00dd\u00de\7}\2\2\u00de*\3\2\2\2\u00df\u00e0\7\177\2\2\u00e0"+
		",\3\2\2\2\u00e1\u00e2\7*\2\2\u00e2.\3\2\2\2\u00e3\u00e4\7+\2\2\u00e4\60"+
		"\3\2\2\2\u00e5\u00e6\7=\2\2\u00e6\62\3\2\2\2\u00e7\u00e8\7.\2\2\u00e8"+
		"\64\3\2\2\2\u00e9\u00ea\7,\2\2\u00ea\66\3\2\2\2\u00eb\u00ef\t\2\2\2\u00ec"+
		"\u00ee\t\3\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f08\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f4"+
		"\t\4\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6:\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fa\t\5\2\2"+
		"\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\b\36\2\2\u00fe<\3\2\2\2\22\2"+
		"IUcm{\u0089\u0093\u009f\u00a9\u00b1\u00c8\u00db\u00ef\u00f5\u00fb\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}