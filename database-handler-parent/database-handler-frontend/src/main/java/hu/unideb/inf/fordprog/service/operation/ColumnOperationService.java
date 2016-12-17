package hu.unideb.inf.fordprog.service.operation;

import java.util.ArrayList;
import java.util.List;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Column_definitionContext;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnDescriptor;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnType;

/**
 * Oszlop műveleteket megvalósító szolgáltatás.
 */
public class ColumnOperationService extends AbstractOperationService {

    /**
     * Táblák létrehozása kontextus alapján.
     *
     * @param columnDefinition
     *            az oszlopok létrehozásához szükséges kontextus.
     * @return a létrehozott táblák listája.
     */
    public List<DatabaseTableColumnDescriptor> createColumnsByContext(List<Column_definitionContext> columnDefinition) {
        final List<DatabaseTableColumnDescriptor> result = new ArrayList<>();
        Integer index = 1;
        for (final Column_definitionContext columnDefinitionContext : columnDefinition) {
            final String columnTypeText = columnDefinitionContext.columnType.getText();
            final DatabaseTableColumnType type = DatabaseTableColumnType.valueOf(columnTypeText.toUpperCase());
            result.add(new DatabaseTableColumnDescriptor(index++, columnDefinitionContext.columnName.getText(), type));
        }
        return result;
    }
}
