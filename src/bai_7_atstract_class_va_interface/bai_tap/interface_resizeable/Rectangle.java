package bai_7_atstract_class_va_interface.bai_tap.interface_resizeable;

public class Rectangle implements Resizeable {
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

    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public void resize(double percent) {
        this.setHeight(getHeight() * Math.sqrt((100 + percent) / 100));
        this.setWidth(getWidth() * Math.sqrt((100 + percent) / 100));
    }
}
