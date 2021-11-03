package bai_4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * a * c;
    }

    public double getRoot1() {
        return (-this.b + (Math.sqrt(getDiscriminant()))) / 2 * a;
    }

    public double getRoot2() {
        return (-this.b - (Math.sqrt(getDiscriminant()))) / 2 * a;
    }

    public void calculate() {
        if (this.a == 0) {
            System.out.println("điều kiện để phương trình có nghiệm: a khác 0");
        } else {
            if (getDiscriminant() > 0) {
                System.out.println("phương trình có 2 nghiệm r1 = " + getRoot1() + " r2 = " + getRoot2());
            } else if (getDiscriminant() == 0) {
                System.out.println("phương trình có nghiệm kép X =" + -this.b / 2 * this.a);
            } else {
                System.out.println("phương trình vô nghiệm");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a:");
        double a = sc.nextDouble();
        System.out.println("nhập b:");
        double b = sc.nextDouble();
        System.out.println("nhập c:");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        quadraticEquation.calculate();
    }
}
