package case_study.furamaResort.models.facility;

import java.util.Objects;

public class Villa extends Facility {
    private String standardOfRoom;
    private double poolArea;
    private int NumberOfFloors;

    public Villa() {
    }

    public Villa(String standardOfRoom, double poolArea, int numberOfFloors) {
        this.standardOfRoom = standardOfRoom;
        this.poolArea = poolArea;
        NumberOfFloors = numberOfFloors;
    }

    public Villa(String serviceCode, String nameService, double usableArea, int rentCost, int maximumPeople,
                 String rentalType, String standardOfRoom, double poolArea, int numberOfFloors) {
        super(serviceCode, nameService, usableArea, rentCost, maximumPeople, rentalType);
        this.standardOfRoom = standardOfRoom;
        this.poolArea = poolArea;
        NumberOfFloors = numberOfFloors;
    }

    public String getStandardOfRoom() {
        return standardOfRoom;
    }

    public void setStandardOfRoom(String standardOfRoom) {
        this.standardOfRoom = standardOfRoom;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return NumberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        NumberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return serviceCode + "," + nameService + "," + usableArea + "," + rentCost + "," + maximumPeople + "," + rentalType + "," + standardOfRoom + "," + poolArea + "," + NumberOfFloors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Villa)) return false;
        Villa villa = (Villa) o;
        return Objects.equals(serviceCode, villa.serviceCode) &&
                Objects.equals(nameService, villa.nameService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceCode, nameService);
    }
}
