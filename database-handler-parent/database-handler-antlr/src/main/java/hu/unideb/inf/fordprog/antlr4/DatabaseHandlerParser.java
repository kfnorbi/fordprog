// Generated from DatabaseHandler.g4 by ANTLR 4.5.3

package hu.unideb.inf.fordprog.antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DatabaseHandlerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, TABLE=2, INSERT=3, INTO=4, VALUES=5, COLUMN_TPYE=6, LKPAR=7, 
		RKPAR=8, LPAR=9, RPAR=10, SEMICOLON=11, COMA=12, ID=13, CHAR=14, WS=15;
	public static final int
		RULE_sql_statement = 0, RULE_create_table = 1, RULE_insert_into = 2, RULE_column_definition = 3, 
		RULE_table_name = 4, RULE_column_name = 5, RULE_insert_column_definition = 6, 
		RULE_value = 7;
	public static final String[] ruleNames = {
		"sql_statement", "create_table", "insert_into", "column_definition", "table_name", 
		"column_name", "insert_column_definition", "value"
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

	@Override
	public String getGrammarFileName() { return "DatabaseHandler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DatabaseHandlerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Sql_statementContext extends ParserRuleContext {
		public Create_tableContext create_table() {
			return getRuleContext(Create_tableContext.class,0);
		}
		public Insert_intoContext insert_into() {
			return getRuleContext(Insert_intoContext.class,0);
		}
		public Sql_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterSql_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitSql_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitSql_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_statementContext sql_statement() throws RecognitionException {
		Sql_statementContext _localctx = new Sql_statementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sql_statement);
		try {
			setState(18);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				create_table();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				insert_into();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_tableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(DatabaseHandlerParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(DatabaseHandlerParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LKPAR() { return getToken(DatabaseHandlerParser.LKPAR, 0); }
		public TerminalNode RKPAR() { return getToken(DatabaseHandlerParser.RKPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(DatabaseHandlerParser.SEMICOLON, 0); }
		public List<Column_definitionContext> column_definition() {
			return getRuleContexts(Column_definitionContext.class);
		}
		public Column_definitionContext column_definition(int i) {
			return getRuleContext(Column_definitionContext.class,i);
		}
		public Create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterCreate_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitCreate_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitCreate_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_tableContext create_table() throws RecognitionException {
		Create_tableContext _localctx = new Create_tableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_create_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(CREATE);
			setState(21);
			match(TABLE);
			setState(22);
			table_name();
			setState(23);
			match(LKPAR);
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				column_definition();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(29);
			match(RKPAR);
			setState(30);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_intoContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(DatabaseHandlerParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(DatabaseHandlerParser.INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(DatabaseHandlerParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(DatabaseHandlerParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(DatabaseHandlerParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(DatabaseHandlerParser.RPAR, i);
		}
		public TerminalNode VALUES() { return getToken(DatabaseHandlerParser.VALUES, 0); }
		public TerminalNode SEMICOLON() { return getToken(DatabaseHandlerParser.SEMICOLON, 0); }
		public List<Insert_column_definitionContext> insert_column_definition() {
			return getRuleContexts(Insert_column_definitionContext.class);
		}
		public Insert_column_definitionContext insert_column_definition(int i) {
			return getRuleContext(Insert_column_definitionContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Insert_intoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_into; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterInsert_into(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitInsert_into(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitInsert_into(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_intoContext insert_into() throws RecognitionException {
		Insert_intoContext _localctx = new Insert_intoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_insert_into);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(INSERT);
			setState(33);
			match(INTO);
			setState(34);
			table_name();
			setState(35);
			match(LPAR);
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				insert_column_definition();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(41);
			match(RPAR);
			setState(42);
			match(VALUES);
			setState(43);
			match(LPAR);
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				value();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHAR );
			setState(49);
			match(RPAR);
			setState(50);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_definitionContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode COLUMN_TPYE() { return getToken(DatabaseHandlerParser.COLUMN_TPYE, 0); }
		public TerminalNode COMA() { return getToken(DatabaseHandlerParser.COMA, 0); }
		public Column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterColumn_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitColumn_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitColumn_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_definitionContext column_definition() throws RecognitionException {
		Column_definitionContext _localctx = new Column_definitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_column_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			column_name();
			setState(53);
			match(COLUMN_TPYE);
			setState(55);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(54);
				match(COMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DatabaseHandlerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DatabaseHandlerParser.ID, i);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				match(ID);
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DatabaseHandlerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DatabaseHandlerParser.ID, i);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_column_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(62);
					match(ID);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(65); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_column_definitionContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode COMA() { return getToken(DatabaseHandlerParser.COMA, 0); }
		public Insert_column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_column_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterInsert_column_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitInsert_column_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitInsert_column_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_column_definitionContext insert_column_definition() throws RecognitionException {
		Insert_column_definitionContext _localctx = new Insert_column_definitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_insert_column_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			column_name();
			setState(69);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(68);
				match(COMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(DatabaseHandlerParser.CHAR, 0); }
		public TerminalNode COMA() { return getToken(DatabaseHandlerParser.COMA, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(CHAR);
			setState(73);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(72);
				match(COMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21N\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\5\2\25\n\2"+
		"\3\3\3\3\3\3\3\3\3\3\6\3\34\n\3\r\3\16\3\35\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\6\4(\n\4\r\4\16\4)\3\4\3\4\3\4\3\4\6\4\60\n\4\r\4\16\4\61\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\5\5:\n\5\3\6\6\6=\n\6\r\6\16\6>\3\7\6\7B\n\7\r\7\16"+
		"\7C\3\b\3\b\5\bH\n\b\3\t\3\t\5\tL\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2"+
		"N\2\24\3\2\2\2\4\26\3\2\2\2\6\"\3\2\2\2\b\66\3\2\2\2\n<\3\2\2\2\fA\3\2"+
		"\2\2\16E\3\2\2\2\20I\3\2\2\2\22\25\5\4\3\2\23\25\5\6\4\2\24\22\3\2\2\2"+
		"\24\23\3\2\2\2\25\3\3\2\2\2\26\27\7\3\2\2\27\30\7\4\2\2\30\31\5\n\6\2"+
		"\31\33\7\t\2\2\32\34\5\b\5\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2"+
		"\35\36\3\2\2\2\36\37\3\2\2\2\37 \7\n\2\2 !\7\r\2\2!\5\3\2\2\2\"#\7\5\2"+
		"\2#$\7\6\2\2$%\5\n\6\2%\'\7\13\2\2&(\5\16\b\2\'&\3\2\2\2()\3\2\2\2)\'"+
		"\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7\f\2\2,-\7\7\2\2-/\7\13\2\2.\60\5\20\t"+
		"\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63"+
		"\64\7\f\2\2\64\65\7\r\2\2\65\7\3\2\2\2\66\67\5\f\7\2\679\7\b\2\28:\7\16"+
		"\2\298\3\2\2\29:\3\2\2\2:\t\3\2\2\2;=\7\17\2\2<;\3\2\2\2=>\3\2\2\2><\3"+
		"\2\2\2>?\3\2\2\2?\13\3\2\2\2@B\7\17\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2"+
		"CD\3\2\2\2D\r\3\2\2\2EG\5\f\7\2FH\7\16\2\2GF\3\2\2\2GH\3\2\2\2H\17\3\2"+
		"\2\2IK\7\20\2\2JL\7\16\2\2KJ\3\2\2\2KL\3\2\2\2L\21\3\2\2\2\13\24\35)\61"+
		"9>CGK";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}