package bai_6_ke_thua.bai_tap.thiet_ke_va_trien_khai_lop_triangle;

public class Shape {
    protected String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "shape is a " + this.color;
    }
}
