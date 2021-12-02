package case_study.furamaResort.models.facility;

public abstract class Facility {
    protected String serviceCode;
    protected String nameService;
    protected double usableArea;
    protected int rentCost;
    protected int maximumPeople;
    protected String rentalType;

    public Facility() {
    }

    public Facility(String serviceCode, String nameService, double usableArea, int rentCost, int maximumPeople, String rentalType) {
        this.serviceCode = serviceCode;
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.rentCost = rentCost;
        this.maximumPeople = maximumPeople;
        this.rentalType = rentalType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentCost() {
        return rentCost;
    }

    public void setRentCost(int rentCost) {
        this.rentCost = rentCost;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return serviceCode + "," + nameService + "," + usableArea + "," + rentCost + "," + maximumPeople + "," + rentalType;
    }
}
