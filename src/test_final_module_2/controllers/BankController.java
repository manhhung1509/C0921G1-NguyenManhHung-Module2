package test_final_module_2.controllers;

import test_final_module_2.model.BankAccount;
import test_final_module_2.service.impl.BankAccountServiceIMPL;

import java.util.Scanner;

public class BankController {
    Scanner input = new Scanner(System.in);
    BankAccountServiceIMPL bankAccountServiceIMPL = new BankAccountServiceIMPL();

    public void displayMainMenu() {
        int choice = 0;
        int choose = 0;
        do {
            try {
                System.out.println("PROGRAM CONTROL BANK ACCOUNT");
                System.out.println("1. Add new bank account");
                System.out.println("2. Delete bank account");
                System.out.println("3. Display list bank accounts");
                System.out.println("4.Search bank account");
                System.out.println("5. Exits");
                System.out.println("Enter your selection: \n");
                choice = Integer.parseInt(input.nextLine());

                switch (choice) {
                    case 1:
                        bankAccountServiceIMPL.addNewAccount();
                        break;
                    case 2:
                        bankAccountServiceIMPL.deleteAccount();
                        break;
                    case 3:
                        bankAccountServiceIMPL.displayAccountList();
                        break;
                    case 4:
                        bankAccountServiceIMPL.searchAccount();
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.err.println(" please choose again \n");
                        System.err.println("============================");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input is not a number. Enter number");
            }
        } while (true);
    }

    public static void main(String[] args) {
        BankController bankController = new BankController();
        bankController.displayMainMenu();
    }
}
