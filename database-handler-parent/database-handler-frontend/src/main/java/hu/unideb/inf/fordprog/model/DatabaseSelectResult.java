package hu.unideb.inf.fordprog.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import lombok.experimental.Delegate;

/**
 *
 *
 */

public class DatabaseSelectResult {

    private static final String DELIMITER = "|";

    private static final String ENDLINE = "\n";

    private Set<DatabaseTableColumnDescriptor> columns;

    @Delegate
    private List<DatabaseSelectRecord> selectRecords;

    public DatabaseSelectResult() {
        selectRecords = new ArrayList<>();
    }

    public DatabaseSelectResult(Set<DatabaseTableColumnDescriptor> columns, List<DatabaseSelectRecord> selectRecords) {
        super();
        this.columns = columns;
        this.selectRecords = selectRecords;
    }

    public Set<DatabaseTableColumnDescriptor> getColumns() {
        return columns;
    }

    public void setColumns(Set<DatabaseTableColumnDescriptor> columns) {
        this.columns = columns;
    }

    public List<DatabaseSelectRecord> getSelectRecords() {
        return selectRecords;
    }

    public void setSelectRecords(List<DatabaseSelectRecord> selectRecords) {
        this.selectRecords = selectRecords;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
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
                        builder.append(createDisplayData(columnName, databaseData));
                        break;
                    }
                }
                if (!found) {
                    builder.append(buildNan(columnName));
                }

            }
            builder.append(ENDLINE);
        }
        return builder.toString();
    }

    private String createDisplayData(String columnName, DatabaseData databaseData) {
        return DELIMITER + insertEscape(databaseData.getValue(), columnName) + databaseData.getValue() + DELIMITER;
    }

    private String formatColumnName(DatabaseTableColumnDescriptor column) {
        return DELIMITER + column.getColumnName() + DELIMITER;
    }

    private String buildNan(String columnName) {
        return "|" + insertEscape("-", columnName) + "-|";
    }

    private String insertEscape(String value, String columnName) {
        int size = columnName.length() - value.length();
        StringBuilder builder = new StringBuilder();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((columns == null) ? 0 : columns.hashCode());
        result = prime * result + ((selectRecords == null) ? 0 : selectRecords.hashCode());
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
        DatabaseSelectResult other = (DatabaseSelectResult) obj;
        if (columns == null) {
            if (other.columns != null)
                return false;
        } else if (!columns.equals(other.columns))
            return false;
        if (selectRecords == null) {
            if (other.selectRecords != null)
                return false;
        } else if (!selectRecords.equals(other.selectRecords))
            return false;
        return true;
    }

}
