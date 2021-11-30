package case_study.furamaResort.services.exception;

public class IllegalNumberOfFloorException extends Exception{
    public IllegalNumberOfFloorException() {
        super("Input is not a number" );
    }

    public IllegalNumberOfFloorException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
