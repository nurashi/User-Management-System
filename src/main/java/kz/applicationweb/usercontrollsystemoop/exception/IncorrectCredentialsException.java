package kz.applicationweb.usercontrollsystemoop.exception;

public class IncorrectCredentialsException extends RuntimeException {
    public IncorrectCredentialsException() {
        super("Incorrect credentials");
    }
    public IncorrectCredentialsException(String message) {
        super(message);
    }
}
