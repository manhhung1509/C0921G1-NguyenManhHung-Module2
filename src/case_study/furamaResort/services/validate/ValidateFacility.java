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
    static Scanner sc = new Scanner(System.in);

    public static String serviceCode() {
        final String MATCHED = "^(SV)(VL|HO|RO)\\-(\\d{4})$";
        String code = "";
        do {
            try {
                System.out.println("enter service code:");
                code = sc.nextLine();
                if (!code.matches(MATCHED)) {
                    throw new Exception();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.err.println("-code of service must be format: SVXX-YYYY, with YYYY is numbers from 0-9, XX is:\n" +
                        "-if it's Villa : XX is VL\n" +
                        "-if it's House : XX is HO\n" +
                        "-if it's Room : XX is RO\n");
            }
        } while (true);
        return code;
    }

//    public String serviceName() {
//        String matched = "^[A-Z]\\w+$";
//        String name = "";
//        do {
//            try {
//                System.out.println("enter name of service:");
//                name = sc.nextLine();
//                if (!name.matches(matched)) {
//                    throw new Exception();
//                } else {
//                    break;
//                }
//            } catch (Exception e) {
//                System.err.println("Name of service must be capitalize first letter,\n" +
//                        " the following characters are normal characters \n" +
//                        "service name contains only 1 word(Villa or House or Room \n" +
//                        "enter again: ");
//            }
//        } while (true);
//        return name;
//    }

    public static double usableArea() {
        final String MATCHED = "^(\\-?)(\\d+)$";
        String input = "";
        double area = 0.0;
        do {
            try {
                System.out.println("enter usable area");
                input = sc.nextLine();
                if (!input.matches(MATCHED)) {
                    throw new IllegalUsableAreaException();
                } else {
                    area = Double.parseDouble(input);
                    if (area > 30) {
                        break;
                    } else {
                        System.err.println("area must be big more than 30");
                    }
                }
            } catch (IllegalUsableAreaException e) {
                e.printStackTrace();
            }
        } while (true);
        return area;
    }

    public static double poolArea() {
        final String MATCHED = "^(\\-?)(\\d+)$";
        String input = "";
        double area = 0.0;
        do {
            try {
                System.out.println("enter pool area");
                input = sc.nextLine();
                if (!input.matches(MATCHED)) {
                    throw new IllegalPoolAreaException();
                } else {
                    area = Double.parseDouble(input);
                    if (area > 30) {
                        break;
                    } else {
                        System.err.println("area must be big more than 30");
                    }
                }
            } catch (IllegalPoolAreaException e) {
                e.printStackTrace();
            }
        } while (true);
        return area;
    }

    public static int rentCost() {
        String MATCHED = "^(\\-?)(\\d+)$";
        String input = "";
        int renCost = 0;
        do {
            try {
                System.out.println("enter rent cost");
                input = sc.nextLine();
                if (!input.matches(MATCHED)) {
                    throw new IllegalRentCostException();
                } else {
                    renCost = Integer.parseInt(input);
                    if (renCost <= 0) {
                        System.err.println("area must be big more than 0");
                    } else {
                        break;
                    }
                }
            } catch (IllegalRentCostException e) {
                e.printStackTrace();
            }
        } while (true);
        return renCost;
    }

    public static int maximumPeople() {
        final String MATCHED = "^(\\-?)(\\d+)$";
        String input = "";
        int maximumNumber = 0;
        do {
            try {
                System.out.println("enter maximum people");
                input = sc.nextLine();
                if (!input.matches(MATCHED)) {
                    throw new IllegalMaximumNumberException();
                } else {
                    maximumNumber = Integer.parseInt(input);
                    if (maximumNumber < 0 || maximumNumber > 20) {
                        System.err.println("number of people must be big more than 0 and small than 20");
                    } else {
                        break;
                    }
                }
            } catch (IllegalMaximumNumberException e) {
                e.printStackTrace();
            }
        } while (true);
        return maximumNumber;
    }

    public static int numberOfFloors() {
        final String MATCHED = "^(\\-?)(\\d+)$";
        String input = "";
        int floor = 0;
        do {
            try {
                System.out.println("enter number of floor");
                input = sc.nextLine();
                if (!input.matches(MATCHED)) {
                    throw new IllegalNumberOfFloorException();
                } else {
                    floor = Integer.parseInt(input);
                    if (floor > 0) {
                        break;
                    } else {
                        System.err.println("number of floor must be big more than 0");
                    }
                }
            } catch (IllegalNumberOfFloorException e) {
                e.printStackTrace();
            }
        } while (true);
        return floor;
    }

    public static String rentalType() {
        final String MATCHED = "^[A-Z]\\w*(\\s[A-Z]\\w*)*$";
        String type = "";
        do {
            try {
                System.out.println("enter rent type:");
                type = sc.nextLine();
                if (!type.matches(MATCHED)) {
                    throw new Exception();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.err.println("rent type must be capitalize first letter,\n" +
                        " the following characters are normal characters \n");
            }
        } while (true);
        return type;
    }

    public static String standardOfRoom() {
        final String MATCHED = "^[A-Z]\\w*(\\s[A-Z]\\w*)*$";
        String standard = "";
        do {
            try {
                System.out.println("standard of room:");
                standard = sc.nextLine();
                if (!standard.matches(MATCHED)) {
                    throw new Exception();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.err.println("standard of room must be capitalize first letter,\n" +
                        " the following characters are normal characters \n");
            }
        } while (true);
        return standard;
    }

    public static String getStartDay() {
        final String MATCHED = "^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$";
        String startDay = "";
        while (true) {
            System.out.println("enter start day:");
            startDay = sc.nextLine();
            if (!startDay.matches(MATCHED)) {
                System.err.println("input incorrect format dd/MM/yyyy");
            } else {
                break;
            }
        }
        return startDay;
    }

    public static String getEnDay() {
        final String MATCHED = "^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$";
        String endDay = "";
        while (true) {
            System.out.println("enter end day:");
            endDay = sc.nextLine();
            if (!endDay.matches(MATCHED)) {
                System.err.println("input incorrect format dd/MM/yyyy");
            } else {
                break;
            }
        }
        return endDay;
    }

    public static String birthDay() {
        LocalDateTime localDateTime = LocalDateTime.now();
        int day = localDateTime.getDayOfMonth();
        int month = localDateTime.getMonthValue();
        int year = localDateTime.getYear();
        String currentTime = day + "/" + month + "/" + year;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        final String MATCHED = "^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$";
        String birthday;
        while (true) {
            try {
                System.out.println("enter birthday :");
                birthday = sc.nextLine();
                if (!birthday.matches(MATCHED)) {
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