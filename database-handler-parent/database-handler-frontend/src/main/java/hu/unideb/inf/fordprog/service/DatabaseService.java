package hu.unideb.inf.fordprog.service;

import java.util.List;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Column_definitionContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.CreateTableContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.InsertIntoContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.SelectContext;
import hu.unideb.inf.fordprog.model.DatabaseSelectResult;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnDescriptor;

public interface DatabaseService {

    public void createTableByContext(CreateTableContext ctx);

    public void insertIntoByContext(InsertIntoContext ctx);

    public DatabaseSelectResult selectByContext(SelectContext ctx);
}
