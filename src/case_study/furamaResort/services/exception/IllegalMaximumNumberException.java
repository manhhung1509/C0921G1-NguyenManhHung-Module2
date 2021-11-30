package case_study.furamaResort.services.exception;

public class IllegalMaximumNumberException extends Exception{
    public IllegalMaximumNumberException() {
        super("Input is not a number" );
    }

    public IllegalMaximumNumberException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
