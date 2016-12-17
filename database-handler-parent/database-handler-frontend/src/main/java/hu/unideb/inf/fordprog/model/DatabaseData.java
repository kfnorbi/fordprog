package hu.unideb.inf.fordprog.model;

/**
 * Adatbázis adat, egy rekordon belüli adatszelet.
 *
 */
public class DatabaseData {

    private String columnName;
    private DatabaseTableColumnType type;
    private String value;

    public DatabaseData() {
    }

    public DatabaseData(String columnName, DatabaseTableColumnType type, String value) {
        super();
        this.columnName = columnName;
        this.type = type;
        this.value = value;
    }

    public DatabaseTableColumnType getType() {
        return type;
    }

    public void setType(DatabaseTableColumnType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Override
    public String toString() {
        return "DatabaseData [columnName=" + columnName + ", type=" + type + ", value=" + value + "]";
    }

}
