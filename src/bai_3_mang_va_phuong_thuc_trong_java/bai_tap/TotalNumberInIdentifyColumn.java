package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TotalNumberInIdentifyColumn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số dòng của mảng: ");
        int row = sc.nextInt();
        System.out.println("nhập vào số cột của mảng: ");
        int col = sc.nextInt();
        int[][] array = new int[row][col];
        int sum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("nhập phần tử thứ [" + i + "][" + j + "]");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("mảng 2 chiều vừa nhập:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("nhập vào số thứ tự cột cần tính tổng: ");
        int number = sc.nextInt();
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (j == number) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("tong = " + sum);
    }
}
