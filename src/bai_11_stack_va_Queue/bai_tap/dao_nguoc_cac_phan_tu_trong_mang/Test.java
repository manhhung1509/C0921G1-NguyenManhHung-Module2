package stack_va_Queue.bai_tap.dao_nguoc_cac_phan_tu_trong_mang;


import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Integer[] arr = {2, 4, 2, 5, 6, 9};
        Stack<Integer> stack = new Stack<>();
        for (int x : arr) {
            stack.push(x);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        for (int x : arr) {
            System.out.print(x + "\n");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi");
        String mWord = scanner.nextLine();
        Stack<String> wStack = new Stack<>();
        System.out.println(mWord);
        String[] arrStr = mWord.split(" ");

        for (String s : arrStr) {
//            System.out.print(s);
            wStack.push(s);
        }
        String outp = "";
        for (String c : arrStr) {
            outp += wStack.pop() + " ";
        }
        System.out.println(outp);
    }
}
