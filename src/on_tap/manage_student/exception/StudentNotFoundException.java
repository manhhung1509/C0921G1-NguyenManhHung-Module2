package on_tap.manage_student.exception;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException() {
        super("Student not found");
    }
}
