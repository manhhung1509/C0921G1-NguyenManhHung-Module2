package bai_10_DSA_danh_sach.demo_ArrayList;

import java.util.Scanner;

public class MainController {

    Scanner sc = new Scanner(System.in);
    IsStudentService studentService = new StudentService();

    public void menu() {
        do {
            int choice = 0;
            System.out.println("1. add student \n" +
                    "2. display student \n" +
                    "3. delete student \n " +
                    "4. exit \n");
            System.out.println("enter your choice:");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    studentService.displayStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);
    }

    public void addStudent() {
        System.out.println("nhập id sinh viên");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhập tên sinh viên");
        String name = sc.nextLine();
        System.out.println("nhập tuổi sinh viên");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("nhập giới tính sinh viên");
        String gender = sc.nextLine();
        System.out.println("nhập điểm sinh viên");
        double point = Double.parseDouble(sc.nextLine());
        Student student = new Student(id, name, age, gender, point);
        studentService.addStudent(student);
    }

    public void deleteStudent() {
        System.out.println("nhập id của học sinh muốn xóa khỏi danh sách");
        int id = Integer.parseInt(sc.nextLine());
        studentService.deleteStudent(id);
    }
}
