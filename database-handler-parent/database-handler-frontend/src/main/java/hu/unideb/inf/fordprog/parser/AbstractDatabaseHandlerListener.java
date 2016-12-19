package hu.unideb.inf.fordprog.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerListener;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.ColumnNameContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Column_definitionContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Column_listContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Column_list_typeContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.CreateTableContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.ElementContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Expr_opContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.ExpressionLabelContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.FunctionContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Function_clauseContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.InsertColumnDefinitionContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.InsertIntoContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Left_elementContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Relational_opContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Right_elementContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.SelectContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Simple_expressionContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Sql_statementContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.TableNameContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.ValueContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.WhereClauseContext;

/**
 * Absztralt ősosztály a szabályok alap imlementálására.
 *
 */
public abstract class AbstractDatabaseHandlerListener implements DatabaseHandlerListener {

    @Override
    public void enterEveryRule(ParserRuleContext arg0) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext arg0) {

    }

    @Override
    public void visitErrorNode(ErrorNode arg0) {

    }

    @Override
    public void visitTerminal(TerminalNode arg0) {

    }

    @Override
    public void enterSql_statement(Sql_statementContext ctx) {

    }

    @Override
    public void exitSql_statement(Sql_statementContext ctx) {

    }

    @Override
    public void enterValue(ValueContext ctx) {

    }

    @Override
    public void exitValue(ValueContext ctx) {

    }

    @Override
    public void enterColumn_list(Column_listContext ctx) {

    }

    @Override
    public void exitColumn_list(Column_listContext ctx) {

    }

    @Override
    public void enterTableName(TableNameContext ctx) {

    }

    @Override
    public void exitTableName(TableNameContext ctx) {

    }

    @Override
    public void enterColumnName(ColumnNameContext ctx) {

    }

    @Override
    public void exitColumnName(ColumnNameContext ctx) {

    }

    @Override
    public void enterInsertColumnDefinition(InsertColumnDefinitionContext ctx) {

    }

    @Override
    public void exitInsertColumnDefinition(InsertColumnDefinitionContext ctx) {

    }

    @Override
    public void enterCreateTable(CreateTableContext ctx) {

    }

    @Override
    public void exitCreateTable(CreateTableContext ctx) {
    }

    @Override
    public void enterInsertInto(InsertIntoContext ctx) {

    }

    @Override
    public void exitInsertInto(InsertIntoContext ctx) {
    }

    @Override
    public void enterSelect(SelectContext ctx) {

    }

    @Override
    public void exitSelect(SelectContext ctx) {
    }

    @Override
    public void enterColumn_definition(Column_definitionContext ctx) {

    }

    @Override
    public void exitColumn_definition(Column_definitionContext ctx) {

    }

    @Override
    public void enterColumn_list_type(Column_list_typeContext ctx) {

    }

    @Override
    public void exitColumn_list_type(Column_list_typeContext ctx) {

    }

    @Override
    public void enterExpr_op(Expr_opContext ctx) {

    }

    @Override
    public void exitExpr_op(Expr_opContext ctx) {

    }

    @Override
    public void enterElement(ElementContext ctx) {

    }

    @Override
    public void exitElement(ElementContext ctx) {

    }

    @Override
    public void enterRight_element(Right_elementContext ctx) {

    }

    @Override
    public void exitRight_element(Right_elementContext ctx) {

    }

    @Override
    public void enterLeft_element(Left_elementContext ctx) {

    }

    @Override
    public void exitLeft_element(Left_elementContext ctx) {

    }

    @Override
    public void enterSimple_expression(Simple_expressionContext ctx) {

    }

    @Override
    public void exitSimple_expression(Simple_expressionContext ctx) {

    }

    @Override
    public void enterRelational_op(Relational_opContext ctx) {

    }

    @Override
    public void exitRelational_op(Relational_opContext ctx) {

    }

    @Override
    public void enterWhereClause(WhereClauseContext ctx) {

    }

    @Override
    public void exitWhereClause(WhereClauseContext ctx) {

    }

    @Override
    public void enterExpressionLabel(ExpressionLabelContext ctx) {

    }

    @Override
    public void exitExpressionLabel(ExpressionLabelContext ctx) {

    }

    @Override
    public void enterFunction(FunctionContext ctx) {

    }

    @Override
    public void exitFunction(FunctionContext ctx) {

    }

    @Override
    public void enterFunction_clause(Function_clauseContext ctx) {

    }

    @Override
    public void exitFunction_clause(Function_clauseContext ctx) {

    }
}
