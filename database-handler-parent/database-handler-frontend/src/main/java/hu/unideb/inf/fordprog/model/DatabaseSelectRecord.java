package hu.unideb.inf.fordprog.model;

import java.util.List;

public class DatabaseSelectRecord {

    private List<DatabaseData> data;

    public DatabaseSelectRecord() {
    }

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

}
