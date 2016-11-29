package hu.unideb.inf.fordprog.parser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.ColumnDefinitionContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.CreateTableStatementContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.SqlStatementContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerVisitor;
import hu.unideb.inf.fordprog.model.Database;
import hu.unideb.inf.fordprog.model.DatabaseElement;
import hu.unideb.inf.fordprog.model.DatabaseIdentifyerDescriptor;
import hu.unideb.inf.fordprog.model.DatabaseTable;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnDescriptor;

public class DatabaseSqlAntlrVisitor implements DatabaseHandlerVisitor<DatabaseElement> {

	@Override
	public DatabaseElement visit(ParseTree arg0) {
		return null;
	}

	@Override
	public DatabaseElement visitChildren(RuleNode arg0) {
		return null;
	}

	@Override
	public DatabaseElement visitErrorNode(ErrorNode arg0) {
		return null;
	}

	@Override
	public DatabaseElement visitTerminal(TerminalNode arg0) {
		return new DatabaseIdentifyerDescriptor(arg0.getText());
	}

	@Override
	public DatabaseElement visitSqlStatement(SqlStatementContext ctx) {
		return null;
	}

	@Override
	public DatabaseElement visitCreateTableStatement(CreateTableStatementContext ctx) {
		DatabaseElement tableName = visit(ctx.TABLE_NAME());
		DatabaseTable t = new DatabaseTable();

		List<DatabaseTableColumnDescriptor> columnDescriptors= new ArrayList<>();
		
		for (ColumnDefinitionContext columCtx:ctx.columnDefinition()){
			DatabaseElement descriptor= visit(columCtx);
			columnDescriptors.add((DatabaseTableColumnDescriptor) descriptor);
		}
		
		t.setColumns(columnDescriptors);
		t.setName(((DatabaseIdentifyerDescriptor)tableName).getValue());
		return t;
	}

	@Override
	public DatabaseElement visitColumnDefinition(ColumnDefinitionContext ctx) {
		DatabaseIdentifyerDescriptor columnName = (DatabaseIdentifyerDescriptor) visitTerminal(ctx.COLUMN_NAME());
		DatabaseTableColumnDescriptor databaseTableColumnDescriptor = new DatabaseTableColumnDescriptor();
		databaseTableColumnDescriptor.setColumnName(columnName.getValue());
		return databaseTableColumnDescriptor;
	}

}
