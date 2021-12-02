package case_study.furamaResort.services.impl;

import case_study.furamaResort.libs.WriteReadFile;
import case_study.furamaResort.models.people.Customer;
import case_study.furamaResort.services.CustomerService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    Scanner sc = new Scanner(System.in);
    String[] customerTypes = {"Diamond", "Platinum", "Gold", "Silver", "Member"};
    final String path = "C:\\newcodegym\\C0921G1-NguyenManhHung-Module2\\src\\case_study\\furamaResort\\data\\customer.csv";
    static List<Customer> customerList;

    {
        customerList = covertStringToCustomer();
    }


    @Override
    public void addNew() {
        System.out.println("enter Customer code: ");
        String code = sc.nextLine();
        System.out.println("enter name of customer : ");
        String name = sc.nextLine();
        System.out.println("enter birthday of customer : ");
        String birthDay = sc.nextLine();
        System.out.println("enter gender of customer : ");
        String gender = sc.nextLine();
        System.out.println("enter identification : ");
        String identify = sc.nextLine();
        System.out.println("enter phone number of customer : ");
        String phone = sc.nextLine();
        System.out.println("enter email of customer : ");
        String email = sc.nextLine();
        int choice;
        do {
            System.out.println("enter type of customer : \n" +
                    "1 to choice Diamond \n" +
                    "2 to choice Platinum \n" +
                    "3 to choice Gold \n" +
                    "4 to choice Silver \n" +
                    "5 to choice Member \n");
            choice = Integer.parseInt(sc.nextLine());
            if (choice < 1 || choice > 5) {
                System.err.println("enter again:");
            } else {
                break;
            }
        } while (true);
        String typeOfCustomer = getTypeOfCustomer(choice);
        System.out.println("enter address of customer");
        String address = sc.nextLine();
        customerList.add(new Customer(code, name, birthDay, gender, identify, phone, email, typeOfCustomer, address));
        WriteReadFile.writeFile(path, covertCustomerToString(), false);
    }

    @Override
    public void editCustomer() {
        boolean check = true;
        System.out.println("enter code of customer to edit : ");
        String code = sc.nextLine();
        for (Customer customer : customerList) {
            if (!code.equals(customer.getCode())) {
                check = false;
            } else {
                do {
                    System.out.println("enter information of customer to edit: \n" +
                            "enter 1 to edit code \n" +
                            "enter 2 to edit name \n" +
                            "enter 3 to edit birthday \n" +
                            "enter 4 to edit gender \n" +
                            "enter 5 to edit identify \n" +
                            "enter 6 to edit phone \n" +
                            "enter 7 to edit email \n" +
                            "enter 8 to edit type of customer \n" +
                            "enter 9 to edit address \n" +
                            "enter 10 to exit \n");
                    int choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            System.out.println("enter code customer:");
                            customer.setCode(sc.nextLine());
                            break;
                        case 2:
                            System.out.println("enter name customer:");
                            customer.setName(sc.nextLine());
                            break;
                        case 3:
                            System.out.println("enter birthday customer:");
                            customer.setBirthDay(sc.nextLine());
                            break;
                        case 4:
                            System.out.println("enter gender customer:");
                            customer.setGender(sc.nextLine());
                            break;
                        case 5:
                            System.out.println("enter identify customer:");
                            customer.setId(sc.nextLine());
                            break;
                        case 6:
                            System.out.println("enter phone customer:");
                            customer.setPhoneNumber(sc.nextLine());
                            break;
                        case 7:
                            System.out.println("enter email customer:");
                            customer.setEmail(sc.nextLine());
                            break;
                        case 8:
                            System.out.println("enter type of customer : \n" +
                                    "1 to choice Diamond \n" +
                                    "2 to choice Platinum \n" +
                                    "3 to choice Gold \n" +
                                    "4 to choice Silver \n" +
                                    "5 to choice Member \n");
                            int choice1 = Integer.parseInt(sc.nextLine());
                            customer.setTypeCustomer(getTypeOfCustomer(choice1));
                            break;
                        case 9:
                            System.out.println("enter salary of employee:");
                            customer.setAddress(sc.nextLine());
                            break;
                    }
                    if (choice == 10) {
                        break;
                    }
                } while (true);
                check = true;
                break;
            }
        }
        if (check == false) {
            System.err.println("customer is not found");
        }
        WriteReadFile.writeFile(path, covertCustomerToString(), false);
    }

    @Override
    public void displayCustomer() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    public List<String> covertCustomerToString() {
        List<String> listString = new LinkedList<>();
        for (Customer customer : customerList) {
            listString.add(customer.toString());
        }
        return listString;
    }

    public List<Customer> covertStringToCustomer() {
        List<String> stringList = WriteReadFile.readFile(path);
        List<Customer> customerList = new ArrayList<>();
        String[] arrCustomer;
        for (String line : stringList) {
            arrCustomer = line.split(",");
            customerList.add(new Customer(arrCustomer[0], arrCustomer[1], arrCustomer[2], arrCustomer[3], arrCustomer[4], arrCustomer[5], arrCustomer[6], arrCustomer[7], arrCustomer[8]));
        }
        return customerList;
    }

    public String getTypeOfCustomer(int choice) {
        String type = "";
        switch (choice) {
            case 1:
                type = customerTypes[0];
                break;
            case 2:
                type = customerTypes[1];
                break;
            case 3:
                type = customerTypes[2];
                break;
            case 4:
                type = customerTypes[3];
                break;
            case 5:
                type = customerTypes[4];
                break;
        }
        return type;
    }
}
