package case_study.furamaResort.services.exception;

public class IllegalPoolAreaException extends Exception{
    public IllegalPoolAreaException() {
        super("Input is not a number" );
    }

    public IllegalPoolAreaException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
