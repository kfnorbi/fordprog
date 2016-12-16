package hu.unideb.inf.fordprog.model;

/**
 *
 *
 */
public class DatabaseData {

    private DatabaseTableColumnType type;
    private String value;

    public DatabaseData() {
    }

    public DatabaseData(DatabaseTableColumnType type, String value) {
        super();
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

}
