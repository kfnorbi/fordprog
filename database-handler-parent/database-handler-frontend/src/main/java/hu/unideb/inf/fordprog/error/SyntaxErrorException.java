package hu.unideb.inf.fordprog.error;
/**
 *
 *
 */
public class SyntaxErrorException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public SyntaxErrorException() {
        super();
    }

    public SyntaxErrorException(String message) {
        super(message);
    }

    public SyntaxErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public SyntaxErrorException(Throwable cause) {
        super(cause);
    }

    protected SyntaxErrorException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
