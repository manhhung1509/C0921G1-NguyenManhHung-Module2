package bai_6_ke_thua.bai_tap.thiet_ke_va_trien_khai_lop_triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập màu sắc hình tam giác:");
        String color = sc.nextLine();

        System.out.println("cạnh thứ nhất hình tam giác =");
        double a = sc.nextDouble();
        System.out.println("cạnh thứ hai hình tam giác =");
        double b = sc.nextDouble();
        System.out.println("cạnh thứ ba hình tam giác =");
        double c = sc.nextDouble();

        Shape shape = new Shape();
        shape.setColor(color);
        System.out.println(shape.toString());

        Triangle triangle = new Triangle(color ,a, b, c);
        System.out.println(triangle.toString());

    }
}
