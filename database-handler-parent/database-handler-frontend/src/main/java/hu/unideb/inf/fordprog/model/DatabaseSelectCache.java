package hu.unideb.inf.fordprog.model;

import java.util.List;

/**
 * SELECT utasítás után a felhasználó innen éri el az adatait.
 *
 * @author Nandi
 *
 */
public final class DatabaseSelectCache {

    private static DatabaseSelectResult databaseCache;

    static {
        resetCache();
    }

    private DatabaseSelectCache() {
    }

    public static void addDataToCache(List<DatabaseSelectRecord> records) {
        databaseCache.getSelectRecords().addAll(records);
    }

    public static void addDataToCache(DatabaseSelectRecord record) {
        databaseCache.getSelectRecords().add(record);
    }

    public static void resetCache() {
        databaseCache = new DatabaseSelectResult();
    }

    public static DatabaseSelectResult getDatabaseCache() {
        return databaseCache;
    }

    public static void setDatabaseCache(DatabaseSelectResult databaseCache) {
        DatabaseSelectCache.databaseCache = databaseCache;
    }

}
