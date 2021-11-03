package bai_4_lop_va_doi_tuong_trong_java.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chiều rộng hình chữ nhật:");
        double width = sc.nextDouble();
        System.out.println("nhập chiều dài hình chữ nhật : ");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("diện tích hình chữ nhật là : " + rectangle.area());
        System.out.println("chu vi hình chữ nhật là : " + rectangle.chuVi());
        System.out.println(rectangle.display());
    }
}
