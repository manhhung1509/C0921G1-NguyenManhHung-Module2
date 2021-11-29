package case_study.furamaResort.services.impl;

import case_study.furamaResort.controllers.FuramaController;
import case_study.furamaResort.models.facility.Facility;
import case_study.furamaResort.models.facility.House;
import case_study.furamaResort.models.facility.Room;
import case_study.furamaResort.models.facility.Villa;
import case_study.furamaResort.services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService {
    Scanner scanner = new Scanner(System.in);
    String[] rentalTypes = {"year", "month", "day", "hour"};
    static Map<Facility, Integer> serviceList = new LinkedHashMap<>();
    Set<Facility> keySet = serviceList.keySet();

    static {
        serviceList.put(new House("house", 100, 5000000, 4, "day", "5 star", 2), 1);
        serviceList.put(new House("house", 120, 4000000, 5, "year", "4 star", 3), 15);
        serviceList.put(new House("house", 110, 3000000, 3, "month", "3 star", 3), 3);
        serviceList.put(new Villa("villa", 110, 20000000, 6, "day", "4 star", 50, 1), 2);
        serviceList.put(new Villa("villa", 200, 30000000, 7, "year", "5 star", 100, 3), 1);
        serviceList.put(new Villa("villa", 90, 15000000, 3, "month", "3 star", 50, 2), 4);
        serviceList.put(new Room("room", 150, 9000000, 7, "hour", "free cocktail"), 7);
        serviceList.put(new Room("room", 150, 9000000, 7, "hour", "free breakfast"), 10);
        serviceList.put(new Room("room", 100, 5000000, 4, "year", "massage"), 9);
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
                    serviceList.put(addFacility(1), 1);
                    break;
                case 2:
                    serviceList.put(addFacility(2), 1);
                    break;
                case 3:
                    serviceList.put(addFacility(3), 1);
                    break;
                case 4:
                    furamaController.displayMainMenu();
                    break;
            }
        } while (choice > 4 || choice < 1);
    }

    public Facility addFacility(int choice) {
        String name;
        do {
            System.out.println("Enter name of service: ");
            name = (scanner.nextLine()).toLowerCase();
            if (!("villa".equals(name) || "house".equals(name) || "room".equals(name))) {
                System.err.println("name of this service is not available. please enter again:");
            } else {
                break;
            }
        } while (true);
        System.out.println("Enter usable area: ");
        double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter rent cost: ");
        int cost = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter maximum people: ");
        int maximumPeople = Integer.parseInt(scanner.nextLine());
        int select;
        do {
            System.out.println("Enter rental Type: \n" +
                    "enter 1 to choice rent for year \n" +
                    "enter 2 to choice rent for month \n" +
                    "enter 3 to choice rent for day \n" +
                    "enter 4 to choice rent for hour \n");
            select = Integer.parseInt(scanner.nextLine());
        } while (select < 1 || select > 4);
        String type = rentalType(select);
        if (choice == 1) {
            System.out.println("Enter standard of room: ");
            String standard = scanner.nextLine();
            System.out.println("Enter pool area: ");
            Double poolArea = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter number of floors: ");
            int floors = Integer.parseInt(scanner.nextLine());
            Facility villa = new Villa(name, usableArea, cost, maximumPeople, type, standard, poolArea, floors);
            return villa;
        } else if (choice == 2) {
            System.out.println("Enter standard of room:");
            String standard = scanner.nextLine();
            System.out.println("Enter number of floors: ");
            int floors = Integer.parseInt(scanner.nextLine());
            Facility house = new House(name, usableArea, cost, maximumPeople, type, standard, floors);
            return house;
        } else if (choice == 3) {
            System.out.println("enter free Service included: ");
            String freeService = scanner.nextLine();
            Facility room = new Room(name, usableArea, cost, maximumPeople, type, freeService);
            return room;
        }
        return null;
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
