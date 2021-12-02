package case_study.furamaResort.services.impl;

import case_study.furamaResort.libs.WriteReadFile;
import case_study.furamaResort.models.Booking;
import case_study.furamaResort.services.BookingService;
import case_study.furamaResort.services.validate.ValidateFacility;
import java.util.*;

public class BookingServiceImpl implements BookingService {
    Scanner sc = new Scanner(System.in);
    final String PATH_BOOKING = "C:\\newcodegym\\C0921G1-NguyenManhHung-Module2\\src\\case_study\\furamaResort\\data\\booking.csv";
    FacilityServiceImpl facilityService = new FacilityServiceImpl();
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    ValidateFacility validateFacility = new ValidateFacility();
    static TreeSet<Booking> bookingList;

    {
        bookingList = covertStringToBooking();
    }

    public TreeSet<Booking> bookings() {
        return bookingList;
    }

    @Override
    public void addNew() {
        System.out.println("Enter booking code:");
        String bookingCode = sc.nextLine();
        System.out.println("Enter start day:");
        String startDay = sc.nextLine();
        System.out.println("Enter end day:");
        String endDay = sc.nextLine();
        customerService.displayCustomer();
        System.out.println("========================");
        System.out.println("Enter customer code");
        String customerCode = sc.nextLine();
        System.out.println("Enter service name:");
        String serviceName = sc.nextLine();
        facilityService.displayListFacility();
        String serviceCode = validateFacility.serviceCode();
        Booking booking = new Booking(bookingCode, startDay, endDay, customerCode, serviceName, serviceCode);
        bookingList.add(booking);
        WriteReadFile.writeFile(PATH_BOOKING, covertBookToString(), false);
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

