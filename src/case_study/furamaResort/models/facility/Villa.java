package case_study.furamaResort.models.facility;

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

    public Villa(String nameService, double usableArea, int rentCost, int maximumPeople,
                 String rentalType, String standardOfRoom, double poolArea, int numberOfFloors) {
        super(nameService, usableArea, rentCost, maximumPeople, rentalType);
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
        return "Villa{" +
                "standardOfRoom='" + standardOfRoom + '\'' +
                ", poolArea=" + poolArea +
                ", NumberOfFloors=" + NumberOfFloors +
                ", nameService='" + nameService + '\'' +
                ", usableArea=" + usableArea +
                ", rentCost=" + rentCost +
                ", maximumPeople=" + maximumPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
