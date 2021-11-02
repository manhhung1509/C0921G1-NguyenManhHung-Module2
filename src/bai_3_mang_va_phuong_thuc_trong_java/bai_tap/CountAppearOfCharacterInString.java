package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class CountAppearOfCharacterInString {
    public static void main(String[] args) {
        int count = 0;
        String string;
        char word = 'u';
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào một chuỗi");
        string = sc.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if (word == string.charAt(i)) {
                count++;
            }
        }
        System.out.println("số lần cuất hiện của ký tự ở trong chuỗi là : " + count);
    }
}
