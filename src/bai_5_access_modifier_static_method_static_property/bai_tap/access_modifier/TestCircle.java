package bai_5_access_modifier_static_method_static_property.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("radius = " + circle.getRadius());
        System.out.println("Area = " + circle.getArea());
    }
}
