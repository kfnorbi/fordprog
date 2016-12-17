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
		CREATE=1, TABLE=2, INSERT=3, INTO=4, VALUES=5, SELECT=6, FROM=7, WHERE=8, 
		AND=9, OR=10, EQUALS=11, GT=12, LT=13, GTE=14, LTE=15, OPERATOR=16, LOGICAL=17, 
		COLUMN_TPYE=18, LKPAR=19, RKPAR=20, LPAR=21, RPAR=22, SEMICOLON=23, COMA=24, 
		ASTERIX=25, ID=26, CHAR=27, WS=28;
	public static final int
		RULE_sql_statement = 0, RULE_create_table = 1, RULE_insert_into = 2, RULE_select_clause = 3, 
		RULE_column_definition = 4, RULE_column_list = 5, RULE_column_list_type = 6, 
		RULE_table_name = 7, RULE_column_name = 8, RULE_insert_column_definition = 9, 
		RULE_value = 10;
	public static final String[] ruleNames = {
		"sql_statement", "create_table", "insert_into", "select_clause", "column_definition", 
		"column_list", "column_list_type", "table_name", "column_name", "insert_column_definition", 
		"value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "'='", 
		"'>'", "'<'", "'>='", "'<='", null, null, null, "'{'", "'}'", "'('", "')'", 
		"';'", "','", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CREATE", "TABLE", "INSERT", "INTO", "VALUES", "SELECT", "FROM", 
		"WHERE", "AND", "OR", "EQUALS", "GT", "LT", "GTE", "LTE", "OPERATOR", 
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
		public Select_clauseContext select_clause() {
			return getRuleContext(Select_clauseContext.class,0);
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
			setState(25);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				create_table();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				insert_into();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				select_clause();
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
		public Create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table; }
	 
		public Create_tableContext() { }
		public void copyFrom(Create_tableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateTableContext extends Create_tableContext {
		public Table_nameContext tableName;
		public Column_definitionContext column_definition;
		public List<Column_definitionContext> columns = new ArrayList<Column_definitionContext>();
		public TerminalNode CREATE() { return getToken(DatabaseHandlerParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(DatabaseHandlerParser.TABLE, 0); }
		public TerminalNode LKPAR() { return getToken(DatabaseHandlerParser.LKPAR, 0); }
		public TerminalNode RKPAR() { return getToken(DatabaseHandlerParser.RKPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(DatabaseHandlerParser.SEMICOLON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Column_definitionContext> column_definition() {
			return getRuleContexts(Column_definitionContext.class);
		}
		public Column_definitionContext column_definition(int i) {
			return getRuleContext(Column_definitionContext.class,i);
		}
		public CreateTableContext(Create_tableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_tableContext create_table() throws RecognitionException {
		Create_tableContext _localctx = new Create_tableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_create_table);
		int _la;
		try {
			_localctx = new CreateTableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(CREATE);
			setState(28);
			match(TABLE);
			setState(29);
			((CreateTableContext)_localctx).tableName = table_name();
			setState(30);
			match(LKPAR);
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				((CreateTableContext)_localctx).column_definition = column_definition();
				((CreateTableContext)_localctx).columns.add(((CreateTableContext)_localctx).column_definition);
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(36);
			match(RKPAR);
			setState(37);
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
		public Insert_intoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_into; }
	 
		public Insert_intoContext() { }
		public void copyFrom(Insert_intoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertIntoContext extends Insert_intoContext {
		public Table_nameContext tableName;
		public Insert_column_definitionContext insert_column_definition;
		public List<Insert_column_definitionContext> insertColumnDefinition = new ArrayList<Insert_column_definitionContext>();
		public TerminalNode INSERT() { return getToken(DatabaseHandlerParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(DatabaseHandlerParser.INTO, 0); }
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
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<Insert_column_definitionContext> insert_column_definition() {
			return getRuleContexts(Insert_column_definitionContext.class);
		}
		public Insert_column_definitionContext insert_column_definition(int i) {
			return getRuleContext(Insert_column_definitionContext.class,i);
		}
		public InsertIntoContext(Insert_intoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterInsertInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitInsertInto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitInsertInto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_intoContext insert_into() throws RecognitionException {
		Insert_intoContext _localctx = new Insert_intoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_insert_into);
		int _la;
		try {
			_localctx = new InsertIntoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(INSERT);
			setState(40);
			match(INTO);
			setState(41);
			((InsertIntoContext)_localctx).tableName = table_name();
			setState(42);
			match(LPAR);
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				((InsertIntoContext)_localctx).insert_column_definition = insert_column_definition();
				((InsertIntoContext)_localctx).insertColumnDefinition.add(((InsertIntoContext)_localctx).insert_column_definition);
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(48);
			match(RPAR);
			setState(49);
			match(VALUES);
			setState(50);
			match(LPAR);
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				value();
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHAR );
			setState(56);
			match(RPAR);
			setState(57);
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

	public static class Select_clauseContext extends ParserRuleContext {
		public Select_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_clause; }
	 
		public Select_clauseContext() { }
		public void copyFrom(Select_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectContext extends Select_clauseContext {
		public Column_listContext column_list;
		public List<Column_listContext> columns = new ArrayList<Column_listContext>();
		public Table_nameContext tableName;
		public TerminalNode SELECT() { return getToken(DatabaseHandlerParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(DatabaseHandlerParser.FROM, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Column_listContext> column_list() {
			return getRuleContexts(Column_listContext.class);
		}
		public Column_listContext column_list(int i) {
			return getRuleContext(Column_listContext.class,i);
		}
		public SelectContext(Select_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_clauseContext select_clause() throws RecognitionException {
		Select_clauseContext _localctx = new Select_clauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_select_clause);
		int _la;
		try {
			_localctx = new SelectContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(SELECT);
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				((SelectContext)_localctx).column_list = column_list();
				((SelectContext)_localctx).columns.add(((SelectContext)_localctx).column_list);
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ASTERIX || _la==ID );
			setState(65);
			match(FROM);
			setState(66);
			((SelectContext)_localctx).tableName = table_name();
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
		public Column_nameContext columnName;
		public Token columnType;
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
		enterRule(_localctx, 8, RULE_column_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			((Column_definitionContext)_localctx).columnName = column_name();
			setState(69);
			((Column_definitionContext)_localctx).columnType = match(COLUMN_TPYE);
			setState(71);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(70);
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

	public static class Column_listContext extends ParserRuleContext {
		public Column_list_typeContext columName;
		public Column_list_typeContext column_list_type() {
			return getRuleContext(Column_list_typeContext.class,0);
		}
		public Column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterColumn_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitColumn_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitColumn_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_listContext column_list() throws RecognitionException {
		Column_listContext _localctx = new Column_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_column_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			((Column_listContext)_localctx).columName = column_list_type();
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

	public static class Column_list_typeContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode ASTERIX() { return getToken(DatabaseHandlerParser.ASTERIX, 0); }
		public Column_list_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterColumn_list_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitColumn_list_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitColumn_list_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_list_typeContext column_list_type() throws RecognitionException {
		Column_list_typeContext _localctx = new Column_list_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_column_list_type);
		try {
			setState(77);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				column_name();
				}
				break;
			case ASTERIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(ASTERIX);
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

	public static class Table_nameContext extends ParserRuleContext {
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
	 
		public Table_nameContext() { }
		public void copyFrom(Table_nameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableNameContext extends Table_nameContext {
		public Token tableName;
		public List<TerminalNode> ID() { return getTokens(DatabaseHandlerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DatabaseHandlerParser.ID, i);
		}
		public TableNameContext(Table_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_table_name);
		int _la;
		try {
			_localctx = new TableNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				((TableNameContext)_localctx).tableName = match(ID);
				}
				}
				setState(82); 
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
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
	 
		public Column_nameContext() { }
		public void copyFrom(Column_nameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnNameContext extends Column_nameContext {
		public Token columnName;
		public List<TerminalNode> ID() { return getTokens(DatabaseHandlerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DatabaseHandlerParser.ID, i);
		}
		public ColumnNameContext(Column_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_column_name);
		try {
			int _alt;
			_localctx = new ColumnNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(85); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(84);
					((ColumnNameContext)_localctx).columnName = match(ID);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(87); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public Insert_column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_column_definition; }
	 
		public Insert_column_definitionContext() { }
		public void copyFrom(Insert_column_definitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertColumnDefinitionContext extends Insert_column_definitionContext {
		public Column_nameContext columnName;
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode COMA() { return getToken(DatabaseHandlerParser.COMA, 0); }
		public InsertColumnDefinitionContext(Insert_column_definitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterInsertColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitInsertColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitInsertColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_column_definitionContext insert_column_definition() throws RecognitionException {
		Insert_column_definitionContext _localctx = new Insert_column_definitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_insert_column_definition);
		int _la;
		try {
			_localctx = new InsertColumnDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			((InsertColumnDefinitionContext)_localctx).columnName = column_name();
			setState(91);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(90);
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
		enterRule(_localctx, 20, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(CHAR);
			setState(95);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(94);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36d\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\5\2\34\n\2\3\3\3\3\3\3\3\3\3\3\6\3#\n\3\r\3\16\3$\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\6\4/\n\4\r\4\16\4\60\3\4\3\4\3\4\3\4\6"+
		"\4\67\n\4\r\4\16\48\3\4\3\4\3\4\3\5\3\5\6\5@\n\5\r\5\16\5A\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\5\6J\n\6\3\7\3\7\3\b\3\b\5\bP\n\b\3\t\6\tS\n\t\r\t\16\tT"+
		"\3\n\6\nX\n\n\r\n\16\nY\3\13\3\13\5\13^\n\13\3\f\3\f\5\fb\n\f\3\f\2\2"+
		"\r\2\4\6\b\n\f\16\20\22\24\26\2\2d\2\33\3\2\2\2\4\35\3\2\2\2\6)\3\2\2"+
		"\2\b=\3\2\2\2\nF\3\2\2\2\fK\3\2\2\2\16O\3\2\2\2\20R\3\2\2\2\22W\3\2\2"+
		"\2\24[\3\2\2\2\26_\3\2\2\2\30\34\5\4\3\2\31\34\5\6\4\2\32\34\5\b\5\2\33"+
		"\30\3\2\2\2\33\31\3\2\2\2\33\32\3\2\2\2\34\3\3\2\2\2\35\36\7\3\2\2\36"+
		"\37\7\4\2\2\37 \5\20\t\2 \"\7\25\2\2!#\5\n\6\2\"!\3\2\2\2#$\3\2\2\2$\""+
		"\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\7\26\2\2\'(\7\31\2\2(\5\3\2\2\2)*\7\5"+
		"\2\2*+\7\6\2\2+,\5\20\t\2,.\7\27\2\2-/\5\24\13\2.-\3\2\2\2/\60\3\2\2\2"+
		"\60.\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7\30\2\2\63\64\7\7\2\2"+
		"\64\66\7\27\2\2\65\67\5\26\f\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\28"+
		"9\3\2\2\29:\3\2\2\2:;\7\30\2\2;<\7\31\2\2<\7\3\2\2\2=?\7\b\2\2>@\5\f\7"+
		"\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\t\2\2DE\5\20"+
		"\t\2E\t\3\2\2\2FG\5\22\n\2GI\7\24\2\2HJ\7\32\2\2IH\3\2\2\2IJ\3\2\2\2J"+
		"\13\3\2\2\2KL\5\16\b\2L\r\3\2\2\2MP\5\22\n\2NP\7\33\2\2OM\3\2\2\2ON\3"+
		"\2\2\2P\17\3\2\2\2QS\7\34\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2"+
		"U\21\3\2\2\2VX\7\34\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\23\3"+
		"\2\2\2[]\5\22\n\2\\^\7\32\2\2]\\\3\2\2\2]^\3\2\2\2^\25\3\2\2\2_a\7\35"+
		"\2\2`b\7\32\2\2a`\3\2\2\2ab\3\2\2\2b\27\3\2\2\2\r\33$\608AIOTY]a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}