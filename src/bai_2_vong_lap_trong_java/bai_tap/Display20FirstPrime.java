package bai_2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class Display20FirstPrime {
    public static void main(String[] args) {
        int number = 20;
        int count = 0;
        int i = 2;
        System.out.print("20 số nguyên tố đầu tiên là: \n");
        while (count < number) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }

    public static boolean isPrimeNumber(int n) {
            int squareRoot = (int) Math.sqrt(n);
            for (int i = 2; i <= squareRoot; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
    }
}

