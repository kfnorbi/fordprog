package hu.unideb.inf.fordprog.error;

/**
 *
 *
 */
public class TableDoesNotExistsException extends SQLException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public TableDoesNotExistsException() {
        super();
    }

    public TableDoesNotExistsException(String message) {
        super("SQL Error - 3: " + message);
    }

    public TableDoesNotExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public TableDoesNotExistsException(Throwable cause) {
        super(cause);
    }

    protected TableDoesNotExistsException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
