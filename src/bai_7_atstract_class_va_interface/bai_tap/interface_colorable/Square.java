package bai_7_atstract_class_va_interface.bai_tap.interface_colorable;

public class Square implements Colorable{
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
    public void howToEat() {
        System.out.println("Color all four sides");
    }
}
