package bai_1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào giá trị cần quy đổi");
        int money = sc.nextInt();
        int vnd = money * rate;
        System.out.println(money + " usd = " + vnd + " vnđ");
    }
}