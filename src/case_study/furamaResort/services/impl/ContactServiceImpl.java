package case_study.furamaResort.services.impl;

import case_study.furamaResort.libs.WriteReadFile;
import case_study.furamaResort.models.Booking;
import case_study.furamaResort.models.Contract;
import case_study.furamaResort.services.ContactService;

import java.util.*;

public class ContactServiceImpl implements ContactService {
    Scanner sc = new Scanner(System.in);
    BookingServiceImpl bookingService = new BookingServiceImpl();
    final String PATH_BOOKING = "C:\\newcodegym\\C0921G1-NguyenManhHung-Module2\\src\\case_study\\furamaResort\\data\\booking.csv";
    final String PATH_CONTRACt = "C:\\newcodegym\\C0921G1-NguyenManhHung-Module2\\src\\case_study\\furamaResort\\data\\contract.csv";
    static Queue<Booking> bookingList = new LinkedList<>();
    static Queue<Contract> contractList = new LinkedList<>();

    {
        bookingList.addAll(bookingService.bookings());
        contractList = covertStringToContract();
    }

    @Override
    public void addNew() {
        Booking booking = bookingList.poll();
        System.out.println(booking);
        WriteReadFile.writeFile(PATH_BOOKING, covertBookingToString(), false);
        System.out.println("========================");
        if ("Villa".equals(booking.getServiceName()) || "House".equals(booking.getServiceName())) {
            String bookingCode = booking.getBookingCode();
            String customerCode = booking.getCustomerCode();
            System.out.println("Enter contract number:");
            int contractNumber = Integer.parseInt(sc.nextLine());
            System.out.println("Enter deposit:");
            int deposit = Integer.parseInt(sc.nextLine());
            System.out.println("Enter total payment:");
            int totalPayment = Integer.parseInt(sc.nextLine());
            Contract contract = new Contract(contractNumber, bookingCode, deposit, totalPayment, customerCode);
            contractList.offer(contract);
            WriteReadFile.writeFile(PATH_CONTRACt, covertContractToString(), false);
        }
    }

    @Override
    public void editContracts() {
        int choice = 0;
        System.out.println("enter booking code to edit contract:");
        String bookingCode = sc.nextLine();
        for (Contract contract : contractList) {
            if (bookingCode.equals(contract.getBookingCode())) {
                do {
                    try {
                        System.out.println("enter 1 to edit contract code:\n" +
                                "enter 2 to edit booking code \n" +
                                "enter 3 to edit deposit \n" +
                                "enter 4 to edit total payment \n" +
                                "enter 5 to edit customer code \n" +
                                "enter 6 to finish");
                        choice = Integer.parseInt(sc.nextLine());
                        switch (choice) {
                            case 1:
                                System.out.println("enter contract code:");
                                contract.setContractNumber(Integer.parseInt(sc.nextLine()));
                                break;
                            case 2:
                                System.out.println("enter booking code:");
                                contract.setBookingCode(sc.nextLine());
                                break;
                            case 3:
                                System.out.println("enter deposit:");
                                contract.setDepositNumber(Integer.parseInt(sc.nextLine()));
                                break;
                            case 4:
                                System.out.println("enter total payment:");
                                contract.setTotalPayment(Integer.parseInt(sc.nextLine()));
                                break;
                            case 5:
                                System.out.println("enter customer code:");
                                contract.setCustomerCode(sc.nextLine());
                                break;
                        }
                    } catch (Exception e) {
                        System.err.println("input is not a number");
                    }
                } while (choice != 6);
            } else {
                System.err.println("booking code is not found");
                System.out.println("=========================");
            }
        }
        WriteReadFile.writeFile(PATH_CONTRACt, covertContractToString(), false);
    }

    @Override
    public void displayListContracts() {
        for (Contract contract : contractList) {
            System.out.println(contract);
        }
        System.out.println("=======================");
        for (Booking booking : bookingList) {
            System.out.println(booking);
        }
    }

    public List<String> covertBookingToString() {
        List<String> listString = new ArrayList<>();
        for (Booking booking : bookingList) {
            listString.add(booking.toString());
        }
        return listString;
    }

    public List<String> covertContractToString() {
        List<String> listString = new ArrayList<>();
        for (Contract contract : contractList) {
            listString.add(contract.toString());
        }
        return listString;
    }

    public Queue<Contract> covertStringToContract() {
        List<String> stringList = WriteReadFile.readFile(PATH_CONTRACt);
        Queue<Contract> contractList = new LinkedList<>();
        String[] arrContract;
        for (String line : stringList) {
            arrContract = line.split(",");
            contractList.add(new Contract(Integer.parseInt(arrContract[0]), arrContract[1], Integer.parseInt(arrContract[2]), Integer.parseInt(arrContract[3]),
                    arrContract[4]));
        }
        return contractList;
    }
}
