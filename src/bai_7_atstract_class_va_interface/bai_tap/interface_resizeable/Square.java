package bai_7_atstract_class_va_interface.bai_tap.interface_resizeable;

public class Square implements Resizeable {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getArea() {
        return this.a * this.a;
    }

    @Override
    public void resize(double percent) {
        this.setA(getA() * Math.sqrt((100 + percent) / 100));
    }
}
