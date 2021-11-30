package case_study.furamaResort.services.impl;

import case_study.furamaResort.controllers.FuramaController;
import case_study.furamaResort.models.facility.Facility;
import case_study.furamaResort.models.facility.House;
import case_study.furamaResort.models.facility.Room;
import case_study.furamaResort.models.facility.Villa;
import case_study.furamaResort.services.FacilityService;
import case_study.furamaResort.services.validate.ValidateFacility;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService {
    Scanner scanner = new Scanner(System.in);
    ValidateFacility validate = new ValidateFacility();
    String[] rentalTypes = {"year", "month", "day", "hour"};
    static Map<Facility, Integer> serviceList = new LinkedHashMap<>();
    Set<Facility> keySet = serviceList.keySet();

    static {
        serviceList.put(new House("House", 100, 5000000, 4, "Day", "Good", 2), 1);
        serviceList.put(new House("House", 120, 4000000, 5, "Year", "Excellent", 3), 15);
        serviceList.put(new House("House", 110, 3000000, 3, "Month", "Good", 3), 3);
        serviceList.put(new Villa("Villa", 110, 20000000, 6, "Day", "Good", 50, 1), 2);
        serviceList.put(new Villa("Villa", 200, 30000000, 7, "Year", "Signature", 100, 3), 1);
        serviceList.put(new Villa("Villa", 90, 15000000, 3, "Month", "Premium", 50, 2), 4);
        serviceList.put(new Room("Room", 150, 9000000, 7, "Hour", "free cocktail"), 7);
        serviceList.put(new Room("Room", 150, 9000000, 7, "Hour", "free breakfast"), 10);
        serviceList.put(new Room("Room", 100, 5000000, 4, "Hear", "massage"), 9);
    }

    @Override
    public void addNew() {
        FuramaController furamaController = new FuramaController();
        int choice;
        do {
            System.out.println("choice type of service you wanna add to list: ");
            System.out.println("1.Add new villa");
            System.out.println("2.Add new house");
            System.out.println("3.Add new room");
            System.out.println("4.back to menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addFacility(1);
                    break;
                case 2:
                    addFacility(2);
                    break;
                case 3:
                    addFacility(3);
                    break;
                case 4:
                    furamaController.displayMainMenu();
                    break;
            }
        } while (choice > 4 || choice < 1);
    }

    public void addFacility(int choice) {
        int currentValue = 0;
        String nameService = validate.serviceName();
        double usableArea = validate.usableArea();
        int rentCost = validate.rentCost();
        int maximumPeople = validate.maximumPeople();
        String rentalType = validate.rentalType();
        if (choice == 1) {
            String standard = validate.standardOfRoom();
            Double poolArea = validate.poolArea();
            int floors = validate.numberOfFloors();
            Facility villa = new Villa(nameService, usableArea, rentCost, maximumPeople, rentalType, standard, poolArea, floors);
            if (serviceList.containsKey(villa)) {
                currentValue = serviceList.get(villa) + 1;
                serviceList.replace(villa, currentValue);
            } else {
                serviceList.put(villa, 1);
            }
        } else if (choice == 2) {
            String standard = validate.standardOfRoom();
            int floors = validate.numberOfFloors();
            Facility house = new House(nameService, usableArea, rentCost, maximumPeople, rentalType, standard, floors);
            if (serviceList.containsKey(house)) {
                currentValue = serviceList.get(house) + 1;
                serviceList.replace(house, currentValue);
            } else {
                serviceList.put(house, 1);
            }
        } else {
            System.out.println("enter free service include: ");
            String freeServiceInclude = scanner.nextLine();
            Facility room = new Room(nameService, usableArea, rentCost, maximumPeople, rentalType, freeServiceInclude);
            if (serviceList.containsKey(room)) {
                currentValue = serviceList.get(room) + 1;
                serviceList.replace(room, currentValue);
            } else {
                serviceList.put(room, 1);
            }
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

    public String rentalType(int choice) {
        String rentalType = "";
        switch (choice) {
            case 1:
                rentalType = rentalTypes[0];
                break;
            case 2:
                rentalType = rentalTypes[1];
                break;
            case 3:
                rentalType = rentalTypes[2];
                break;
            case 4:
                rentalType = rentalTypes[3];
                break;
        }
        return rentalType;
    }
}
