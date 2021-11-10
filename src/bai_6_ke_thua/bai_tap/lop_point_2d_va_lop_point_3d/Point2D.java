package bai_6_ke_thua.bai_tap.lop_point_2d_va_lop_point_3d;

public class Point2D {
    protected float x;
    protected float y;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
       float arr [] = {x, y};
       return arr;
    }

    public String toString(){
        return  "(" + x + "," + y + ")";
    }
}
