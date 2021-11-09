package bai_7_atstract_class_va_interface.bai_tap.interface_resizeable;

public class Check {
    public static void main(String[] args) {
        Resizeable[] resizeable = new Resizeable[3];
        resizeable[0] = new Circle(2);
        resizeable[1] = new Square(3);
        resizeable[2] = new Rectangle(2, 3);

        for (Resizeable element : resizeable) {
            if (element instanceof Circle) {
                Circle circle = (Circle) element;
                System.out.println("before circle area = " + circle.getArea());
                circle.resize(Math.floor(Math.random() * 100) + 1);
                System.out.println("after circle area = " + circle.getArea());
                System.out.println("\n" + "===================================");
            } else if (element instanceof Square) {
                Square square = (Square) element;
                System.out.println("before square area = " + square.getArea());
                square.resize(Math.floor(Math.random() * 100) + 1);
                System.out.println("after square area = " + square.getArea());
                System.out.println("\n" + "===================================");
            } else {
                Rectangle rectangle = (Rectangle) element;
                System.out.println("before rectangle area = " + rectangle.getArea());
                rectangle.resize(Math.floor(Math.random() * 100) + 1);
                System.out.println("after rectangle area = " + rectangle.getArea());
            }
        }
    }
}

