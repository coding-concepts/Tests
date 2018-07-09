package ccs.test.mvn.level1.one;

public class BadArgumentException extends RuntimeException {

    public BadArgumentException() {
    }

    public BadArgumentException(String message) {
        super(message);
    }
}
