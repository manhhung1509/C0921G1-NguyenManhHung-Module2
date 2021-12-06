package test;

import java.util.Scanner;

public class Employee {
    static Scanner scanner = new Scanner(System.in);
    public static String getAge(String temp, String regex, String error){
        boolean check = true;
        do {
            if (temp.matches(regex)){
                check = false;
            }else{
                System.err.println(error);
                temp = scanner.nextLine();
            }
        }while(check);
        return temp;
    }
}
