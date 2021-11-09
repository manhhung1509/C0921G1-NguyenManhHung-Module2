package bai_7_atstract_class_va_interface.bai_tap.interface_resizeable;

public class Circle implements Resizeable {
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
    public void resize(double percent) {
        this.setRadius(getRadius() * Math.sqrt((100 + percent) / 100));
    }
}
