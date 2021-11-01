package bai_2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class ThietKeMenuUngDung {

    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0){
            System.out.println("1. in hình tam giác");
            System.out.println("2. in hình vuông");
            System.out.println("3. in hình chữu nhật");
            System.out.println("exit");
            System.out.println("nhập lựa chọn của bạn:");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("in hình tam giác");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("in hình vuông");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("in hình chữ nhật");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println(" không lựa chọn ");
            }
        }
    }
}