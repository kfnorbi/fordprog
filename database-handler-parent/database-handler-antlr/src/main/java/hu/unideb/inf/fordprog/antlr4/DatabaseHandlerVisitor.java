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
	 * Visit a parse tree produced by {@link DatabaseHandlerParser#function_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_clause(DatabaseHandlerParser.Function_clauseContext ctx);
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
	 * Visit a parse tree produced by the {@code whereClause}
	 * labeled alternative in {@link DatabaseHandlerParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(DatabaseHandlerParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code distinctLabel}
	 * labeled alternative in {@link DatabaseHandlerParser#distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinctLabel(DatabaseHandlerParser.DistinctLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionLabel}
	 * labeled alternative in {@link DatabaseHandlerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionLabel(DatabaseHandlerParser.ExpressionLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatabaseHandlerParser#expr_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_op(DatabaseHandlerParser.Expr_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatabaseHandlerParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(DatabaseHandlerParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatabaseHandlerParser#right_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_element(DatabaseHandlerParser.Right_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatabaseHandlerParser#left_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_element(DatabaseHandlerParser.Left_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatabaseHandlerParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expression(DatabaseHandlerParser.Simple_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatabaseHandlerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(DatabaseHandlerParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatabaseHandlerParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(DatabaseHandlerParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatabaseHandlerParser#relational_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_op(DatabaseHandlerParser.Relational_opContext ctx);
}