package case_study.furamaResort.services.impl;

import case_study.furamaResort.controllers.FuramaController;
import case_study.furamaResort.libs.WriteReadFile;
import case_study.furamaResort.models.facility.Facility;
import case_study.furamaResort.models.facility.House;
import case_study.furamaResort.models.facility.Room;
import case_study.furamaResort.models.facility.Villa;
import case_study.furamaResort.services.FacilityService;
import case_study.furamaResort.services.validate.ValidateFacility;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    Scanner scanner = new Scanner(System.in);
    final String PATH_VILLA = "C:\\newcodegym\\C0921G1-NguyenManhHung-Module2\\src\\case_study\\furamaResort\\data\\villa.csv";
    final String PATH_HOUSE = "C:\\newcodegym\\C0921G1-NguyenManhHung-Module2\\src\\case_study\\furamaResort\\data\\house.csv";
    final String PATH_ROOM = "C:\\newcodegym\\C0921G1-NguyenManhHung-Module2\\src\\case_study\\furamaResort\\data\\room.csv";

    ValidateFacility validate = new ValidateFacility();
    int currentValue = 0;
    Map<Facility, Integer> serviceList = new LinkedHashMap<>();
    Set<Facility> keySet = serviceList.keySet();

    {
        covertStringToVilla(serviceList);
        covertStringToHouse(serviceList);
        covertStringToRoom(serviceList);
    }

    @Override
    public void addNew() {
        FuramaController furamaController = new FuramaController();
        int choice = 0;
        do {
            try {
                System.out.println("choice type of service you wanna add to list: ");
                System.out.println("1.Add new villa");
                System.out.println("2.Add new house");
                System.out.println("3.Add new room");
                System.out.println("4.back to menu");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        addVilla();
                        break;
                    case 2:
                        addHouse();
                        break;
                    case 3:
                        addRoom();
                        break;
                    case 4:
                        furamaController.displayMainMenu();
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("input is not a number");
            }
        } while (choice > 4 || choice < 1);
    }

    public void addVilla() {
        String nameService = validate.serviceName();
        double usableArea = validate.usableArea();
        int rentCost = validate.rentCost();
        int maximumPeople = validate.maximumPeople();
        String rentalType = validate.rentalType();
        String standard = validate.standardOfRoom();
        double poolArea = validate.poolArea();
        int floors = validate.numberOfFloors();
        Facility villa = new Villa(nameService, usableArea, rentCost, maximumPeople, rentalType, standard, poolArea, floors);
        if (serviceList.containsKey(villa)) {
            currentValue = serviceList.get(villa) + 1;
            serviceList.replace(villa, currentValue);
            WriteReadFile.writeFile(PATH_VILLA, covertFacilityToString(1), false);
        } else {
            serviceList.put(villa, 1);
            WriteReadFile.writeFile(PATH_VILLA, covertFacilityToString(1), false);
        }
    }


    public void addHouse() {
        String nameService = validate.serviceName();
        double usableArea = validate.usableArea();
        int rentCost = validate.rentCost();
        int maximumPeople = validate.maximumPeople();
        String rentalType = validate.rentalType();
        String standard = validate.standardOfRoom();
        int floors = validate.numberOfFloors();
        Facility house = new House(nameService, usableArea, rentCost, maximumPeople, rentalType, standard, floors);
        if (serviceList.containsKey(house)) {
            currentValue = serviceList.get(house) + 1;
            serviceList.replace(house, currentValue);
            WriteReadFile.writeFile(PATH_HOUSE, covertFacilityToString(2), false);
        } else {
            serviceList.put(house, 1);
            WriteReadFile.writeFile(PATH_HOUSE, covertFacilityToString(2), false);
        }

    }

    public void addRoom() {
        String nameService = validate.serviceName();
        double usableArea = validate.usableArea();
        int rentCost = validate.rentCost();
        int maximumPeople = validate.maximumPeople();
        String rentalType = validate.rentalType();
        System.out.println("enter free service include: ");
        String freeServiceInclude = scanner.nextLine();
        Facility room = new Room(nameService, usableArea, rentCost, maximumPeople, rentalType, freeServiceInclude);
        if (serviceList.containsKey(room)) {
            currentValue = serviceList.get(room) + 1;
            serviceList.replace(room, currentValue);
            WriteReadFile.writeFile(PATH_ROOM, covertFacilityToString(3), false);

        } else {
            serviceList.put(room, 1);
            WriteReadFile.writeFile(PATH_ROOM, covertFacilityToString(3), false);
        }

    }

    @Override
    public void displayListFacilityMaintenance() {
        for (Facility key : keySet) {
            if (serviceList.get(key) % 5 == 0) {
                System.out.println(key + " " + serviceList.get(key));
            }
        }
    }

    @Override
    public void displayListFacility() {
        for (Facility key : keySet) {
            System.out.println(key + " " + serviceList.get(key));
        }
    }

    public List<String> covertFacilityToString(int choice) {
        List<String> listString = new ArrayList<>();
        for (Facility key : keySet) {
            if (choice == 1) {
                if (key instanceof Villa) {
                    listString.add(key.toString() + "," + serviceList.get(key));
                }
            } else if (choice == 2) {
                if (key instanceof House) {
                    listString.add(key.toString() + "," + serviceList.get(key));
                }
            } else {
                if (key instanceof Room) {
                    listString.add(key.toString() + "," + serviceList.get(key));
                }
            }
        }
        return listString;
    }

    public Map<Facility, Integer> covertStringToVilla(Map<Facility, Integer> villaList) {
        List<String> stringList = WriteReadFile.readFile(PATH_VILLA);
        String[] arrCustomer;
        for (String line : stringList) {
            arrCustomer = line.split(",");
            villaList.put(new Villa(arrCustomer[0], Double.parseDouble(arrCustomer[1]), Integer.parseInt(arrCustomer[2]),
                    Integer.parseInt(arrCustomer[3]), arrCustomer[4], arrCustomer[5], Double.parseDouble(arrCustomer[6]),
                    Integer.parseInt(arrCustomer[7])), Integer.parseInt(arrCustomer[8]));
        }
        return villaList;
    }

    public Map<Facility, Integer> covertStringToHouse(Map<Facility, Integer> houseList) {
        List<String> stringList = WriteReadFile.readFile(PATH_HOUSE);
        String[] arrCustomer;
        for (String line : stringList) {
            arrCustomer = line.split(",");
            houseList.put(new House(arrCustomer[0], Double.parseDouble(arrCustomer[1]), Integer.parseInt(arrCustomer[2]),
                            Integer.parseInt(arrCustomer[3]), arrCustomer[4], arrCustomer[5], Integer.parseInt(arrCustomer[6])),
                    Integer.parseInt(arrCustomer[7]));
        }
        return houseList;
    }

    public Map<Facility, Integer> covertStringToRoom(Map<Facility, Integer> roomList) {
        List<String> stringList = WriteReadFile.readFile(PATH_ROOM);
        String[] arrCustomer;
        for (String line : stringList) {
            arrCustomer = line.split(",");
            roomList.put(new Room(arrCustomer[0], Double.parseDouble(arrCustomer[1]), Integer.parseInt(arrCustomer[2]),
                    Integer.parseInt(arrCustomer[3]), arrCustomer[4], arrCustomer[5]), Integer.parseInt(arrCustomer[6]));
            ;
        }
        return roomList;
    }
}
