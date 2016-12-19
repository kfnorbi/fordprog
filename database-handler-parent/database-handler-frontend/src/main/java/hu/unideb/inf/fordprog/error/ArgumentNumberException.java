package hu.unideb.inf.fordprog.error;

/**
 *
 *
 */
public class ArgumentNumberException extends SQLException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ArgumentNumberException() {
        super();
    }

    public ArgumentNumberException(String message) {
        super("SQL Error - 6: " + message);
    }

    public ArgumentNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArgumentNumberException(Throwable cause) {
        super(cause);
    }

    protected ArgumentNumberException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
