package hu.unideb.inf.fordprog.error;
/**
 *
 *
 */
public class ColumnTypeException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ColumnTypeException() {
        super();
    }

    public ColumnTypeException(String message) {
        super(message);
    }

    public ColumnTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ColumnTypeException(Throwable cause) {
        super(cause);
    }

    protected ColumnTypeException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
