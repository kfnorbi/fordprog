package hu.unideb.inf.fordprog.model;

import java.util.List;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.ColumnDefinitionContext;

public class DatabaseTable extends DatabaseElement{

	private String name;

	private List<DatabaseTableColumnDescriptor> columns;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<DatabaseTableColumnDescriptor> getColumns() {
		return columns;
	}

	public void setColumns(List<DatabaseTableColumnDescriptor> columns) {
		this.columns = columns;
	}

	public DatabaseTableColumnDescriptor getColumnDescriptorByName(String name){
		return columns.stream().filter((DatabaseTableColumnDescriptor d)->{return d.getColumnName().equals(name);}).findFirst().orElse(null);
	}

}
