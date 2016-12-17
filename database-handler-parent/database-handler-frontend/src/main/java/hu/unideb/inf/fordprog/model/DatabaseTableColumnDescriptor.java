package hu.unideb.inf.fordprog.model;

public class DatabaseTableColumnDescriptor extends DatabaseElement implements Comparable<DatabaseTableColumnDescriptor>{

    private Integer index;

    private String columnName;

    private DatabaseTableColumnType type;

    public DatabaseTableColumnDescriptor() {
    }

    public DatabaseTableColumnDescriptor(Integer index, String columnName, DatabaseTableColumnType type) {
        super();
        this.index = index;
        this.columnName = columnName;
        this.type = type;
    }

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
        return "DatabaseTableColumnDescriptor [index=" + index + ", columnName=" + columnName + ", type=" + type + "]";
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public int compareTo(DatabaseTableColumnDescriptor o) {
        return this.getIndex().compareTo(o.getIndex());
    }

}
