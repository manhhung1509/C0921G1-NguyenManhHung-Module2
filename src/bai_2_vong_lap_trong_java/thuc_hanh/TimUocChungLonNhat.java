package bai_2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số a:");
        a = input.nextInt();
        System.out.println("nhập số b:");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println(a + " là ươc chung lớn nhất của cả a và b ");
    }
}
