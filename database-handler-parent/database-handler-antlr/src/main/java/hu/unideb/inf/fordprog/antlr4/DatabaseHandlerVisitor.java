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
	 * Visit a parse tree produced by {@link DatabaseHandlerParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table(DatabaseHandlerParser.Create_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatabaseHandlerParser#insert_into}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_into(DatabaseHandlerParser.Insert_intoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatabaseHandlerParser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(DatabaseHandlerParser.Column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatabaseHandlerParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(DatabaseHandlerParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatabaseHandlerParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(DatabaseHandlerParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatabaseHandlerParser#insert_column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_column_definition(DatabaseHandlerParser.Insert_column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatabaseHandlerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(DatabaseHandlerParser.ValueContext ctx);
}