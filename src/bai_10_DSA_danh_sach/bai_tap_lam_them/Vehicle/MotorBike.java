package bai_10_DSA_danh_sach.bai_tap_lam_them.Vehicle;

public class MotorBike extends Vehicle {
    private int wattage;

    public MotorBike() {
    }

    public MotorBike(int wattage) {
        this.wattage = wattage;
    }

    public MotorBike(String licensePlate, String manufacturerName,
                     int manufacturerYear, String owner, int wattage) {
        super(licensePlate, manufacturerName, manufacturerYear, owner);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "MotorBike{" +
                "wattage=" + wattage +
                ", LicensePlate='" + licensePlate + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", manufacturerYear=" + manufacturerYear +
                ", owner='" + owner + '\'' +
                '}';
    }

}
