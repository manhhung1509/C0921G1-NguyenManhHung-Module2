package bai_10_DSA_danh_sach.bai_tap_lam_them.vehicle;

public class Truck extends Vehicle {
    private double tonnage;

    public Truck() {
    }

    public Truck(double tonnage) {
        this.tonnage = tonnage;
    }

    public Truck(String licensePlate, String manufacturerName, int manufacturerYear
            , String owner, double tonnage) {
        super(licensePlate, manufacturerName, manufacturerYear, owner);
        this.tonnage = tonnage;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "tonnage=" + tonnage +
                ", LicensePlate='" + licensePlate + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", manufacturerYear=" + manufacturerYear +
                ", owner='" + owner + '\'' +
                '}';
    }
}