package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] result = new int[array1.length + array2.length];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            result[index] = array1[i];
            index++;
        }
        for (int j = 0; j < array2.length; j++) {
            result[index] = array2[j];
            index++;
        }
        System.out.println(Arrays.toString(result));
    }
}
