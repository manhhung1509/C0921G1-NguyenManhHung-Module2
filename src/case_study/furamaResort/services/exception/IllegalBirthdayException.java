package case_study.furamaResort.services.exception;

public class IllegalBirthdayException extends Exception {
    public IllegalBirthdayException() {
        super("Please enter the correct format request: dd/mm/YYYY\n" );
    }

    public IllegalBirthdayException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
