package bai_2_vong_lap_trong_java.bai_tap;

public class DisplayPrimeSmallThan100 {
    public static void main(String[] args) {
        int number = 100;
        for (int i = 1; i <= number; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrimeNumber(int a) {
        if (a < 2) {
            return false;
        } else {
            int squareRoot = (int) Math.sqrt(a);
            for (int i = 2; i <= squareRoot; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
