package hu.unideb.inf.fordprog.error;
/**
 *
 *
 */
public class ColumnDoesNotExistsException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ColumnDoesNotExistsException() {
        super();
    }

    public ColumnDoesNotExistsException(String message) {
        super(message);
    }

    public ColumnDoesNotExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public ColumnDoesNotExistsException(Throwable cause) {
        super(cause);
    }

    protected ColumnDoesNotExistsException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
