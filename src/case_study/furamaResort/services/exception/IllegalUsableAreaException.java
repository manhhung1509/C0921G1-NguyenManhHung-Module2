package case_study.furamaResort.services.exception;

public class IllegalUsableAreaException extends Exception {
    public IllegalUsableAreaException() {
        super("Input is not a number" );
    }

    public IllegalUsableAreaException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
