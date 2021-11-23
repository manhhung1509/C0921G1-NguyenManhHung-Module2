package b17_binary_file.manage_student.controller;

import b17_binary_file.manage_student.service.IStudentService;
import b17_binary_file.manage_student.service.impl.StudentService;

import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    IStudentService studentService = new StudentService();

    public void menu() {
        int choice;
        while (true) {
            System.out.println("Please choice:\n" +
                    "1. Add \n" +
                    "2. Display \n" +
                    "3. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    studentService.addStudent();
                    break;
                case 2:
                    studentService.displayStudent();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

}
