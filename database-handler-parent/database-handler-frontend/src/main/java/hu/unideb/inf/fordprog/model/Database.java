package hu.unideb.inf.fordprog.model;

import java.util.ArrayList;
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
 * Memóriában tárolt adatbázis.
 *
 */
public final class Database {

    /**
     * Osztály loggere.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Database.class);

    /**
     * Táblákat tartalmazó lista.
     */
    private static List<DatabaseTable> tables;

    /**
     * Adatokat tartalmazó Map melynek kulcsa a tábla neve, értéke pedig a
     * táblában lévő rekordok.
     */
    private static Map<String, List<DatabaseRecord>> data;

    static {
        tables = new ArrayList<>();
        data = new HashMap<>();
    }

    private Database() {
    }

    /**
     * Az összes tábla lekérése.
     *
     * @return az összes tábla listája.
     */
    public static List<DatabaseTable> getTables() {
        return tables;
    }

    /**
     * Tábla keresése az adatbázisban.
     *
     * @param name
     *            a tábla neve.
     * @return a megtalált tábla ha létezik, ha nem akkor NULL.
     */
    public static DatabaseTable getTableByName(final String name) {
        return tables.stream().filter((DatabaseTable table) -> table.getName().equals(name)).findFirst().orElse(null);
    }

    /**
     * Új tábla beszúrása.
     *
     * @param newTable
     *            az új tábla példánya.
     */
    public static void addTable(final DatabaseTable newTable) {
        LOGGER.info("Creating table with name:{}", newTable.getName());
        if (getTableByName(newTable.getName()) != null) {
            LOGGER.error("Table already exists with name: {}", newTable.getName());
            throw new TableAlreadyExistsException("Table already exists.");
        }
        tables.add(newTable);
    }

    /**
     * Új adatbázis elem beszúrása táblába.
     *
     * @param tableName
     *            a tábla neve.
     * @param element
     *            az új beszúrandó adat.
     */
    public static void insertIntoTable(final String tableName, final DatabaseRecord element) {
        LOGGER.debug("Inserting data into table: {}", tableName);
        final DatabaseTable table = getTableByName(tableName);
        List<DatabaseRecord> list = data.get(tableName);
        if (list == null) {
            LOGGER.debug("Table is empty, creating new list for data.");
            list = new ArrayList<>();
            data.put(tableName, list);
        }
        Integer rows = table.getRows();
        element.setIndex(rows++);
        list.add(element);
        table.incrementRow();
    }

    /**
     * Adatbázis tábla oszlopának típusa lekérdezése.
     *
     * @param tableName
     *            a tábla neve.
     * @param columnName
     *            oszlop neve.
     * @return az oszlop típusa.
     */
    public static DatabaseTableColumnType getTableColumnTypeByTableAndColumnName(final String tableName,
            final String columnName) {
        isTableExists(tableName);
        final Optional<Optional<DatabaseTableColumnDescriptor>> findFirst = tables.stream()
                .filter(p -> p.getName().equals(tableName))
                .map(p -> p.getColumns().stream().filter(c -> c.getColumnName().equals(columnName)).findFirst())
                .findFirst();
        return findFirst.get().get().getType();
    }

    /**
     * Tábla létezésének vizsgálata.
     *
     * @param tableName
     *            a tábla neve.
     * @return true ha a tábla létezik, TableDoesNotExistsException ha nem.
     */
    public static boolean isTableExists(final String tableName) {
        if (getTableByName(tableName) == null) {
            throw new TableDoesNotExistsException("Table does not exists.");
        } else {
            return true;
        }
    }

    /**
     * Oszlop létezésének vizsgálata egy táblán belül.
     *
     * @param tableName
     *            a tábla neve.
     * @param columnName
     *            a keresendő oszlop neve.
     * @return true ha létezik az oszlop a táblában,
     *         ColumnDoesNotExistsException ha nem.
     */
    public static boolean isColumnExistsInTable(final String tableName, final String columnName) {
        final DatabaseTable tableByName = getTableByName(tableName);
        if (tableByName != null) {
            try {
                tableByName.getColumnByName(columnName);
            } catch (NoSuchElementException e) {
                LOGGER.error("Column " + columnName + " does not exists in table:" + tableName);
                throw new ColumnDoesNotExistsException(
                        "Column " + columnName + " does not exists in table:" + tableName);
            }
        }
        return true;
    }

    /**
     * Adatok lekérdezése egy táblából.
     *
     * @param tableName
     *            a tábla neve.
     * @return a táblában szereplő adatok listája.
     */
    public static List<DatabaseRecord> getDataFromTable(final String tableName) {
        isTableExists(tableName);
        return data.get(tableName);
    }

    /**
     * Oszlopnevek lekérése eredeti sorrendükben.
     *
     * @param tableName
     *            a tábla neve.
     * @return az oszlopok rendezett halmazban.
     */
    public static Set<DatabaseTableColumnDescriptor> getColumnsOrderedFromTable(final String tableName) {
        DatabaseTable table = getTableByName(tableName);
        Supplier<TreeSet<DatabaseTableColumnDescriptor>> supplier = () -> new TreeSet<DatabaseTableColumnDescriptor>();
        return table.getColumns().stream().collect(Collectors.toCollection(supplier));
    }

    /**
     * Adatbázis ürítése.
     */
    public static void clearDatabase() {
        data = new HashMap<>();
        tables = new ArrayList<>();
    }

}
