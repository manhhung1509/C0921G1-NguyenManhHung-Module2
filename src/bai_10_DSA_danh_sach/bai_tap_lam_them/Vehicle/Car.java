package bai_10_DSA_danh_sach.bai_tap_lam_them.Vehicle;

public class Car extends Vehicle {
    private int numberOfSeat;
    private String carType;

    public Car() {
    }

    public Car(int numberOfSeat, String carType) {
        this.numberOfSeat = numberOfSeat;
        this.carType = carType;
    }

    public Car(String licensePlate, String manufacturerName, int manufacturerYear
            , String owner, int numberOfSeat, String carType) {
        super(licensePlate, manufacturerName, manufacturerYear, owner);
        this.numberOfSeat = numberOfSeat;
        this.carType = carType;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfSeat=" + numberOfSeat +
                ", carType='" + carType + '\'' +
                ", LicensePlate='" + licensePlate + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", manufacturerYear=" + manufacturerYear +
                ", owner='" + owner + '\'' +
                '}';
    }
}
