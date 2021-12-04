package test_final_module_2.service.exception;

public class NotFoundBankAccountException extends Exception {
    public NotFoundBankAccountException() {
        super("Account is not exits" );
    }

    public NotFoundBankAccountException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
