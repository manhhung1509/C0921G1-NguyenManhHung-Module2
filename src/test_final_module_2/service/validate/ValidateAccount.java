package test_final_module_2.service.validate;

import java.util.Scanner;

public class ValidateAccount {
    static Scanner sc = new Scanner(System.in);

    public static int getIDAccount() {
        int id = 0;
        System.out.println("enter id account");
        do {
            try {
                id = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.err.println("enter number");
            }
        } while (true);
        return id;
    }

    public static String getNameOfOwner() {
        String matched = "^[A-Z]\\w*(\\s[A-Z]\\w*)*$";
        String name = "";
        System.out.println("enter name of owner account");
        do {
            name = sc.nextLine();
            if (!name.matches(matched)) {
                System.err.println("Name must be capitalize first letter,\n" +
                        " the following characters are normal characters \n");
            } else {
                break;
            }
        } while (true);
        return name;
    }

    public static String getDateCreateAccount() {
        String matched = "^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$";
        String date = "";
        while (true) {
            System.out.println("enter day create account");
            date = sc.nextLine();
            if (!date.matches(matched)) {
                System.err.println("input incorrect format dd/MM/yyyy");
            } else {
                break;
            }
        }
        return date;
    }

    public static int getCardNumber() {
        int number = 0;
        System.out.println("enter number card");
        do {
            try {
                number = Integer.parseInt(sc.nextLine());
                if (number < 0) {
                    System.err.println("enter a number bigger than 0");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.err.println("enter number");
            }
        } while (true);
        return number;
    }

    public static int getMoneyInAccount() {
        int money = 0;
        System.out.println("enter amount in account");
        do {
            try {
                money = Integer.parseInt(sc.nextLine());
                if (money < 0) {
                    System.err.println("enter a number bigger than 0");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.err.println("enter number");
            }
        } while (true);
        return money;
    }

    public static int MoneySaving() {
        int money = 0;
        System.out.println("enter money saving");
        do {
            try {
                money = Integer.parseInt(sc.nextLine());
                if (money < 0) {
                    System.err.println("enter a number bigger than 0");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.err.println("enter number");
            }
        } while (true);
        return money;
    }

    public static String savingDate() {
        String matched = "^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$";
        String date = "";
        while (true) {
            System.out.println("enter saving day");
            date = sc.nextLine();
            if (!date.matches(matched)) {
                System.err.println("input incorrect format dd/MM/yyyy");
            } else {
                break;
            }
        }
        return date;
    }

    public static double getInterestRate() {
        double interestRate = 0;
        System.out.println("enter interest rate");
        do {
            try {
                interestRate = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.err.println("enter number");
            }
        } while (true);
        return interestRate;
    }

    public static int getPeriod() {
        int period = 0;
        System.out.println("enter period");
        do {
            try {
                period = Integer.parseInt(sc.nextLine());
                if (period < 0) {
                    System.err.println("period must be bigger than 0");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.err.println("enter number");
            }
        } while (true);
        return period;
    }
}
