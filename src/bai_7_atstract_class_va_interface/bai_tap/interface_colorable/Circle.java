package bai_7_atstract_class_va_interface.bai_tap.interface_colorable;

public class Circle implements Colorable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public void howToEat() {
        System.out.println("hmm");
    }
}
