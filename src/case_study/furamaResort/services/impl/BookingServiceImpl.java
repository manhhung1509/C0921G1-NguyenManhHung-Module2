package case_study.furamaResort.services.impl;

import case_study.furamaResort.libs.WriteReadFile;
import case_study.furamaResort.models.Booking;
import case_study.furamaResort.models.facility.Facility;
import case_study.furamaResort.models.facility.House;
import case_study.furamaResort.models.facility.Room;
import case_study.furamaResort.models.facility.Villa;
import case_study.furamaResort.services.BookingService;
import case_study.furamaResort.services.validate.ValidateFacility;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    Scanner sc = new Scanner(System.in);
    final String PATH_BOOKING = "C:\\newcodegym\\C0921G1-NguyenManhHung-Module2\\src\\case_study\\furamaResort\\data\\booking_list.csv";
    FacilityServiceImpl facilityService = new FacilityServiceImpl();
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    ValidateFacility validateFacility = new ValidateFacility();
    Map<Facility, Integer> serviceList = new LinkedHashMap<>();
    Set<Facility> keySet = serviceList.keySet();
    static TreeSet<Booking> bookingList;

    {
        bookingList = covertStringToBooking();
    }

    {
        facilityService.covertStringToVilla(serviceList);
        facilityService.covertStringToHouse(serviceList);
        facilityService.covertStringToRoom(serviceList);
    }

    public TreeSet<Booking> bookings() {
        return bookingList;
    }

    @Override
    public void addNew() {
        boolean checkExist = false;
        int currentValue = 0;
        System.out.println("Enter booking code:");
        String bookingCode = sc.nextLine();
        String startDay = validateFacility.getStartDay();
        String endDay = validateFacility.getEnDay();
        customerService.displayCustomer();
        System.out.println("========================");
        System.out.println("Enter customer code");
        String customerCode = sc.nextLine();
        System.out.println("Enter service name:");
        String serviceName = sc.nextLine();
        facilityService.displayListFacility();
        String serviceCode = validateFacility.serviceCode();
        for (Facility key : keySet) {
            if (serviceName.equals(key.getNameService())) {
                if (serviceCode.equals(key.getServiceCode())) {
                    if (key instanceof Villa) {
                        currentValue = serviceList.get(key) + 1;
                        facilityService.serviceList.replace(key,currentValue);
                        WriteReadFile.writeFile(facilityService.PATH_VILLA, facilityService.covertFacilityToString(1), false);
                    } else if (key instanceof House) {
                        currentValue = serviceList.get(key) + 1;
                        facilityService.serviceList.replace(key,currentValue);
                        WriteReadFile.writeFile(facilityService.PATH_HOUSE, facilityService.covertFacilityToString(2), false);
                    } else if (key instanceof Room){
                        currentValue = serviceList.get(key) + 1;
                        facilityService.serviceList.replace(key,currentValue);
                        WriteReadFile.writeFile(facilityService.PATH_ROOM, facilityService.covertFacilityToString(3), false);
                    }
                    Booking booking = new Booking(bookingCode, startDay, endDay, customerCode, serviceName, serviceCode);
                    bookingList.add(booking);
                    WriteReadFile.writeFile(PATH_BOOKING, covertBookToString(), false);
                    checkExist = true;
                }
            }
        }
        if (checkExist == false) {
            System.err.println("service is not found");
        }
    }

    @Override
    public void displayListBooking() {
        for (Booking booking : bookingList) {
            System.out.println(booking);
        }
    }

    public List<String> covertBookToString() {
        List<String> listString = new ArrayList<>();
        for (Booking booking : bookingList) {
            listString.add(booking.toString());
        }
        return listString;
    }

    public TreeSet<Booking> covertStringToBooking() {
        List<String> stringList = WriteReadFile.readFile(PATH_BOOKING);
        TreeSet<Booking> bookingListList = new TreeSet<>();
        String[] arrBooking;
        for (String line : stringList) {
            arrBooking = line.split(",");
            bookingListList.add(new Booking(arrBooking[0], arrBooking[1], arrBooking[2], arrBooking[3],
                    arrBooking[4], arrBooking[5]));
        }
        return bookingListList;
    }

}

