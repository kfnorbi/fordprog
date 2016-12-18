package hu.unideb.inf.fordprog.model;

import java.util.ArrayList;
import java.util.List;

import lombok.experimental.Delegate;

/**
 * Egy rekord lekérdezését leíró modell osztály.
 *
 */
public class DatabaseSelectRecord {

    @Delegate
    private List<DatabaseData> data;

    /**
     *
     */
    public DatabaseSelectRecord() {
        this.data = new ArrayList<>();
    }

    /**
     *
     * @param data
     */
    public DatabaseSelectRecord(List<DatabaseData> data) {
        super();
        this.data = data;
    }

    public List<DatabaseData> getData() {
        return data;
    }

    public void setData(List<DatabaseData> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DatabaseSelectRecord [data=" + data + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((data == null) ? 0 : data.hashCode());
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
        DatabaseSelectRecord other = (DatabaseSelectRecord) obj;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        return true;
    }

}
