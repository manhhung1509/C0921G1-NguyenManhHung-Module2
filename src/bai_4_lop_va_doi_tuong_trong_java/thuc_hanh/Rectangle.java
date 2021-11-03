package bai_4_lop_va_doi_tuong_trong_java.thuc_hanh;

public class Rectangle {
    double width;
    double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return this.width * this.height;
    }

    public double chuVi() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle = {" + this.width + "," + this.height + "}";
    }

}
