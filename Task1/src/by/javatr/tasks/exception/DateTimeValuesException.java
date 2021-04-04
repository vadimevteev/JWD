package by.javatr.tasks.exception;

public class DateTimeValuesException extends Exception{
    public DateTimeValuesException() {
        super();
    }

    public DateTimeValuesException(String message) {
        super(message);
    }

    public DateTimeValuesException(String message, Throwable cause) {
        super(message, cause);
    }

    public DateTimeValuesException(Throwable cause) {
        super(cause);
    }

    public DateTimeValuesException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
