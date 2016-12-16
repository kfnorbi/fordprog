package hu.unideb.inf.fordprog.model;

public class DatabaseTableColumnDescriptor extends DatabaseElement {

    private String columnName;

    private DatabaseTableColumnType type;

    public DatabaseTableColumnType getType() {
        return type;
    }

    public void setType(DatabaseTableColumnType type) {
        this.type = type;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Override
    public String toString() {
        return "DatabaseTableColumnDescriptor [columnName=" + columnName + ", type=" + type + "]";
    }

}
