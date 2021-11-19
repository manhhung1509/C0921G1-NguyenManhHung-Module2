package bai_15_exception_va_debug.bai_tap.su_dung_lop_ilegal_triangle_exception;

import java.util.Scanner;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c || a + c > b || b + c > a) {
                //điều kiện đúng
                System.out.println("a,b,c thỏa mản điều kiện");
            } else {
                //điều kiện sai => ném ra exception
//                throw new IllegalTriangleException();
                throw new IllegalTriangleException("tổng 2 cạnh cộng lại không lớn hơn cạnh còn lại, nhập lại: ");
            }
        } else {
            //điều kiện sai => ném ra exception
//            throw new IllegalTriangleException();
            throw new IllegalTriangleException("nhập giá trị a,b,c lớn hơn 0: ");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double c;
        while (true) {
            try {
                System.out.println("nhâp giá trị a: ");
                a = input.nextDouble();
                System.out.println("nhâp giá trị b: ");
                b = input.nextDouble();
                System.out.println("nhâp giá trị c: ");
                c = input.nextDouble();
                Triangle triangle = new Triangle(a, b, c);
                //đk đúng => kết thúc vòng lặp, sai thì bắt nhập lại
                break;
            } catch (IllegalTriangleException e) {
//                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }

}
