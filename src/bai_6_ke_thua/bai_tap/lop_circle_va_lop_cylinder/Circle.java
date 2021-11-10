package bai_6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Circle {
    private double radius = 3.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "radius = " + getRadius() +
                "\n color is: " + getColor();
    }
}
