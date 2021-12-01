package case_study.furamaResort.models.facility;

import java.util.Objects;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String nameService, double usableArea, int rentCost,
                int maximumPeople, String rentalType, String freeServiceIncluded) {
        super(nameService, usableArea, rentCost, maximumPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return nameService + "," + usableArea + "," + rentCost + "," + maximumPeople + "," + rentalType + "," + freeServiceIncluded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        return Double.compare(room.usableArea, usableArea) == 0 &&
                rentCost == room.rentCost &&
                maximumPeople == room.maximumPeople &&
                Objects.equals(nameService, room.nameService) &&
                Objects.equals(rentalType, room.rentalType) &&
                Objects.equals(freeServiceIncluded, room.freeServiceIncluded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameService, usableArea, rentCost, maximumPeople, rentalType, freeServiceIncluded);
    }
}
