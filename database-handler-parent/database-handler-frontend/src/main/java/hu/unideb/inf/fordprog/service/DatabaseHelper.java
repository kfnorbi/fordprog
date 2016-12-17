package hu.unideb.inf.fordprog.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import hu.unideb.inf.fordprog.model.Database;
import hu.unideb.inf.fordprog.model.DatabaseTable;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnDescriptor;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnType;

/**
 *
 *
 */
public final class DatabaseHelper {

    private static final String DATE_FORMAT = "yyyy-mm-dd";
    private static final String APOSTROPHE = "'";

    private DatabaseHelper() {
        // empty
    }

    public static boolean isDataEligibleForType(String tableName, String columnName, String value) {
        DatabaseTable table = Database.getTableByName(tableName);
        DatabaseTableColumnDescriptor column = table.getColumnByName(columnName);
        DatabaseTableColumnType type = column.getType();
        boolean result = false;
        switch (type) {
        case VARCHAR:
            result = isVarchar(value);
            break;
        case NUMBER:
            result = isNumber(value);
            break;
        case DATE:
            result = isDate(value);
            break;
        }
        return result;
    }

    public static String removeApostrophes(String value) {
        return value.replaceAll(APOSTROPHE, "");
    }

    public static boolean isDate(String value) {
        SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
        try {
            format.parse(value);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    public static boolean isNumber(String value) {
        try {
            Double.valueOf(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isVarchar(String value) {
        return isStarAndEndWithApostrophe(value) ? true : false;
    }

    public static boolean isStarAndEndWithApostrophe(String value) {
        return value.startsWith(APOSTROPHE) && value.endsWith(APOSTROPHE);
    }

}
