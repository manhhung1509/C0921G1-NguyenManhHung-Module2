package on_tap.manage_student.service;

import java.util.Scanner;

public class InputNumber {

    public static double inputDouble(){
        while (true){
            try {
                Scanner scanner = new Scanner(System.in);
                double num = scanner.nextDouble();
                return num;
            }catch (Exception e){
                System.out.println("Please enter number");
            }
        }
    }
}
