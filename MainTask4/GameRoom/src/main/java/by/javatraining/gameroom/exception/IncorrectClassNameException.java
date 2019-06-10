package by.javatraining.gameroom.exception;

public class IncorrectClassNameException extends Exception {

    public IncorrectClassNameException() {
        super();
    }

    public IncorrectClassNameException(String message) {
        super(message);
    }

    public IncorrectClassNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectClassNameException(Throwable cause) {
        super(cause);
    }
}
