package hu.unideb.inf.fordprog.service.operation;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.ExpressionLabelContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Simple_expressionContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.WhereClauseContext;
import hu.unideb.inf.fordprog.model.DatabaseData;
import hu.unideb.inf.fordprog.model.DatabaseSelectRecord;
import hu.unideb.inf.fordprog.model.DatabaseSelectResult;

/**
 * A WHERE feltételt kiszolgáló szolgáltatás.
 *
 */
public class WhereOperationService extends AbstractOperationService {

    /**
     * Osztály loggere.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(WhereOperationService.class);

    /**
     *
     * @param ctx
     * @param selectResult
     * @return
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
        List<DatabaseData> result = data.stream().filter(p -> p.getColumnName().equals(column))
                .filter(p -> isFitSqlCondition(p.getValue(), condition, operator)).collect(Collectors.toList());
        return !result.isEmpty();
    }

    private boolean isFitSqlCondition(String value, String condition, String operator) {
        boolean result;
        LOGGER.debug("{} {} {}", value, operator, condition);
        Double numberValue;
        Double numberCondition;
        switch (operator) {
        case "=":
            result = isEquals(value, condition);
            break;
        case ">":
            numberValue = Double.valueOf(value);
            numberCondition = Double.valueOf(condition);
            result = numberValue > numberCondition;
            break;
        case "<":
            numberValue = Double.valueOf(value);
            numberCondition = Double.valueOf(condition);
            result = numberValue < numberCondition;
            break;
        case "<=":
            numberValue = Double.valueOf(value);
            numberCondition = Double.valueOf(condition);
            result = numberValue <= numberCondition;
            break;
        case ">=":
            numberValue = Double.valueOf(value);
            numberCondition = Double.valueOf(condition);
            result = numberValue >= numberCondition;
            break;
        case "!=":
            result = !isEquals(value, condition);
            break;
        default:
            result = false;
            break;
        }
        LOGGER.debug("SQL filter result: {}", result);
        return result;
    }

    private boolean isEquals(String value, String condition) {
        boolean result;
        Double numberValue;
        Double numberCondition;
        if (isNumbers(value, condition)) {
            numberValue = Double.valueOf(value);
            numberCondition = Double.valueOf(condition);
            result = numberValue.equals(numberCondition);
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
