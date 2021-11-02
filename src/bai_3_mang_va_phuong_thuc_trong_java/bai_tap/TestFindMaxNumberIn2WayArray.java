package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Arrays;
import java.util.Scanner;

public class TestFindMaxNumberIn2WayArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào độ dài mảng cha");
        int m = sc.nextInt();
        System.out.println("nhập vào độ dài mảng con");
        int n = sc.nextInt();
        int[][] array = new int[m][n];
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("arr[" + i + "][" + j + "]");
                array[i][j] = sc.nextInt();
                if (array[i][j] % 2 != 0) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("tổng các số lẻ trong mảng 2 chiều là: " + sum);
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
