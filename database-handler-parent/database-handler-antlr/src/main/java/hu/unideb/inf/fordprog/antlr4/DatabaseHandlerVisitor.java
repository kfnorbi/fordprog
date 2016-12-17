// Generated from DatabaseHandler.g4 by ANTLR 4.5.3

package hu.unideb.inf.fordprog.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DatabaseHandlerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DatabaseHandlerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DatabaseHandlerParser#sql_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_statement(DatabaseHandlerParser.Sql_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link DatabaseHandlerParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(DatabaseHandlerParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertInto}
	 * labeled alternative in {@link DatabaseHandlerParser#insert_into}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertInto(DatabaseHandlerParser.InsertIntoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code select}
	 * labeled alternative in {@link DatabaseHandlerParser#select_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(DatabaseHandlerParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatabaseHandlerParser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(DatabaseHandlerParser.Column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatabaseHandlerParser#column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list(DatabaseHandlerParser.Column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatabaseHandlerParser#column_list_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list_type(DatabaseHandlerParser.Column_list_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link DatabaseHandlerParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(DatabaseHandlerParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnName}
	 * labeled alternative in {@link DatabaseHandlerParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(DatabaseHandlerParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertColumnDefinition}
	 * labeled alternative in {@link DatabaseHandlerParser#insert_column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertColumnDefinition(DatabaseHandlerParser.InsertColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatabaseHandlerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(DatabaseHandlerParser.ValueContext ctx);
}