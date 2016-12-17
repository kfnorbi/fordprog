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
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link DatabaseHandlerParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(DatabaseHandlerParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link DatabaseHandlerParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(DatabaseHandlerParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertInto}
	 * labeled alternative in {@link DatabaseHandlerParser#insert_into}.
	 * @param ctx the parse tree
	 */
	void enterInsertInto(DatabaseHandlerParser.InsertIntoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertInto}
	 * labeled alternative in {@link DatabaseHandlerParser#insert_into}.
	 * @param ctx the parse tree
	 */
	void exitInsertInto(DatabaseHandlerParser.InsertIntoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code select}
	 * labeled alternative in {@link DatabaseHandlerParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect(DatabaseHandlerParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code select}
	 * labeled alternative in {@link DatabaseHandlerParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect(DatabaseHandlerParser.SelectContext ctx);
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
	 * Enter a parse tree produced by {@link DatabaseHandlerParser#column_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list(DatabaseHandlerParser.Column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatabaseHandlerParser#column_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list(DatabaseHandlerParser.Column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatabaseHandlerParser#column_list_type}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list_type(DatabaseHandlerParser.Column_list_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatabaseHandlerParser#column_list_type}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list_type(DatabaseHandlerParser.Column_list_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link DatabaseHandlerParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTableName(DatabaseHandlerParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link DatabaseHandlerParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTableName(DatabaseHandlerParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnName}
	 * labeled alternative in {@link DatabaseHandlerParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(DatabaseHandlerParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnName}
	 * labeled alternative in {@link DatabaseHandlerParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(DatabaseHandlerParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertColumnDefinition}
	 * labeled alternative in {@link DatabaseHandlerParser#insert_column_definition}.
	 * @param ctx the parse tree
	 */
	void enterInsertColumnDefinition(DatabaseHandlerParser.InsertColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertColumnDefinition}
	 * labeled alternative in {@link DatabaseHandlerParser#insert_column_definition}.
	 * @param ctx the parse tree
	 */
	void exitInsertColumnDefinition(DatabaseHandlerParser.InsertColumnDefinitionContext ctx);
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