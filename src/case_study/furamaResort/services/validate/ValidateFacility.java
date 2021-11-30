package case_study.furamaResort.services.validate;

import case_study.furamaResort.services.exception.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ValidateFacility {
    Scanner sc = new Scanner(System.in);

    public String serviceCode() {
        String matched = "^(SV)(VL|HO|RO)\\-(\\d{4})$";
        String code = "";
        do {
            System.out.println("enter service code:");
            code = sc.nextLine();
            if (!code.matches(matched)) {
                System.err.println("-code of service must be format: SVXX-YYYY, with YYYY is numbers from 0-9, XX is:\n" +
                        "-if it's Villa : XX is VL\n" +
                        "-if it's House : XX is HO\n" +
                        "-if it's Room : XX is RO\n");
            } else {
                break;
            }
        } while (true);
        return code;
    }

    public String serviceName() {
        String matched = "^[A-Z]\\w+$";
        String name = "";
        do {
            System.out.println("enter name of service:");
            name = sc.nextLine();
            if (!name.matches(matched)) {
                System.err.println("Name of service must be capitalize first letter,\n" +
                        " the following characters are normal characters \n" +
                        "service name contains only 1 word(Villa or House or Room \n" +
                        "enter again: ");
            } else {
                break;
            }
        } while (true);
        return name;
    }

    public double usableArea() {
        String matched = "^(\\-?)(\\d+)$";
        String input = "";
        Double area = 0.0;
        do {
            try {
                System.out.println("enter usable area");
                input = sc.nextLine();
                if (!input.matches(matched)) {
                    throw new IllegalUsableAreaException();
                } else {
                    area = Double.parseDouble(input);
                    if (area > 30) {
                        break;
                    }else {
                        System.err.println("area must be big more than 30");
                    }
                }
            } catch (IllegalUsableAreaException e) {
                e.printStackTrace();
            }
        } while (true);
        return area;
    }

    public double poolArea() {
        String matched = "^(\\-?)(\\d+)$";
        String input = "";
        Double area = 0.0;
        do {
            try {
                System.out.println("enter pool area");
                input = sc.nextLine();
                if (!input.matches(matched)) {
                    throw new IllegalPoolAreaException();
                } else {
                    area = Double.parseDouble(input);
                    if (area > 30) {
                        break;
                    }else {
                        System.err.println("area must be big more than 30");
                    }
                }
            } catch (IllegalPoolAreaException e) {
                e.printStackTrace();
            }
        } while (true);
        return area;
    }

    public int rentCost() {
        String matched = "^(\\-?)(\\d+)$";
        String input = "";
        int renCost = 0;
        do {
            try {
                System.out.println("enter rent cost");
                input = sc.nextLine();
                if (!input.matches(matched)) {
                    throw new IllegalRentCostException();
                } else {
                    renCost = Integer.parseInt(input);
                    if (renCost <= 0) {
                        System.err.println("area must be big more than 0");
                    }else {
                        break;
                    }
                }
            } catch (IllegalRentCostException e) {
                e.printStackTrace();
            }
        } while (true);
        return renCost;
    }

    public int maximumPeople() {
        String matched = "^(\\-?)(\\d+)$";
        String input = "";
        int maximumNumber = 0;
        do {
            try {
                System.out.println("enter maximum people");
                input = sc.nextLine();
                if (!input.matches(matched)) {
                    throw new IllegalMaximumNumberException();
                } else {
                    maximumNumber = Integer.parseInt(input);
                    if (maximumNumber < 0 || maximumNumber >20) {
                        System.err.println("number of people must be big more than 0 and small than 20");
                    }else {
                        break;
                    }
                }
            } catch (IllegalMaximumNumberException e) {
                e.printStackTrace();
            }
        } while (true);
        return maximumNumber;
    }

    public int numberOfFloors() {
        String matched = "^(\\-?)(\\d+)$";
        String input = "";
        int floor = 0;
        do {
            try {
                System.out.println("enter number of floor");
                input = sc.nextLine();
                if (!input.matches(matched)) {
                    throw new IllegalNumberOfFloorException();
                } else {
                    floor = Integer.parseInt(input);
                    if (floor > 0) {
                        break;
                    }else {
                        System.err.println("number of floor must be big more than 0");
                    }
                }
            } catch (IllegalNumberOfFloorException e) {
                e.printStackTrace();
            }
        } while (true);
        return floor;
    }

    public String rentalType() {
        String matched = "^[A-Z]\\w*(\\s[A-Z]\\w*)*$";
        String type = "";
        do {
            System.out.println("enter rent type:");
            type = sc.nextLine();
            if (!type.matches(matched)) {
                System.err.println("rent type must be capitalize first letter,\n" +
                        " the following characters are normal characters \n");
            } else {
                break;
            }
        } while (true);
        return type;
    }

    public String standardOfRoom() {
        String matched = "^[A-Z]\\w*(\\s[A-Z]\\w*)*$";
        String standard = "";
        do {
            System.out.println("standard of room:");
            standard = sc.nextLine();
            if (!standard.matches(matched)) {
                System.err.println("standard of room must be capitalize first letter,\n" +
                        " the following characters are normal characters \n" );
            } else {
                break;
            }
        } while (true);
        return standard;
    }

    public String birthDay() {
        LocalDateTime localDateTime = LocalDateTime.now();
        int day = localDateTime.getDayOfMonth();
        int month = localDateTime.getMonthValue();
        int year = localDateTime.getYear();
        String currentTime = day + "/" + month + "/" + year;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        String matched = "^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$";
        String birthday;
        while (true) {
            try {
                System.out.println("enter birthday :");
                birthday = sc.nextLine();
                if (!birthday.matches(matched)) {
                    throw new IllegalBirthdayException();
                } else {
                    try {
                        Date firstDate = sdf.parse(birthday);
                        Date secondDate = sdf.parse(currentTime);
                        long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
                        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
                        if (diff < 6570) {
                            throw new IllegalBirthdayException("The date of birth must be 18 years younger than the current date");
                        } else {
                            break;
                        }
                    } catch (ParseException | IllegalBirthdayException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IllegalBirthdayException e) {
                e.printStackTrace();
            }
        }
        return birthday;
    }
}