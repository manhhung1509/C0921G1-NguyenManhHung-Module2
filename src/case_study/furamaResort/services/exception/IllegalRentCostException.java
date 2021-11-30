package case_study.furamaResort.services.exception;

public class IllegalRentCostException extends Exception{
    public IllegalRentCostException() {
        super("Input is not a number " );
    }

    public IllegalRentCostException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
