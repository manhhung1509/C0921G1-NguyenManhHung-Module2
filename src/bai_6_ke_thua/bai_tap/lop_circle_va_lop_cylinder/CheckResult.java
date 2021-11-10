package bai_6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class CheckResult {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0, "yellow");
        circle.setColor("purple");
        circle.setRadius(10);
        System.out.println("Area of circle  =" + circle.getArea());
        System.out.println("chu vi hình tròn = " + circle.perimeter());
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder(5);
        cylinder.setColor("black");
        cylinder.setRadius(2.5);
        System.out.println(" ---------------------------- \n ");
        System.out.println(cylinder.toString());
    }
}
