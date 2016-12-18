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
		AND=9, OR=10, EQ=11, LTH=12, GTH=13, LTE=14, GTE=15, NOT_EQ=16, NOT=17, 
		LOGICAL=18, COLUMN_TPYE=19, LKPAR=20, RKPAR=21, LPAR=22, RPAR=23, SEMICOLON=24, 
		COMA=25, ASTERIX=26, ID=27, CHAR=28, WS=29;
	public static final int
		RULE_sql_statement = 0, RULE_create_table = 1, RULE_insert_into = 2, RULE_select_clause = 3, 
		RULE_column_definition = 4, RULE_column_list = 5, RULE_column_list_type = 6, 
		RULE_table_name = 7, RULE_column_name = 8, RULE_insert_column_definition = 9, 
		RULE_where_clause = 10, RULE_expression = 11, RULE_expr_op = 12, RULE_element = 13, 
		RULE_right_element = 14, RULE_left_element = 15, RULE_simple_expression = 16, 
		RULE_value = 17, RULE_relational_op = 18;
	public static final String[] ruleNames = {
		"sql_statement", "create_table", "insert_into", "select_clause", "column_definition", 
		"column_list", "column_list_type", "table_name", "column_name", "insert_column_definition", 
		"where_clause", "expression", "expr_op", "element", "right_element", "left_element", 
		"simple_expression", "value", "relational_op"
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
			setState(41);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				create_table();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				insert_into();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
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
			setState(43);
			match(CREATE);
			setState(44);
			match(TABLE);
			setState(45);
			((CreateTableContext)_localctx).tableName = table_name();
			setState(46);
			match(LKPAR);
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47);
				((CreateTableContext)_localctx).column_definition = column_definition();
				((CreateTableContext)_localctx).columns.add(((CreateTableContext)_localctx).column_definition);
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(52);
			match(RKPAR);
			setState(53);
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
			setState(55);
			match(INSERT);
			setState(56);
			match(INTO);
			setState(57);
			((InsertIntoContext)_localctx).tableName = table_name();
			setState(58);
			match(LPAR);
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				((InsertIntoContext)_localctx).insert_column_definition = insert_column_definition();
				((InsertIntoContext)_localctx).insertColumnDefinition.add(((InsertIntoContext)_localctx).insert_column_definition);
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(64);
			match(RPAR);
			setState(65);
			match(VALUES);
			setState(66);
			match(LPAR);
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				value();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHAR );
			setState(72);
			match(RPAR);
			setState(73);
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
		public Where_clauseContext where;
		public TerminalNode SELECT() { return getToken(DatabaseHandlerParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(DatabaseHandlerParser.FROM, 0); }
		public TerminalNode SEMICOLON() { return getToken(DatabaseHandlerParser.SEMICOLON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Column_listContext> column_list() {
			return getRuleContexts(Column_listContext.class);
		}
		public Column_listContext column_list(int i) {
			return getRuleContext(Column_listContext.class,i);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
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
			setState(75);
			match(SELECT);
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				((SelectContext)_localctx).column_list = column_list();
				((SelectContext)_localctx).columns.add(((SelectContext)_localctx).column_list);
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ASTERIX || _la==ID );
			setState(81);
			match(FROM);
			setState(82);
			((SelectContext)_localctx).tableName = table_name();
			setState(84);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(83);
				((SelectContext)_localctx).where = where_clause();
				}
			}

			setState(86);
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
			setState(88);
			((Column_definitionContext)_localctx).columnName = column_name();
			setState(89);
			((Column_definitionContext)_localctx).columnType = match(COLUMN_TPYE);
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

	public static class Column_listContext extends ParserRuleContext {
		public Column_list_typeContext columName;
		public Column_list_typeContext column_list_type() {
			return getRuleContext(Column_list_typeContext.class,0);
		}
		public TerminalNode COMA() { return getToken(DatabaseHandlerParser.COMA, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			((Column_listContext)_localctx).columName = column_list_type();
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
			setState(99);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				column_name();
				}
				break;
			case ASTERIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
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
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				((TableNameContext)_localctx).tableName = match(ID);
				}
				}
				setState(104); 
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
			setState(107); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(106);
					((ColumnNameContext)_localctx).columnName = match(ID);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(109); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
			setState(111);
			((InsertColumnDefinitionContext)_localctx).columnName = column_name();
			setState(113);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(112);
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

	public static class Where_clauseContext extends ParserRuleContext {
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
	 
		public Where_clauseContext() { }
		public void copyFrom(Where_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhereClauseContext extends Where_clauseContext {
		public TerminalNode WHERE() { return getToken(DatabaseHandlerParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereClauseContext(Where_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_where_clause);
		try {
			_localctx = new WhereClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(WHERE);
			setState(116);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionLabelContext extends ExpressionContext {
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public List<Expr_opContext> expr_op() {
			return getRuleContexts(Expr_opContext.class);
		}
		public Expr_opContext expr_op(int i) {
			return getRuleContext(Expr_opContext.class,i);
		}
		public ExpressionLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterExpressionLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitExpressionLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		int _la;
		try {
			_localctx = new ExpressionLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			simple_expression();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) {
				{
				{
				setState(119);
				expr_op();
				setState(120);
				simple_expression();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Expr_opContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(DatabaseHandlerParser.AND, 0); }
		public TerminalNode OR() { return getToken(DatabaseHandlerParser.OR, 0); }
		public TerminalNode NOT() { return getToken(DatabaseHandlerParser.NOT, 0); }
		public Expr_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterExpr_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitExpr_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitExpr_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_opContext expr_op() throws RecognitionException {
		Expr_opContext _localctx = new Expr_opContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(DatabaseHandlerParser.CHAR, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_element);
		try {
			setState(131);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(CHAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				column_name();
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

	public static class Right_elementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Right_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterRight_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitRight_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitRight_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_elementContext right_element() throws RecognitionException {
		Right_elementContext _localctx = new Right_elementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_right_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			element();
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

	public static class Left_elementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Left_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterLeft_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitLeft_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitLeft_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_elementContext left_element() throws RecognitionException {
		Left_elementContext _localctx = new Left_elementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_left_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			element();
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

	public static class Simple_expressionContext extends ParserRuleContext {
		public Left_elementContext left;
		public Relational_opContext relation;
		public Right_elementContext right;
		public Left_elementContext left_element() {
			return getRuleContext(Left_elementContext.class,0);
		}
		public Relational_opContext relational_op() {
			return getRuleContext(Relational_opContext.class,0);
		}
		public Right_elementContext right_element() {
			return getRuleContext(Right_elementContext.class,0);
		}
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterSimple_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitSimple_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitSimple_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simple_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			((Simple_expressionContext)_localctx).left = left_element();
			setState(138);
			((Simple_expressionContext)_localctx).relation = relational_op();
			setState(139);
			((Simple_expressionContext)_localctx).right = right_element();
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
		enterRule(_localctx, 34, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(CHAR);
			setState(143);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(142);
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

	public static class Relational_opContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(DatabaseHandlerParser.EQ, 0); }
		public TerminalNode NOT_EQ() { return getToken(DatabaseHandlerParser.NOT_EQ, 0); }
		public TerminalNode LTE() { return getToken(DatabaseHandlerParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(DatabaseHandlerParser.GTE, 0); }
		public TerminalNode LTH() { return getToken(DatabaseHandlerParser.LTH, 0); }
		public TerminalNode GTH() { return getToken(DatabaseHandlerParser.GTH, 0); }
		public Relational_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).enterRelational_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatabaseHandlerListener ) ((DatabaseHandlerListener)listener).exitRelational_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatabaseHandlerVisitor ) return ((DatabaseHandlerVisitor<? extends T>)visitor).visitRelational_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_opContext relational_op() throws RecognitionException {
		Relational_opContext _localctx = new Relational_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relational_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LTH) | (1L << GTH) | (1L << LTE) | (1L << GTE) | (1L << NOT_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\5\2,\n\2\3\3\3\3\3\3\3\3\3\3\6\3\63\n"+
		"\3\r\3\16\3\64\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\6\4?\n\4\r\4\16\4@\3\4"+
		"\3\4\3\4\3\4\6\4G\n\4\r\4\16\4H\3\4\3\4\3\4\3\5\3\5\6\5P\n\5\r\5\16\5"+
		"Q\3\5\3\5\3\5\5\5W\n\5\3\5\3\5\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\5\7b\n\7\3"+
		"\b\3\b\5\bf\n\b\3\t\6\ti\n\t\r\t\16\tj\3\n\6\nn\n\n\r\n\16\no\3\13\3\13"+
		"\5\13t\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r}\n\r\f\r\16\r\u0080\13\r\3"+
		"\16\3\16\3\17\3\17\5\17\u0086\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\5\23\u0092\n\23\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&\2\4\4\2\13\f\23\23\3\2\r\22\u0092\2+\3\2\2"+
		"\2\4-\3\2\2\2\69\3\2\2\2\bM\3\2\2\2\nZ\3\2\2\2\f_\3\2\2\2\16e\3\2\2\2"+
		"\20h\3\2\2\2\22m\3\2\2\2\24q\3\2\2\2\26u\3\2\2\2\30x\3\2\2\2\32\u0081"+
		"\3\2\2\2\34\u0085\3\2\2\2\36\u0087\3\2\2\2 \u0089\3\2\2\2\"\u008b\3\2"+
		"\2\2$\u008f\3\2\2\2&\u0093\3\2\2\2(,\5\4\3\2),\5\6\4\2*,\5\b\5\2+(\3\2"+
		"\2\2+)\3\2\2\2+*\3\2\2\2,\3\3\2\2\2-.\7\3\2\2./\7\4\2\2/\60\5\20\t\2\60"+
		"\62\7\26\2\2\61\63\5\n\6\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64"+
		"\65\3\2\2\2\65\66\3\2\2\2\66\67\7\27\2\2\678\7\32\2\28\5\3\2\2\29:\7\5"+
		"\2\2:;\7\6\2\2;<\5\20\t\2<>\7\30\2\2=?\5\24\13\2>=\3\2\2\2?@\3\2\2\2@"+
		">\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\31\2\2CD\7\7\2\2DF\7\30\2\2EG\5$\23"+
		"\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\31\2\2KL\7\32"+
		"\2\2L\7\3\2\2\2MO\7\b\2\2NP\5\f\7\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3"+
		"\2\2\2RS\3\2\2\2ST\7\t\2\2TV\5\20\t\2UW\5\26\f\2VU\3\2\2\2VW\3\2\2\2W"+
		"X\3\2\2\2XY\7\32\2\2Y\t\3\2\2\2Z[\5\22\n\2[]\7\25\2\2\\^\7\33\2\2]\\\3"+
		"\2\2\2]^\3\2\2\2^\13\3\2\2\2_a\5\16\b\2`b\7\33\2\2a`\3\2\2\2ab\3\2\2\2"+
		"b\r\3\2\2\2cf\5\22\n\2df\7\34\2\2ec\3\2\2\2ed\3\2\2\2f\17\3\2\2\2gi\7"+
		"\35\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\21\3\2\2\2ln\7\35\2\2"+
		"ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p\23\3\2\2\2qs\5\22\n\2rt\7\33"+
		"\2\2sr\3\2\2\2st\3\2\2\2t\25\3\2\2\2uv\7\n\2\2vw\5\30\r\2w\27\3\2\2\2"+
		"x~\5\"\22\2yz\5\32\16\2z{\5\"\22\2{}\3\2\2\2|y\3\2\2\2}\u0080\3\2\2\2"+
		"~|\3\2\2\2~\177\3\2\2\2\177\31\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\t\2"+
		"\2\2\u0082\33\3\2\2\2\u0083\u0086\7\36\2\2\u0084\u0086\5\22\n\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\35\3\2\2\2\u0087\u0088\5\34\17"+
		"\2\u0088\37\3\2\2\2\u0089\u008a\5\34\17\2\u008a!\3\2\2\2\u008b\u008c\5"+
		" \21\2\u008c\u008d\5&\24\2\u008d\u008e\5\36\20\2\u008e#\3\2\2\2\u008f"+
		"\u0091\7\36\2\2\u0090\u0092\7\33\2\2\u0091\u0090\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092%\3\2\2\2\u0093\u0094\t\3\2\2\u0094\'\3\2\2\2\21+\64@HQV]"+
		"aejos~\u0085\u0091";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}