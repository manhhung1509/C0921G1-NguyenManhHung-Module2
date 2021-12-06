package test;

import java.util.Scanner;

public class Run {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String error = "incorrect enter again";
        String regex = "^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$";
        System.out.println("enter age");
        String age = Employee.getAge(sc.nextLine(),regex,error);
    }
}
