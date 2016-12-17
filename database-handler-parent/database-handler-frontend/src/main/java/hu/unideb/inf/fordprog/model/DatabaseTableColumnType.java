package hu.unideb.inf.fordprog.model;

/**
 *
 *
 */
public enum DatabaseTableColumnType {
    /**
     *
     */
    VARCHAR("varchar"),
    /**
     *
     */
    NUMBER("number"),
    /**
     *
     */
    DATE("date");

    private String value;

    private DatabaseTableColumnType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }



}
