package bai_6_ke_thua.bai_tap.lop_point_2d_va_lop_point_3d;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2, 5);
        Point3D point3D = new Point3D(1,2,3);
        point2D.setXY(5,7);
        point3D.setXYZ(4,5,6);
        System.out.println(point2D.toString());
        System.out.println(point3D.toString());
    }
}
