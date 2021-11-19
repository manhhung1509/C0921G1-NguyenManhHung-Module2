package bai_15_exception_va_debug.bai_tap.su_dung_lop_ilegal_triangle_exception;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super("các cạnh không hợp lệ. nhập lại: ");
    }

    public IllegalTriangleException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

}
