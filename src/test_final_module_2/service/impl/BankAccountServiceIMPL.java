package test_final_module_2.service.impl;

import test_final_module_2.controllers.BankController;
import test_final_module_2.libs.ReadWriteFile;
import test_final_module_2.model.BankAccount;
import test_final_module_2.model.PaymentAccount;
import test_final_module_2.model.SavingAccount;
import test_final_module_2.service.BankAccountService;
import test_final_module_2.service.exception.NotFoundBankAccountException;
import test_final_module_2.service.validate.ValidateAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccountServiceIMPL implements BankAccountService {
    Scanner sc = new Scanner(System.in);
    public static final String PATH = "C:\\newcodegym\\C0921G1-NguyenManhHung-Module2\\src\\test_final_module_2\\data\\bank_account.csv";
    static List<BankAccount> bankAccountList;

    static {
        bankAccountList = covertStringToAccount();
    }

    public void getIDAccount() {
        for (int i = 0; i < bankAccountList.size(); i++) {
            System.out.println(bankAccountList.get(bankAccountList.size() - 1).getAccountID());
        }
    }

    @Override
    public void addNewAccount() {
        int choice = 0;
        do {
            try {
                System.out.println("choice 1 to add saving account");
                System.out.println("choice 2 to add payment account");
                choice = Integer.parseInt(sc.nextLine());
                if (choice == 1 || choice == 2) {
                    break;
                } else {
                    System.err.println("choice 1 or 2.");

                }
            } catch (Exception e) {
                System.err.println("enter number");
            }
        } while (true);
        int id = 0;
        if (bankAccountList.size() != 0) {
            id = bankAccountList.get(bankAccountList.size() - 1).getAccountID() + 1;
        }
        System.out.println("enter code of account");
        String code = sc.nextLine();
        String name = ValidateAccount.getNameOfOwner();
        String date = ValidateAccount.getDateCreateAccount();
        if (choice == 1) {
            int cardNumber = ValidateAccount.getCardNumber();
            int moneyInAccount = ValidateAccount.getMoneyInAccount();
            BankAccount paymentAccount = new PaymentAccount(id, code, name, date, cardNumber, moneyInAccount);
            bankAccountList.add(paymentAccount);
            System.out.println("create successful");
            ReadWriteFile.writeFile(PATH, covertAccountToString(), false);
        } else {
            int SavingDepositAmount = ValidateAccount.MoneySaving();
            String savingDay = ValidateAccount.savingDate();
            double interestRate = ValidateAccount.getInterestRate();
            int period = ValidateAccount.getPeriod();
            BankAccount savingAccount = new SavingAccount(id, code, name, date, SavingDepositAmount, savingDay, interestRate, period);
            bankAccountList.add(savingAccount);
            System.out.println("create successful");
            ReadWriteFile.writeFile(PATH, covertAccountToString(), false);
        }
    }

    @Override
    public void deleteAccount() {
        BankController bankController = new BankController();
        boolean check = false;
        String choice = "";
        String code = "";
        do {
            try {
                System.out.println("enter code bank account");
                code = sc.nextLine();
                for (BankAccount bankAccount : bankAccountList) {
                    if (code.equals(bankAccount.getAccountCode())) {
                        do {
                            System.out.println("enter Yes to delete \n" +
                                    "enter No to return main menu");
                            choice = (sc.nextLine()).toLowerCase();
                            if (choice.equals("yes")) {
                                bankAccountList.remove(bankAccount);
                                ReadWriteFile.writeFile(PATH, covertAccountToString(), false);
                                break;
                            } else if (choice.equals("no")) {
                                bankController.displayMainMenu();
                                break;
                            } else {
                                System.err.println("enter yes or no");
                            }
                        } while (true);
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    throw new NotFoundBankAccountException();
                }
                break;
            } catch (NotFoundBankAccountException e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }

    @Override
    public void displayAccountList() {
        System.out.println("======================================");
        for (BankAccount account : bankAccountList) {
            System.out.println(account);
        }
        System.out.println("=======================================");
    }

    @Override
    public void searchAccount() {
        System.out.println("enter name of account owner");
        String name = sc.nextLine();
        System.out.println("enter account code");
        String code = sc.nextLine();
        boolean check = false;
        for (BankAccount bankAccount : bankAccountList) {
            if (name.equals(bankAccount.getAccountName()) || code.equals(bankAccount.getAccountCode())) {
                System.out.println(bankAccount);
                check = true;
            }
        }
        if (!check) {
            System.err.println("account have owner: " + name + ", code: " + code + "is not found");
        }
    }

    public List<String> covertAccountToString() {
        List<String> listString = new ArrayList<>();
        for (BankAccount account : bankAccountList) {
            listString.add(account.toString());
        }
        return listString;
    }

    public static List<BankAccount> covertStringToAccount() {
        List<String> stringList = ReadWriteFile.readFile(PATH);
        List<BankAccount> accountList = new ArrayList<>();
        String[] arrAccount;
        for (String line : stringList) {
            arrAccount = line.split(",");
            if (arrAccount.length == 6) {
                accountList.add(new PaymentAccount(Integer.parseInt(arrAccount[0]), arrAccount[1], arrAccount[2],
                        arrAccount[3], Integer.parseInt(arrAccount[4]), Integer.parseInt(arrAccount[5])));
            } else {
                accountList.add(new SavingAccount(Integer.parseInt(arrAccount[0]), arrAccount[1], arrAccount[2],
                        arrAccount[3], Integer.parseInt(arrAccount[4]), arrAccount[5],
                        Double.parseDouble(arrAccount[6]), Integer.parseInt(arrAccount[7])));
            }
        }
        return accountList;
    }
}
