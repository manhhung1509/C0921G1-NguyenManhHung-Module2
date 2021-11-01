package bai_2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class DisplayShapes {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print  isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("enter your choice:");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("1. Print the rectangle");
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for(int i=7;i>=1;i--) {
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println(" không lựa chọn ");
        }
    }
}
