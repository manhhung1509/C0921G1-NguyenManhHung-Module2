package bai_10_DSA_danh_sach.demo_ArrayList;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private double point;

    public Student() {
    }

    public Student(int id, String name, int age, String gender, double point) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.point = point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "ExampleIsIncorrect{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", point=" + point +
                '}';
    }
}
