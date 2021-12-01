package case_study.furamaResort.models.people;

public class Employee extends Person {
    private String level;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(String level, String position, int salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String code, String name, String birthDay, String gender, String id, String phoneNumber,
                    String email, String level, String position, int salary) {
        super(code, name, birthDay, gender, id, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return code + "," + name + "," + birthDay + "," + gender + "," + id + "," + phoneNumber + "," + email + "," + level + "," + position + "," + salary;

    }
}
