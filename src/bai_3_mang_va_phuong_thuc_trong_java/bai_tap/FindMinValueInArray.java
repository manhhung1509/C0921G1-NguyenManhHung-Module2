package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

public class FindMinValueInArray {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("giá trị nhỏ nhất trong nmangr là : " + min);
    }
}
