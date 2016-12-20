package hu.unideb.inf.fordprog.service.operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

import hu.unideb.inf.fordprog.model.DatabaseData;
import hu.unideb.inf.fordprog.model.DatabaseSelectRecord;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnType;
import lombok.experimental.UtilityClass;

/**
 * A funkciók használtatát segítő segédosztály.
 *
 */
@UtilityClass
public final class FunctionHelper {

    private static final String COUNT = "count";
    private static final String MAX = "max";
    private static final String MIN = "min";
    private static final String AVG = "avg";
    private static final String SUM = "sum";

    /**
     * Segítségével egy megadott szám listában a kapott funkciót elvégezhetjük.
     *
     * @param function
     *            a listán elvégzendő funckió.
     * @param listForOperand
     *            a számok listája.
     * @param columnName
     *            az oszlop neve.
     * @return a lekérdezési eredmény.
     */
    public static DatabaseSelectRecord doFunctionOnList(String function, List<Double> listForOperand,
            String columnName) {
        DoubleStream doubleStream = listForOperand.stream().flatMapToDouble(DoubleStream::of);
        Double result;
        result = switchFunction(function, doubleStream);
        return new DatabaseSelectRecord(
                Arrays.asList(new DatabaseData(columnName, DatabaseTableColumnType.NUMBER, String.valueOf(result))));
    }

    private static Double switchFunction(String function, DoubleStream doubleStream) {
        Double result;
        switch (function.toLowerCase()) {
        case SUM:
            result = doubleStream.sum();
            break;
        case AVG:
            result = doubleStream.average().getAsDouble();
            break;
        case MIN:
            result = doubleStream.min().getAsDouble();
            break;
        case MAX:
            result = doubleStream.max().getAsDouble();
            break;
        case COUNT:
            result = Double.valueOf(doubleStream.count());
            break;
        default:
            result = 0.0;
            break;
        }
        return result;
    }

}
