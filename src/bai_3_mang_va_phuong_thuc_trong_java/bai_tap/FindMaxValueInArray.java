package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;


import java.util.Arrays;
import java.util.Scanner;

public class FindMaxValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số m : ");
        int m = sc.nextInt();
        System.out.println("nhập vào số n : ");
        int n = sc.nextInt();
        int[][] array = new int[m][n];
        int max = array[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                array[i][j] = sc.nextInt();
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

}
