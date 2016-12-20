package hu.unideb.inf.fordprog.service.display;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hu.unideb.inf.fordprog.model.DatabaseData;
import hu.unideb.inf.fordprog.model.DatabaseSelectCache;
import hu.unideb.inf.fordprog.model.DatabaseSelectRecord;
import hu.unideb.inf.fordprog.model.DatabaseSelectResult;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnDescriptor;

/**
 * A megjelenítésért felelős szolgáltatás.
 *
 */
public class DisplayService {

    private static final Integer DEFAULT_DISPLAY_LENGTH = 20;

    private static final String NULL = "NULL";

    private static final String DELIMITER = "|";

    private static final String ENDLINE = "\n";

    private static final Logger LOGGER = LoggerFactory.getLogger(DisplayService.class);

    /**
     * Az adatbázis memóriájában található lekérdezéseket kiirató metódus.
     */
    public void displayResult() {
        DatabaseSelectResult databaseCache = DatabaseSelectCache.getDatabaseCache();
        LOGGER.info("Result:\n{}", buildDisplay(databaseCache.getColumns(), databaseCache.getSelectRecords()));

    }

    private String buildDisplay(Set<DatabaseTableColumnDescriptor> columns, List<DatabaseSelectRecord> selectRecords) {
        StringBuilder builder = new StringBuilder();
        if (columns != null && selectRecords != null) {
            List<DatabaseTableColumnDescriptor> columnList = columns.stream().collect(Collectors.toList());
            for (DatabaseTableColumnDescriptor column : columns) {
                builder.append(formatColumnName(column));
            }
            builder.append(ENDLINE);
            for (DatabaseSelectRecord record : selectRecords) {
                List<DatabaseData> dataList = record.getData();
                for (int i = 0; i < columnList.size(); i++) {
                    String columnName = columnList.get(i).getColumnName();
                    boolean found = false;
                    for (DatabaseData databaseData : dataList) {
                        if (databaseData.getColumnName().equals(columnName)) {
                            found = true;
                        }
                        if (found) {
                            builder.append(createDisplayData(databaseData));
                            break;
                        }
                    }
                    if (!found) {
                        builder.append(buildNull());
                    }

                }
                builder.append(ENDLINE);
            }
        }
        return builder.toString();
    }

    private String createDisplayData(DatabaseData databaseData) {
        return DELIMITER + insertEscape(databaseData.getValue()) + databaseData.getValue() + DELIMITER;
    }

    private String formatColumnName(DatabaseTableColumnDescriptor column) {
        return DELIMITER + insertEscape(column.getColumnName()) + column.getColumnName() + DELIMITER;
    }

    private String buildNull() {
        return DELIMITER + insertEscape(NULL) + NULL + DELIMITER;
    }

    private String insertEscape(String value) {
        int size = DEFAULT_DISPLAY_LENGTH - value.length();
        StringBuilder builder = new StringBuilder();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }

}
