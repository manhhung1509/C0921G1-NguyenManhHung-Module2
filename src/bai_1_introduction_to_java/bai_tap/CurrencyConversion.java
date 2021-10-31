package bai_1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số tiền quy đổi:");
        usd = input.nextDouble();
        double quyDoi = usd * vnd;
        System.out.println("quy đổi:" + quyDoi);
    }
}
