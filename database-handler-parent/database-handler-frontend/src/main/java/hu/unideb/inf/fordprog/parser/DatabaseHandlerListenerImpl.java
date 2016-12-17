package hu.unideb.inf.fordprog.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerListener;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Column_definitionContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Column_nameContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Create_tableContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Insert_column_definitionContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Insert_intoContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Sql_statementContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Table_nameContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.ValueContext;
import hu.unideb.inf.fordprog.service.DatabaseService;

public class DatabaseHandlerListenerImpl implements DatabaseHandlerListener {

    private DatabaseService service = new DatabaseService();

    @Override
    public void enterEveryRule(ParserRuleContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitEveryRule(ParserRuleContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visitErrorNode(ErrorNode arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visitTerminal(TerminalNode arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterSql_statement(Sql_statementContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitSql_statement(Sql_statementContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterCreate_table(Create_tableContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitCreate_table(Create_tableContext ctx) {
        service.createTableByContext(ctx);
    }

    @Override
    public void enterColumn_definition(Column_definitionContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitColumn_definition(Column_definitionContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterTable_name(Table_nameContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitTable_name(Table_nameContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterColumn_name(Column_nameContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitColumn_name(Column_nameContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterInsert_into(Insert_intoContext ctx) {
        System.out.println("Entering insert_into.");
    }

    @Override
    public void exitInsert_into(Insert_intoContext ctx) {
        System.out.println("Exiting insert_into.");
        service.insertIntoByContext(ctx);
    }

    @Override
    public void enterValue(ValueContext ctx) {

    }

    @Override
    public void exitValue(ValueContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterInsert_column_definition(Insert_column_definitionContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitInsert_column_definition(Insert_column_definitionContext ctx) {
        // TODO Auto-generated method stub

    }

}
