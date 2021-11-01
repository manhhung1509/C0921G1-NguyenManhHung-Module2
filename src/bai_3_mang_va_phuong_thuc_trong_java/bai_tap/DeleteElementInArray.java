package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, c;
        int size;
        int[] arr = {4, 12, 7, 8, 1, 6, 9};

        System.out.println("Nhập số nguyên k: ");
        int element = scanner.nextInt();
        for (c = i = 0; i < arr.length; i++) {
            if (arr[i] != element) {
                arr[c] = arr[i];
                c++;
            }
        }
        size = c;

        System.out.println("Mảng còn lại sau khi xóa phần tử " + element + " là: ");
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
