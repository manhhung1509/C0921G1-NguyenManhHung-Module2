package bai_10_DSA_danh_sach.demo_ArrayList;

import java.util.ArrayList;

public class StudentService implements IsStudentService {
    ArrayList<Student> studentList = new ArrayList<>();

    {
        studentList.add(new Student(1, "hùng", 18, "nam", 6.5));
        ;
        studentList.add(new Student(2, "hoàng", 19, "nam", 7.5));
        ;
        studentList.add(new Student(3, "nhi", 13, "nữ", 8));
        ;
        studentList.add(new Student(4, "thắng", 24, "nam", 8.2));
        ;
        studentList.add(new Student(5, "huyền", 31, "nữ", 9.6));
        ;
    }

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void displayStudent() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void deleteStudent(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                studentList.remove(i);
            }
        }
    }
}
