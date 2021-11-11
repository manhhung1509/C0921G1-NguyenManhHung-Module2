package bai_7_atstract_class_va_interface.bai_tap.interface_colorable;

public class Square extends Shape implements Colorable {
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

    @Override
    public int getArea() {
        return (int) (this.a * this.a);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides \n=========================");
    }
}
