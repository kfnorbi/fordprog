package hu.unideb.inf.fordprog.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import lombok.experimental.Delegate;

/**
 * Egy lekérdezés adatait tartalmazó osztály modelle.
 *
 */
public class DatabaseSelectResult {

    private Set<DatabaseTableColumnDescriptor> columns;

    @Delegate
    private List<DatabaseSelectRecord> selectRecords;

    private boolean distincted = false;

    private boolean filtered = false;

    /**
     * Konstuktor.
     */
    public DatabaseSelectResult() {
        selectRecords = new ArrayList<>();
    }

    /**
     * Konstuktor tábla és lekérdezési rekord inicializálással.
     *
     * @param columns
     * @param selectRecords
     */
    public DatabaseSelectResult(Set<DatabaseTableColumnDescriptor> columns, List<DatabaseSelectRecord> selectRecords) {
        super();
        this.columns = columns;
        this.selectRecords = selectRecords;
    }

    /**
     *
     * @param columns
     * @param selectRecords
     * @param distincted
     * @param filtered
     */
    public DatabaseSelectResult(Set<DatabaseTableColumnDescriptor> columns, List<DatabaseSelectRecord> selectRecords,
            boolean distincted, boolean filtered) {
        super();
        this.columns = columns;
        this.selectRecords = selectRecords;
        this.distincted = distincted;
        this.filtered = filtered;
    }

    public Set<DatabaseTableColumnDescriptor> getColumns() {
        return columns;
    }

    public void setColumns(Set<DatabaseTableColumnDescriptor> columns) {
        this.columns = columns;
    }

    public List<DatabaseSelectRecord> getSelectRecords() {
        return selectRecords;
    }

    public void setSelectRecords(List<DatabaseSelectRecord> selectRecords) {
        this.selectRecords = selectRecords;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((columns == null) ? 0 : columns.hashCode());
        result = prime * result + ((selectRecords == null) ? 0 : selectRecords.hashCode());
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
        DatabaseSelectResult other = (DatabaseSelectResult) obj;
        if (columns == null) {
            if (other.columns != null)
                return false;
        } else if (!columns.equals(other.columns))
            return false;
        if (selectRecords == null) {
            if (other.selectRecords != null)
                return false;
        } else if (!selectRecords.equals(other.selectRecords))
            return false;
        return true;
    }

    public boolean isDistincted() {
        return distincted;
    }

    public void setDistincted(boolean distincted) {
        this.distincted = distincted;
    }

    public boolean isFiltered() {
        return filtered;
    }

    public void setFiltered(boolean filtered) {
        this.filtered = filtered;
    }

}
