package bai_14_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

public class Main {

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
        for (int arr : array){
            System.out.print(arr + "  ");
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 4, 8, 3, 1, 45, 23, 67, 12, 89, 2, 3, 5, 52};
        insertionSort(array);
    }
}
