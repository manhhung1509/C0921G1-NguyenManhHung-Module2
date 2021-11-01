package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class AddNewElement {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int[] newArray = new int[arr.length + 1];
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số cần chèn vào:");
        int number = input.nextInt();
        System.out.println("nhập vào vị tri cần chèn trong mảng:");
        int viTri = input.nextInt();
        if (viTri <= -1 || viTri >= arr.length - 1) {
            System.out.println("không thể thực hiện chèn phần tử vào mảng:");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i < viTri) {
                    newArray[i] = arr[i];
                } else if (i == viTri) {
                    newArray[i] = number;
                } else {
                    newArray[i] = arr[i - 1];
                }
            }
        }
        for (int j = 0; j < newArray.length; j++) {
            System.out.println(" array[" + j + "] = " + newArray[j]);
        }
    }
}
