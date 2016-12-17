package hu.unideb.inf.fordprog.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import hu.unideb.inf.fordprog.model.Database;
import hu.unideb.inf.fordprog.model.DatabaseTable;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnDescriptor;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnType;

/**
 * Az adatbázis műveleket segítő osztály.
 *
 */
public final class DatabaseHelper {

    /**
     * Alapértelmezett dátum formátum.
     */
    private static final String DATE_FORMAT = "yyyy-mm-dd";
    /**
     * Aposztróf konstans.
     */
    private static final String APOSTROPHE = "'";

    private DatabaseHelper() {
        // empty
    }

    /**
     * A bemeneti adatot vizsgálja hogy az megfelelő-e az oszlop típusához.
     *
     * @param tableName
     *            a tábla neve.
     * @param columnName
     *            az oszlop neve.
     * @param value
     *            a vizsgálandó adat.
     * @return <b>true</b> ha a bejövő adat megfelel az oszlop típusával,
     *         <b>false</b> ha nem.
     */
    public static boolean isDataEligibleForType(final String tableName, final String columnName, final String value) {
        final DatabaseTable table = Database.getTableByName(tableName);
        final DatabaseTableColumnDescriptor column = table.getColumnByName(columnName);
        final DatabaseTableColumnType type = column.getType();
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
        default:
            break;
        }
        return result;
    }

    /**
     * Aposztróf eltávolítása a szövegből.
     *
     * @param value
     *            a szöveg.
     * @return az aposztróftalanított szöveg.
     */
    public static String removeApostrophes(final String value) {
        return value.replaceAll(APOSTROPHE, "");
    }

    /**
     * Megvizsgálja hogy a bemeneti adat dátum-e vagy sem.
     *
     * @param value
     *            a vizsgálandó adat.
     * @return <b>true</b> ha a bejövő adat dátum <b>false</b> ha nem.
     */
    public static boolean isDate(final String value) {
        final SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
        Boolean result = true;
        try {
            format.parse(value);
        } catch (ParseException e) {
            result = false;
        }
        return result;
    }

    /**
     * Megvizsgálja hogy a bemeneti adat szám-e vagy sem.
     *
     * @param value
     *            a vizsgálandó adat.
     * @return <b>true</b> ha a bejövő adat szám <b>false</b> ha nem.
     */
    public static boolean isNumber(final String value) {
        Boolean result;
        try {
            Double.valueOf(value);
            result = true;
        } catch (NumberFormatException e) {
            result = false;
        }
        return result;
    }

    /**
     * Megvizsgálja hogy a bemeneti adat szöveg-e vagy sem.
     *
     * @param value
     *            a vizsgálandó adat.
     * @return <b>true</b> ha a bejövő adat szöveg <b>false</b> ha nem.
     */
    public static boolean isVarchar(final String value) {
        return isStarAndEndWithApostrophe(value) ? true : false;
    }

    /**
     * Megvizsgálja hogy a bemeneti adat aposztróffal kezdődik-e vagy sem.
     *
     * @param value
     *            a vizsgálandó adat.
     * @return <b>true</b> ha a igen, <b>false</b> ha nem.
     */
    public static boolean isStarAndEndWithApostrophe(final String value) {
        return value.startsWith(APOSTROPHE) && value.endsWith(APOSTROPHE);
    }

}
