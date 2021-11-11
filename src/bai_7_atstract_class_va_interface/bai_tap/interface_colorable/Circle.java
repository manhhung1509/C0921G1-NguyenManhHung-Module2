package bai_7_atstract_class_va_interface.bai_tap.interface_colorable;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * this.radius * this.radius);
    }

}
