package on_tap.manage_student.model;

public class Student extends Person {
    static final long serialVersionUID = 8937341502050489502l;
    private double point;
    private ClassName className;
    public Student(double point) {
        this.point = point;
    }

    public Student(String name, int age, String gender, double point) {
        super(name, age, gender);
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return this.name + "," + this.age + "," + this.gender + "," + this.point ;
    }
}
