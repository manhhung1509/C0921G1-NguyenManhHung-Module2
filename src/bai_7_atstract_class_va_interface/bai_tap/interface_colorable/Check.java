package bai_7_atstract_class_va_interface.bai_tap.interface_colorable;

public class Check {
    public static void main(String[] args) {
        Colorable[] array = new Colorable[3];
        array[0] = new Square(3);
        array[1] = new Circle(3);
        array[2] = new Rectangle(2, 4);
        for (Colorable arr : array) {
            if (arr instanceof Square) {
                Square square = (Square) arr;
                System.out.println("square area = " + square.getArea());
                square.howToEat();
                System.out.println("\n" + "====================");
            } else if (arr instanceof Circle) {
                Circle circle = (Circle) arr;
                System.out.println("circle area = " + circle.getArea());
                System.out.println("\n" + "====================");
            } else {
                Rectangle rectangle = (Rectangle) arr;
                System.out.println("rectangle area = " + rectangle.getArea());
            }
        }
    }
}
