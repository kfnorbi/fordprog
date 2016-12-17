package hu.unideb.inf.fordprog.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hu.unideb.inf.fordprog.error.ColumnDoesNotExistsException;
import hu.unideb.inf.fordprog.error.TableAlreadyExistsException;
import hu.unideb.inf.fordprog.error.TableDoesNotExistsException;

/**
 *
 *
 */
public final class Database {

    private static final Logger logger = LoggerFactory.getLogger(Database.class);
    private static List<DatabaseTable> tables;
    private static Map<String, List<DatabaseRecord>> data;

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
        logger.info("Creating table with name:{}", t.getName());
        if (getTableByName(t.getName()) != null) {
            logger.error("Table already exists with name: {}", t.getName());
            throw new TableAlreadyExistsException("Table already exists.");
        }
        tables.add(t);
    }

    public static void insertIntoTable(String tableName, DatabaseRecord element) {
        logger.info("Inserting data into table: {}", tableName);
        DatabaseTable table = getTableByName(tableName);
        List<DatabaseRecord> list = data.get(tableName);
        if (list == null) {
            logger.debug("Table is empty, creating new list for data.");
            list = new ArrayList<>();
            data.put(tableName, list);
        }
        Integer rows = table.getRows();
        element.setIndex(rows++);
        list.add(element);
        table.incrementRow();
    }

    public static DatabaseTableColumnType getTableColumnTypeByTableAndColumnName(String tableName, String columnName) {
        isTableExists(tableName);
        Optional<Optional<DatabaseTableColumnDescriptor>> findFirst = tables.stream()
                .filter(p -> p.getName().equals(tableName))
                .map(p -> p.getColumns().stream().filter(c -> c.getColumnName().equals(columnName)).findFirst())
                .findFirst();
        return findFirst.get().get().getType();
    }

    public static boolean isTableExists(String tableName) {
        if (getTableByName(tableName) == null)
            throw new TableDoesNotExistsException("Table does not exists.");
        else
            return true;
    }

    public static boolean isColumnExistsInTable(String tableName, String columnName) {
        DatabaseTable tableByName = getTableByName(tableName);
        if (tableByName != null) {
            try {
                tableByName.getColumnByName(columnName);
            } catch (NoSuchElementException e) {
                throw new ColumnDoesNotExistsException(
                        "Column " + columnName + " does not exists in table:" + tableName);
            }
        }
        return true;
    }

    public static List<DatabaseRecord> getDataFromTable(String tableName) {
        return data.get(tableName);
    }

    public static Set<DatabaseTableColumnDescriptor> getColumnsOrderedFromTable(String tableName) {
        DatabaseTable table = getTableByName(tableName);
        Supplier<TreeSet<DatabaseTableColumnDescriptor>> supplier = () -> new TreeSet<DatabaseTableColumnDescriptor>();
        return table.getColumns().stream().collect(Collectors.toCollection(supplier));
    }

    public static void clearDatabase() {
        data = new HashMap<>();
        tables = new ArrayList<>();
    }

    static class IndexComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }

    }

}
