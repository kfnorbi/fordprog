package hu.unideb.inf.fordprog.model;

import java.util.ArrayList;
import java.util.List;

import lombok.experimental.Delegate;

public class DatabaseSelectRecord {

    @Delegate
    private List<DatabaseData> data;

    public DatabaseSelectRecord() {
        this.data = new ArrayList<>();
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
