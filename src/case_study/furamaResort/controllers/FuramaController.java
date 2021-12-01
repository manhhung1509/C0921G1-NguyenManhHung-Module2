package case_study.furamaResort.controllers;

import case_study.furamaResort.services.impl.CustomerServiceImpl;
import case_study.furamaResort.services.impl.EmployeeServiceImpl;
import case_study.furamaResort.services.impl.FacilityServiceImpl;
import javafx.scene.chart.ScatterChart;

import java.util.Scanner;

public class FuramaController {
    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    FacilityServiceImpl facilityService = new FacilityServiceImpl();

    public void displayMainMenu() {
        int choice = 0;
        int choose = 0;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("1. Employee Management");
                System.out.println("2. Customer Management");
                System.out.println("3. Facility Management ");
                System.out.println("4. Booking Management");
                System.out.println("5. Promotion Management");
                System.out.println("6. Exits");
                System.out.println("Enter your chose: \n");
                choice = Integer.parseInt(input.nextLine());

                switch (choice) {
                    case 1:
                        do {
                            try {
                                System.out.println("1. Display list employees");
                                System.out.println("2. Add new employee");
                                System.out.println("3. Edit employee");
                                System.out.println("4. Return Student8 menu");
                                System.out.println("============================ \n");
                                choose = Integer.parseInt(input.nextLine());
                                switch (choose) {
                                    case 1:
                                        employeeService.displayListEmployees();
                                        break;
                                    case 2:
                                        employeeService.addNew();
                                        break;
                                    case 3:
                                        employeeService.editEmployee();
                                        break;
                                    case 4:
                                        displayMainMenu();
                                        break;
                                }
                            } catch (NumberFormatException e) {
                                System.err.println("input is not a number");
                            }
                        } while (choose != 4);
                        break;
                    case 2:
                        do {
                            try {
                                System.out.println("1. Display list customers");
                                System.out.println("2. Add new customer");
                                System.out.println("3. Edit customer");
                                System.out.println("4. Return Student8 menu");
                                System.out.println("============================ \n");
                                choose = Integer.parseInt(input.nextLine());
                                switch (choose) {
                                    case 1:
                                        customerService.displayCustomer();
                                        break;
                                    case 2:
                                        customerService.addNew();
                                        break;
                                    case 3:
                                        customerService.editCustomer();
                                        break;
                                    case 4:
                                        displayMainMenu();
                                        break;
                                }
                            } catch (NumberFormatException e) {
                                System.err.println("input is not a number");
                            }
                        } while (choose != 4);
                        break;
                    case 3:
                        do {
                            try {
                                System.out.println("1. Display list facility");
                                System.out.println("2.Add new facility");
                                System.out.println("3.Display list facility maintenance");
                                System.out.println("4. Return  menu");
                                System.out.println("============================ \n");
                                choose = Integer.parseInt(input.nextLine());
                                switch (choose) {
                                    case 1:
                                        facilityService.displayListFacility();
                                        break;
                                    case 2:
                                        facilityService.addNew();
                                        break;
                                    case 3:
                                        facilityService.displayListFacilityMaintenance();
                                        break;
                                    case 4:
                                        displayMainMenu();
                                        break;
                                }
                            } catch (NumberFormatException e) {
                                System.err.println("input is not a number");
                            }
                        } while (choose != 4);
                        break;
                    case 4:
                        do {
                            try {
                                System.out.println("1. Add new booking");
                                System.out.println("2. Display list booking");
                                System.out.println("3. Create new constracts");
                                System.out.println("4. Display list contracts");
                                System.out.println("4. Edit contracts");
                                System.out.println("4. Return Student8 menu");
                                System.out.println("============================ \n");
                                choose = Integer.parseInt(input.nextLine());
                            } catch (NumberFormatException e) {
                                System.err.println("input is not a number");
                            }
                        } while (choose != 4);
                        break;
                    case 5:
                        do {
                            try {
                                System.out.println("1. Display list customers use service");
                                System.out.println("2. Display list customers get voucher");
                                System.out.println("3. Return menu \n");
                                System.out.println("============================");
                                choose = Integer.parseInt(input.nextLine());
                            } catch (NumberFormatException e) {
                                System.err.println("input is not a number");
                            }
                        } while (choose != 4);
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        System.err.println(" please choose again \n");
                        System.err.println("============================");
                }
            } catch (NumberFormatException e) {
                System.err.println("enter number");
            }
        } while (true);
    }
}
