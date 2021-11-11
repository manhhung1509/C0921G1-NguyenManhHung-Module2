package bai_7_atstract_class_va_interface.bai_tap.interface_resizeable;

public class Check {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Square(3);
        shapes[2] = new Rectangle(2, 3);

        for (Shape element : shapes) {
            if (element instanceof Circle) {
                System.out.println("before circle area = " + element.getArea());
                ((Circle) element).resize(Math.floor(Math.random() * 100) + 1);
                System.out.println("after circle area = " + element.getArea());
                System.out.println("\n" + "===================================");
            } else if (element instanceof Square) {
                System.out.println("before square area = " + element.getArea());
                ((Square) element).resize(Math.floor(Math.random() * 100) + 1);
                System.out.println("after square area = " + element.getArea());
                System.out.println("\n" + "===================================");
            } else {
                System.out.println("before rectangle area = " + element.getArea());
                ((Rectangle) element).resize(Math.floor(Math.random() * 100) + 1);
                System.out.println("after rectangle area = " + element.getArea());
            }
        }
    }
}

