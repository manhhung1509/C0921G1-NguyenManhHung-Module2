package bai_6_ke_thua.bai_tap.lop_point_2d_va_lop_point_3d;

public class Point3D extends Point2D {
    private float z;
    public Point3D(){
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(){
        float arr1 [] = {x, y, z};
        return arr1;
    }
    @Override
    public String toString(){
        return  "(" + x + "," + y + "," + z +")";
    }
}
