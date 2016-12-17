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
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.InsertColumnDefinitionContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.InsertIntoContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.SelectContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Sql_statementContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.TableNameContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.ValueContext;
import hu.unideb.inf.fordprog.model.DatabaseSelectCache;
import hu.unideb.inf.fordprog.model.DatabaseSelectResult;
import hu.unideb.inf.fordprog.service.DatabaseService;
import hu.unideb.inf.fordprog.service.DatabaseServiceFacade;

public class DatabaseHandlerListenerImpl implements DatabaseHandlerListener {

    private DatabaseService service = new DatabaseServiceFacade();

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
        service.createTableByContext(ctx);
    }

    @Override
    public void enterInsertInto(InsertIntoContext ctx) {

    }

    @Override
    public void exitInsertInto(InsertIntoContext ctx) {
        service.insertIntoByContext(ctx);
    }

    @Override
    public void enterSelect(SelectContext ctx) {

    }

    @Override
    public void exitSelect(SelectContext ctx) {
        DatabaseSelectResult selectResult = service.selectByContext(ctx);
        DatabaseSelectCache.setDatabaseCache(selectResult);
    }

    @Override
    public void enterColumn_definition(Column_definitionContext ctx) {

    }

    @Override
    public void exitColumn_definition(Column_definitionContext ctx) {

    }

    @Override
    public void enterColumn_list_type(Column_list_typeContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitColumn_list_type(Column_list_typeContext ctx) {
        // TODO Auto-generated method stub

    }

}
