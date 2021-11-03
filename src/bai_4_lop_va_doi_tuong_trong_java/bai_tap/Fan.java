package bai_4_lop_va_doi_tuong_trong_java.bai_tap;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";


    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        String string = "";
        if (!this.isOn()) {
            string += "fan is on" + "\n" + this.radius + "\n" + this.color + "\n" + this.speed;
        } else {
            string += "fan is off" + "\n" + this.radius;
        }
        return string;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(10, true, 10, "yellow");
        Fan fan2 = new Fan(5, false, 5, "blue");
        System.out.println(fan1.toString() + "\n" + "--------------------------------------");
        System.out.println(fan2.toString());

    }

}
