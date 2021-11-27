package case_study.furamaResort.services.impl;

import case_study.furamaResort.models.people.Employee;
import case_study.furamaResort.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    Scanner sc = new Scanner(System.in);
    String[] levels = {"Trung cấp", "Cao đẳng", "Đại học", "sau đại học"};
    String[] positions = {"Lễ tân", "phục vụ", "chuyên viên", "giám sát", "quản lý", "giám đốc"};
    static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee("EP01", "Nguyễn Mạnh Hùng", "20/1/2000", "nam", "0312123812314",
                "0904123567", "hungmanh@gmail.com", "đại học", "giám đốc", 50000000));
        employeeList.add(new Employee("EP02", "Trần Hoàng Hải ", "25/11/2001", "nam", "34324232342223",
                "09871232471", "hoanghai123@gmail.com", ": Trung cấp", "chuyên viên", 15000000));
        employeeList.add(new Employee("EP03", "Dương Tú Anh", "09/6/1996", "nữ", "234244234351233",
                "091233487632", "tuanh232@gmail.com", "sau đại học", "giám sát", 30000000));
    }

    @Override
    public void addNew() {
        System.out.println("enter employee code: ");
        String code = sc.nextLine();
        System.out.println("enter first name of employee : ");
        String name = sc.nextLine();
        System.out.println("enter birthday of employee : ");
        String birthDay = sc.nextLine();
        System.out.println("enter gender of employee : ");
        String gender = sc.nextLine();
        System.out.println("enter citizen identification : ");
        String identify = sc.nextLine();
        System.out.println("enter phone number of employee : ");
        String phone = sc.nextLine();
        System.out.println("enter email of employee : ");
        String email = sc.nextLine();
        int choice;
        do {
            System.out.println("enter level of employee : \n" +
                    "1 to choice trung cap \n" +
                    "2 to choice cao dang \n" +
                    "3 to choice dại hoc \n" +
                    "4 to choice sau dai hoc \n");
            choice = Integer.parseInt(sc.nextLine());
            if (choice < 1 || choice > 4) {
                System.err.println("enter again:");
            } else {
                break;
            }
        } while (true);
        String level = getLevel(choice);
        do {
            System.out.println("enter position of employee : \n" +
                    "1 to choice le tan \n" +
                    "2 to choice phuc vu \n" +
                    "3 to choice chuyen vien \n" +
                    "4 to choice giam sat \n" +
                    "5 to choice quan ly \n" +
                    "6 to choice giam doc \n");
            choice = Integer.parseInt(sc.nextLine());
            if (choice < 1 || choice > 6) {
                System.err.println("enter again:");
            } else {
                break;
            }
        } while (true);
        String position = getPosition(choice);
        System.out.println("enter salary of employee : ");
        int salary = Integer.parseInt(sc.nextLine());
        employeeList.add(new Employee(code, name, birthDay, gender, identify, phone, email, level, position, salary));
    }

    @Override
    public void editEmployee() {
        boolean check = true;
        System.out.println("enter code of employee to edit : ");
        String code = sc.nextLine();
        for (Employee employee : employeeList) {
            if (!code.equals(employee.getCode())) {
                check = false;
            } else {
                do {
                    System.out.println("enter information to edit: \n" +
                            "enter 1 to edit code \n" +
                            "enter 2 to edit name \n" +
                            "enter 3 to edit birthday \n" +
                            "enter 4 to edit gender \n" +
                            "enter 5 to edit identify \n" +
                            "enter 6 to edit phone \n" +
                            "enter 7 to edit email \n" +
                            "enter 8 to edit level \n" +
                            "enter 9 to edit position \n" +
                            "enter 10 to edit salary \n" +
                            "enter 11 to exit \n");
                    int choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            System.out.println("enter code employee:");
                            employee.setCode(sc.nextLine());
                            break;
                        case 2:
                            System.out.println("enter name employee:");
                            employee.setName(sc.nextLine());
                            break;
                        case 3:
                            System.out.println("enter birthday employee:");
                            employee.setBirthDay(sc.nextLine());
                            break;
                        case 4:
                            System.out.println("enter gender employee:");
                            employee.setGender(sc.nextLine());
                            break;
                        case 5:
                            System.out.println("enter identify employee:");
                            employee.setId(sc.nextLine());
                            break;
                        case 6:
                            System.out.println("enter phone employee:");
                            employee.setPhoneNumber(sc.nextLine());
                            break;
                        case 7:
                            System.out.println("enter email employee:");
                            employee.setEmail(sc.nextLine());
                            break;
                        case 8:
                            System.out.println("enter level of employee : \n" +
                                    "1 to choice trung cap \n" +
                                    "2 to choice cao dang \n" +
                                    "3 to choice dại hoc \n" +
                                    "4 to choice sau dai hoc \n");
                            int choice1 = Integer.parseInt(sc.nextLine());
                            employee.setLevel(getLevel(choice1));
                            break;
                        case 9:
                            System.out.println("enter position of employee : \n" +
                                    "1 to choice le tan \n" +
                                    "2 to choice phuc vu \n" +
                                    "3 to choice chuyen vien \n" +
                                    "4 to choice giam sat \n" +
                                    "5 to choice quan ly \n" +
                                    "6 to choice giam doc \n");
                            int choice2 = Integer.parseInt(sc.nextLine());
                            employee.setPosition(getPosition(choice2));
                            break;
                        case 10:
                            System.out.println("enter salary of employee:");
                            employee.setSalary(Integer.parseInt(sc.nextLine()));
                            break;
                    }
                    if (choice == 11) {
                        break;
                    }
                } while (true);
                check = true;
                break;
            }
        }
        if (check == false) {
            System.err.println("employee is not found");
        }
    }

    @Override
    public void displayListEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public String getLevel(int choice) {
        String level = "";
        switch (choice) {
            case 1:
                level = levels[0];
                break;
            case 2:
                level = levels[1];
                break;
            case 3:
                level = levels[2];
                break;
            case 4:
                level = levels[3];
                break;
        }
        return level;
    }

    public String getPosition(int choice) {
        String position = "";
        switch (choice) {
            case 1:
                position = positions[0];
                break;
            case 2:
                position = positions[1];
                break;
            case 3:
                position = positions[2];
                break;
            case 4:
                position = positions[3];
                break;
            case 5:
                position = positions[4];
                break;
            case 6:
                position = positions[5];
                break;
        }
        return position;
    }
}
