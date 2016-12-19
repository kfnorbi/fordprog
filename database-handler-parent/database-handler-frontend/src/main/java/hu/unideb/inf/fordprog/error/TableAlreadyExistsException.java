package hu.unideb.inf.fordprog.error;

/**
 *
 *
 */
public class TableAlreadyExistsException extends SQLException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public TableAlreadyExistsException() {
        super();
    }

    public TableAlreadyExistsException(String message) {
        super("SQL Error - 2: " + message);
    }

    public TableAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public TableAlreadyExistsException(Throwable cause) {
        super(cause);
    }

    protected TableAlreadyExistsException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
