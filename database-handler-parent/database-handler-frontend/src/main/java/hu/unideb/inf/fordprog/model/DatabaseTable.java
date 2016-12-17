package hu.unideb.inf.fordprog.model;

import java.util.List;

public class DatabaseTable extends DatabaseElement {

    private String name;

    private List<DatabaseTableColumnDescriptor> columns;

    private Integer rows;

    public DatabaseTable() {
        rows = 0;
    }

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

    public DatabaseTableColumnDescriptor getColumnDescriptorByName(String name) {
        return columns.stream().filter((DatabaseTableColumnDescriptor d) -> {
            return d.getColumnName().equals(name);
        }).findFirst().orElse(null);
    }

    public DatabaseTableColumnDescriptor getColumnByName(String columnName) {
        return columns.stream().filter(p -> p.getColumnName().equals(columnName)).findFirst().get();
    }

    @Override
    public String toString() {
        return "DatabaseTable [name=" + name + ", columns=" + columns + "]";
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public void incrementRow() {
        rows++;
    }

}
