package hu.unideb.inf.fordprog.model;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import hu.unideb.inf.fordprog.error.ColumnDoesNotExistsException;

/**
 * Adatbázis rekord.
 *
 */
public class DatabaseRecord {

    private Integer index;
    private List<DatabaseData> data;

    public DatabaseRecord() {
    }

    public DatabaseRecord(List<DatabaseData> data) {
        super();
        this.data = data;
    }

    public Integer getIndex() {
        return index;

    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public List<DatabaseData> getData() {
        return data;
    }

    public void setData(List<DatabaseData> data) {
        this.data = data;
    }

    public DatabaseData getDataByColumnName(String columnName) {
        Optional<DatabaseData> dbData = data.stream().filter(p -> p.getColumnName().equals(columnName)).findFirst();
        try {
            return dbData.get();
        } catch (NoSuchElementException e) {
            throw new ColumnDoesNotExistsException("Asked column does not exists.");
        }
    }

    @Override
    public String toString() {
        return "DatabaseRecord [index=" + index + ", data=" + data + "]";
    }

}
