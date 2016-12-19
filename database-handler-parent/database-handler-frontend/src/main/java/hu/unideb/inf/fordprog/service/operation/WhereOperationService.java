package hu.unideb.inf.fordprog.service.operation;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.ExpressionLabelContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Simple_expressionContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.WhereClauseContext;
import hu.unideb.inf.fordprog.error.ColumnTypeException;
import hu.unideb.inf.fordprog.model.DatabaseData;
import hu.unideb.inf.fordprog.model.DatabaseSelectRecord;
import hu.unideb.inf.fordprog.model.DatabaseSelectResult;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnType;
import hu.unideb.inf.fordprog.service.DatabaseHelper;

/**
 * A WHERE feltételt kiszolgáló szolgáltatás.
 *
 */
public class WhereOperationService extends AbstractOperationService {

    private static final String NOT_EQUALS_OPERATOR = "!=";

    private static final String GREATER_THAN = ">";

    private static final String GREATER_THAN_EQUALS = ">=";

    private static final String LESS_THAN = "<";

    private static final String LESS_THAN_EQUALS = "<=";

    private static final String EQUALS_OPERATOR = "=";
    /**
     * Osztály loggere.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(WhereOperationService.class);

    /**
     * Beérkező adatok szűrése kontextuson keresztül.
     *
     * @param ctx
     *            a kontextus.
     * @param selectResult
     *            a legelső lekérdezés eredménye.
     * @return a szűrt lekérdezés eredménye.
     */
    public DatabaseSelectResult filterByContext(WhereClauseContext ctx, DatabaseSelectResult selectResult) {
        DatabaseSelectResult result;
        LOGGER.info("Filtering result data in where clause.");
        ExpressionLabelContext expression = (ExpressionLabelContext) ctx.expression();
        List<Simple_expressionContext> simpleExpressions = expression.simple_expression();
        result = filterDataByExpressions(simpleExpressions, selectResult);
        return result;
    }

    private DatabaseSelectResult filterDataByExpressions(List<Simple_expressionContext> simpleExpressions,
            DatabaseSelectResult selectResult) {
        DatabaseSelectResult result = new DatabaseSelectResult();
        result.setColumns(selectResult.getColumns());
        for (Simple_expressionContext simpleExpression : simpleExpressions) {
            List<DatabaseSelectRecord> selectRecords = selectResult.getSelectRecords();
            List<DatabaseSelectRecord> filteredRecords = selectRecords.stream()
                    .filter(p -> isFitToExpression(p.getData(), simpleExpression)).collect(Collectors.toList());
            result.addAll(filteredRecords);
        }
        return result;
    }

    private boolean isFitToExpression(List<DatabaseData> data, Simple_expressionContext simpleExpression) {
        String column = simpleExpression.left.getText();
        String condition = simpleExpression.right.getText();
        String operator = simpleExpression.relation.getText();
        LOGGER.debug("{} {} {}", column, operator, condition);
        List<DatabaseData> result = data.stream().filter(p -> p.getColumnName().equals(column)).filter(
                p -> isFitToType(p, condition, operator) && isFitSqlCondition(p.getValue(), condition, operator))
                .collect(Collectors.toList());
        return !result.isEmpty();
    }

    private boolean isFitToType(DatabaseData p, String condition, String operator) {
        DatabaseTableColumnType type = p.getType();
        if (isConditionEligibleForType(condition, operator, type)) {
            return true;
        }
        throw new ColumnTypeException();
    }

    private boolean isConditionEligibleForType(String condition, String operator, DatabaseTableColumnType type) {
        return isVarcharTypeCondition(condition, operator, type) || isNumberTypeCondition(condition, type);
    }

    private boolean isNumberTypeCondition(String condition, DatabaseTableColumnType type) {
        return isNumberTypeAndData(condition, type);
    }

    private boolean isVarcharTypeCondition(String condition, String operator, DatabaseTableColumnType type) {
        return isVarcharTypeAndData(condition, type) && isOperatorEqualsOrNotEquals(operator);
    }

    private boolean isNumberTypeAndData(String condition, DatabaseTableColumnType type) {
        return DatabaseTableColumnType.NUMBER.equals(type) && DatabaseHelper.isNumber(condition);
    }

    private boolean isVarcharTypeAndData(String condition, DatabaseTableColumnType type) {
        return DatabaseTableColumnType.VARCHAR.equals(type) && DatabaseHelper.isVarchar(condition);
    }

    private boolean isOperatorEqualsOrNotEquals(String operator) {
        return EQUALS_OPERATOR.equals(operator) || NOT_EQUALS_OPERATOR.equals(operator);
    }

    private boolean isFitSqlCondition(String value, String condition, String operator) {
        boolean result;
        LOGGER.debug("{} {} {}", value, operator, condition);
        switch (operator) {
        case EQUALS_OPERATOR:
            result = isEquals(value, condition);
            break;
        case LESS_THAN:
            result = isLessThan(value, condition);
            break;
        case GREATER_THAN:
            result = isGreaterThan(value, condition);
            break;
        case LESS_THAN_EQUALS:
            result = isLessThanEquals(value, condition);
            break;
        case GREATER_THAN_EQUALS:
            result = isGreaterThanEquals(value, condition);
            break;
        case NOT_EQUALS_OPERATOR:
            result = !isEquals(value, condition);
            break;
        default:
            result = false;
            break;
        }
        LOGGER.debug("SQL filter result: {}", result);
        return result;

    }

    private boolean isLessThan(String value, String condition) {
        Double numberValue = Double.valueOf(value);
        Double numberCondition = Double.valueOf(condition);
        return numberValue < numberCondition;
    }

    private boolean isGreaterThan(String value, String condition) {
        Double numberValue = Double.valueOf(value);
        Double numberCondition = Double.valueOf(condition);
        return numberValue > numberCondition;
    }

    private boolean isLessThanEquals(String value, String condition) {
        Double numberValue = Double.valueOf(value);
        Double numberCondition = Double.valueOf(condition);
        return numberValue <= numberCondition;
    }

    private boolean isGreaterThanEquals(String value, String condition) {
        Double numberValue = Double.valueOf(value);
        Double numberCondition = Double.valueOf(condition);
        return numberValue >= numberCondition;
    }

    private boolean isEquals(String value, String condition) {
        boolean result;
        Double numberValue;
        Double numberCondition;
        if (isNumbers(value, condition)) {
            numberValue = Double.valueOf(value);
            numberCondition = Double.valueOf(condition);
            result = numberValue.equals(numberCondition);
        } else if (DatabaseHelper.isVarchar(condition)) {
            String cuttedCondition = DatabaseHelper.removeApostrophes(condition);
            result = value.equals(cuttedCondition);
        } else {
            result = value.equals(condition);
        }
        return result;
    }

    private boolean isNumbers(String value, String condition) {
        try {
            Double.valueOf(value);
            Double.valueOf(condition);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

}
