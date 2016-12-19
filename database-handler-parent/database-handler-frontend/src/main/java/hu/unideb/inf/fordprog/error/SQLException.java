package hu.unideb.inf.fordprog.error;

/**
 *
 *
 */
public class SQLException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public SQLException() {
        super();
    }

    public SQLException(String message) {
        super(message);
    }

    public SQLException(String message, Throwable cause) {
        super(message, cause);
    }

    public SQLException(Throwable cause) {
        super(cause);
    }

    protected SQLException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
