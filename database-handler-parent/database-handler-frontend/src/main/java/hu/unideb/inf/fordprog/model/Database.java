package hu.unideb.inf.fordprog.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 *
 *
 */
public final class Database {

    private static List<DatabaseTable> tables;
    private static Map<String, List<DatabaseData>> data;
    static {
        tables = new ArrayList<>();
        data = new HashMap<>();
    }

    public static List<DatabaseTable> getTables() {
        return tables;
    }

    public static DatabaseTable getTableByName(String name) {
        return tables.stream().filter((DatabaseTable t) -> {
            return t.getName().equals(name);
        }).findFirst().orElse(null);
    }

    public static void addTable(DatabaseTable t) {
        tables.add(t);
    }

    public static void insertIntoTable(String tableName, DatabaseData element) {
        List<DatabaseData> list = data.get(tableName);
        if (list == null)
            list = new ArrayList<>();
        list.add(element);
    }

    public static DatabaseTableColumnType getTableColumnTypeByTableAndColumnName(String tableName, String columnName) {
        Optional<Optional<DatabaseTableColumnDescriptor>> findFirst = tables.stream()
                .filter(p -> p.getName().equals(tableName))
                .map(p -> p.getColumns().stream().filter(c -> c.getColumnName().equals(columnName)).findFirst())
                .findFirst();
        return findFirst.get().get().getType();
    }

}
