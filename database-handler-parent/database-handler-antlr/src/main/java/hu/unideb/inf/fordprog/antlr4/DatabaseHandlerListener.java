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
	 * Enter a parse tree produced by {@link DatabaseHandlerParser#function_clause}.
	 * @param ctx the parse tree
	 */
	void enterFunction_clause(DatabaseHandlerParser.Function_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatabaseHandlerParser#function_clause}.
	 * @param ctx the parse tree
	 */
	void exitFunction_clause(DatabaseHandlerParser.Function_clauseContext ctx);
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
	 * Enter a parse tree produced by the {@code whereClause}
	 * labeled alternative in {@link DatabaseHandlerParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(DatabaseHandlerParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whereClause}
	 * labeled alternative in {@link DatabaseHandlerParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(DatabaseHandlerParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code distinctLabel}
	 * labeled alternative in {@link DatabaseHandlerParser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinctLabel(DatabaseHandlerParser.DistinctLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code distinctLabel}
	 * labeled alternative in {@link DatabaseHandlerParser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinctLabel(DatabaseHandlerParser.DistinctLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionLabel}
	 * labeled alternative in {@link DatabaseHandlerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionLabel(DatabaseHandlerParser.ExpressionLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionLabel}
	 * labeled alternative in {@link DatabaseHandlerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionLabel(DatabaseHandlerParser.ExpressionLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatabaseHandlerParser#expr_op}.
	 * @param ctx the parse tree
	 */
	void enterExpr_op(DatabaseHandlerParser.Expr_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatabaseHandlerParser#expr_op}.
	 * @param ctx the parse tree
	 */
	void exitExpr_op(DatabaseHandlerParser.Expr_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatabaseHandlerParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(DatabaseHandlerParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatabaseHandlerParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(DatabaseHandlerParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatabaseHandlerParser#right_element}.
	 * @param ctx the parse tree
	 */
	void enterRight_element(DatabaseHandlerParser.Right_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatabaseHandlerParser#right_element}.
	 * @param ctx the parse tree
	 */
	void exitRight_element(DatabaseHandlerParser.Right_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatabaseHandlerParser#left_element}.
	 * @param ctx the parse tree
	 */
	void enterLeft_element(DatabaseHandlerParser.Left_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatabaseHandlerParser#left_element}.
	 * @param ctx the parse tree
	 */
	void exitLeft_element(DatabaseHandlerParser.Left_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatabaseHandlerParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(DatabaseHandlerParser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatabaseHandlerParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(DatabaseHandlerParser.Simple_expressionContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link DatabaseHandlerParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(DatabaseHandlerParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatabaseHandlerParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(DatabaseHandlerParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatabaseHandlerParser#relational_op}.
	 * @param ctx the parse tree
	 */
	void enterRelational_op(DatabaseHandlerParser.Relational_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatabaseHandlerParser#relational_op}.
	 * @param ctx the parse tree
	 */
	void exitRelational_op(DatabaseHandlerParser.Relational_opContext ctx);
}