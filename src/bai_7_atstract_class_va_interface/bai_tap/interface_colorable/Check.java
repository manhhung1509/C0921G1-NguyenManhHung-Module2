package bai_7_atstract_class_va_interface.bai_tap.interface_colorable;

public class Check {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[1] = new Square(2);
        shapes[2] = new Circle(4);
        shapes[3] = new Rectangle(2, 4);
        for (Shape shape : shapes) {
            if (shape != null) {
                System.out.println("area = " + shape.getArea());
                if (shape instanceof Square) {
                    ((Square) shape).howToColor();
                }
            }
        }
    }
}
