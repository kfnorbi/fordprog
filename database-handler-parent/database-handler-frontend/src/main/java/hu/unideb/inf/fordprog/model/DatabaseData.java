package hu.unideb.inf.fordprog.model;

import lombok.Builder;

/**
 * Adatbázis adat, egy rekordon belüli adatszelet.
 *
 */
@Builder
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((columnName == null) ? 0 : columnName.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DatabaseData other = (DatabaseData) obj;
        if (columnName == null) {
            if (other.columnName != null)
                return false;
        } else if (!columnName.equals(other.columnName))
            return false;
        if (type != other.type)
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

}
