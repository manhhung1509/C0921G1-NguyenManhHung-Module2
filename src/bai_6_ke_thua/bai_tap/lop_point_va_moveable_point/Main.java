package bai_6_ke_thua.bai_tap.lop_point_va_moveable_point;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(4, 2, 1, 5);
        Point point = new Point(1, 2);

        System.out.println(point.toString());
        System.out.println("\n ===========================");
        System.out.println(movablePoint.toString());
        System.out.println(movablePoint.move());

    }
}
