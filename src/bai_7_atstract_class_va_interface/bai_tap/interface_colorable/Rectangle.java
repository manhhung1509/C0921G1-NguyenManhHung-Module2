package bai_7_atstract_class_va_interface.bai_tap.interface_colorable;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    @Override
    public int getArea() {
        return (int) (this.width * this.height);
    }

}
