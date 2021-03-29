package by.javatr.tasks.exception;

public class BadDateValuesException extends Exception{
    public BadDateValuesException() {
        super();
    }

    public BadDateValuesException(String message) {
        super(message);
    }

    public BadDateValuesException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadDateValuesException(Throwable cause) {
        super(cause);
    }

    public BadDateValuesException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
