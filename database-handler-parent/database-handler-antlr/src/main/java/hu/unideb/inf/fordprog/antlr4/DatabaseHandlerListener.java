// Generated from DatabaseHandler.g4 by ANTLR 4.5.3

package hu.unideb.inf.fordprog.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DatabaseHandlerParser}.
 */
public interface DatabaseHandlerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DatabaseHandlerParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_statement(DatabaseHandlerParser.Sql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatabaseHandlerParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_statement(DatabaseHandlerParser.Sql_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatabaseHandlerParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(DatabaseHandlerParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatabaseHandlerParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(DatabaseHandlerParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatabaseHandlerParser#insert_into}.
	 * @param ctx the parse tree
	 */
	void enterInsert_into(DatabaseHandlerParser.Insert_intoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatabaseHandlerParser#insert_into}.
	 * @param ctx the parse tree
	 */
	void exitInsert_into(DatabaseHandlerParser.Insert_intoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatabaseHandlerParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(DatabaseHandlerParser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatabaseHandlerParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(DatabaseHandlerParser.Column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatabaseHandlerParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(DatabaseHandlerParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatabaseHandlerParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(DatabaseHandlerParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatabaseHandlerParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(DatabaseHandlerParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatabaseHandlerParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(DatabaseHandlerParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatabaseHandlerParser#insert_column_definition}.
	 * @param ctx the parse tree
	 */
	void enterInsert_column_definition(DatabaseHandlerParser.Insert_column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatabaseHandlerParser#insert_column_definition}.
	 * @param ctx the parse tree
	 */
	void exitInsert_column_definition(DatabaseHandlerParser.Insert_column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatabaseHandlerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(DatabaseHandlerParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatabaseHandlerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(DatabaseHandlerParser.ValueContext ctx);
}