package case_study.furamaResort.models.facility;

import java.util.Objects;

public class House extends Facility {
    private String standardOfRoom;
    private int NumberOfFloors;

    public House() {
    }

    public House(String standardOfRoom, int numberOfFloors) {
        this.standardOfRoom = standardOfRoom;
        NumberOfFloors = numberOfFloors;
    }

    public House(String nameService, double usableArea, int rentCost, int maximumPeople,
                 String rentalType, String standardOfRoom, int numberOfFloors) {
        super(nameService, usableArea, rentCost, maximumPeople, rentalType);
        this.standardOfRoom = standardOfRoom;
        NumberOfFloors = numberOfFloors;
    }

    public String getStandardOfRoom() {
        return standardOfRoom;
    }

    public void setStandardOfRoom(String standardOfRoom) {
        this.standardOfRoom = standardOfRoom;
    }

    public int getNumberOfFloors() {
        return NumberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        NumberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "standardOfRoom='" + standardOfRoom + '\'' +
                ", NumberOfFloors=" + NumberOfFloors +
                ", nameService='" + nameService + '\'' +
                ", usableArea=" + usableArea +
                ", rentCost=" + rentCost +
                ", maximumPeople=" + maximumPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof House)) return false;
        House house = (House) o;
        return Double.compare(house.usableArea, usableArea) == 0 &&
                rentCost == house.rentCost &&
                maximumPeople == house.maximumPeople &&
                NumberOfFloors == house.NumberOfFloors &&
                Objects.equals(nameService, house.nameService) &&
                Objects.equals(rentalType, house.rentalType) &&
                Objects.equals(standardOfRoom, house.standardOfRoom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameService, usableArea, rentCost, maximumPeople, rentalType, standardOfRoom, NumberOfFloors);
    }
}
