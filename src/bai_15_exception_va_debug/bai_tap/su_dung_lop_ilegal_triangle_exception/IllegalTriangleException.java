package bai_15_exception_va_debug.bai_tap.su_dung_lop_ilegal_triangle_exception;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super("nhập lại cấy bạn eei :v");
    }

    public IllegalTriangleException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

}
