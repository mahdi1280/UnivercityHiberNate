package exception;

public class NoValidUserName extends RuntimeException {

    public NoValidUserName(String message) {
        super(message);
    }
}
