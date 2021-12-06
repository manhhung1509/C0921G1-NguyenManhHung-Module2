package case_study.furamaResort.services.impl;

import case_study.furamaResort.utils.WriteReadFile;
import case_study.furamaResort.models.people.Employee;
import case_study.furamaResort.services.EmployeeService;
import on_tap.manage_student.common.FileUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    Scanner sc = new Scanner(System.in);
    String[] levels = {"Trung cấp", "Cao đẳng", "Đại học", "sau đại học"};
    String[] positions = {"Lễ tân", "phục vụ", "chuyên viên", "giám sát", "quản lý", "giám đốc"};
    final String path = "C:\\newcodegym\\C0921G1-NguyenManhHung-Module2\\src\\case_study\\furamaResort\\data\\employee.csv";
    static List<Employee> employeeList;

    {
        employeeList = covertStringToEmployee();
    }

    @Override
    public void addNew() {
        System.out.println("enter employee code: ");
        String code = sc.nextLine();
        System.out.println("enter  name of employee : ");
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
        FileUtils.writeFile(path, covertEmployeeToString(), false);
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
        FileUtils.writeFile(path, covertEmployeeToString(), false);
    }

    @Override
    public void displayListEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public List<String> covertEmployeeToString() {
        List<String> listString = new ArrayList<>();
        for (Employee employee : employeeList) {
            listString.add(employee.toString());
        }
        return listString;
    }

    public List<Employee> covertStringToEmployee() {
        List<String> stringList = WriteReadFile.readFile(path);
        List<Employee> employeeList = new ArrayList<>();
        String[] arrEmployee;
        for (String line : stringList) {
            arrEmployee = line.split(",");
            employeeList.add(new Employee(arrEmployee[0], arrEmployee[1], arrEmployee[2], arrEmployee[3], arrEmployee[4], arrEmployee[5], arrEmployee[6], arrEmployee[7], arrEmployee[8], Integer.parseInt(arrEmployee[9])));
        }
        return employeeList;
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
