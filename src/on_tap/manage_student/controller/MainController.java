package on_tap.manage_student.controller;

import on_tap.manage_student.service.IStudentService;
import on_tap.manage_student.service.impl.StudentService;
import on_tap.manage_student.service.impl.StudentServiceChar;

import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    IStudentService studentService = new StudentServiceChar();

    public void setStudentService(IStudentService studentService) {
        this.studentService = studentService;
    }

    public void menu() {
        int choice;
        while (true) {
            System.out.println("Please choice:\n" +
                    "1. Add \n" +
                    "2. Display \n" +
                    "3. Search \n" +
                    "4. Remove \n" +
                    "5. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentService.addStudent();
                    break;
                case 2:
                    studentService.displayStudent();
                    break;
                case 3:
                    studentService.findStudent();
                    break;
                case 4:
                    studentService.deleteStudent();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

}
