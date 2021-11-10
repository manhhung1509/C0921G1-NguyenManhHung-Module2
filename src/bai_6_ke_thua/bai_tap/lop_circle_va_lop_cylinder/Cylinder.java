package bai_6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
    private int height;

    public Cylinder() {
    }

    public Cylinder(int height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, int height) {
        this.height = height;
        setColor(color);
        setRadius(radius);
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public double getArea() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "chiều cao = " + getHeight() + "\n radius = " +
                super.getRadius() + "\n color is: " + super.getColor() +
                "\n diện tích = " + getArea();
    }

}
