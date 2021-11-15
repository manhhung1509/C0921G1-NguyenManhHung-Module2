package bai_10_DSA_danh_sach.bai_tap_lam_them.Vehicle;

public abstract class Vehicle {
    protected String licensePlate;
    protected String manufacturerName;
    protected int manufacturerYear;
    protected String owner;

    public Vehicle() {
    }

    public Vehicle(String licensePlate, String manufacturerName, int manufacturerYear, String owner) {
        this.licensePlate = licensePlate;
        this.manufacturerName = manufacturerName;
        this.manufacturerYear = manufacturerYear;
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getManufacturerYear() {
        return manufacturerYear;
    }

    public void setManufacturerYear(int manufacturerYear) {
        this.manufacturerYear = manufacturerYear;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "LicensePlate='" + licensePlate + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", manufacturerYear=" + manufacturerYear +
                ", owner='" + owner + '\'' +
                '}';
    }
}
