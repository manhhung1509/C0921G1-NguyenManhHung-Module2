package bai_tap_lam_them_arraylist_va_oop.candidate_management;

import bai_tap_lam_them_arraylist_va_oop.candidate.ExperienceCandiDate;
import bai_tap_lam_them_arraylist_va_oop.candidate.FresherCandidate;
import bai_tap_lam_them_arraylist_va_oop.candidate.InternCandidate;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageCandidate implements FunctionsCandidate {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    static ArrayList<ExperienceCandiDate> experienceList = new ArrayList<>();
    static ArrayList<FresherCandidate> fresherCandidateList = new ArrayList<>();
    static ArrayList<InternCandidate> internCandidateList = new ArrayList<>();

    static {
        experienceList.add(new ExperienceCandiDate(1, "manh hung", "nguyen", 2000, "le thi tinh",
                012312732122, "hung@gmail.com", 0, 1, "java"));
        experienceList.add(new ExperienceCandiDate(2, "viet hoang", "le ", 2001, "le thi toan",
                1231431231, "hoang@gmail.com", 0, 2, "c#"));
        experienceList.add(new ExperienceCandiDate(3, "van nha", "duong", 2002, "le thi tam",
                1231431231, "nha@gmail.com", 0, 3, "c++"));
    }

    static {
        fresherCandidateList.add(new FresherCandidate(1, "thanh", "nguyen", 1989, "le thi tu",
                1231431231, "hung@gmail.com", 1, 2, "fair", "DTU"));
        fresherCandidateList.add(new FresherCandidate(2, "thang", "le", 1999, "le thi rieng",
                1231431231, "hung@gmail.com", 1, 3, "excilent", "science"));
        fresherCandidateList.add(new FresherCandidate(3, "tuan", "nguyen", 2001, "le thi ba",
                1231431231, "hung@gmail.com", 1, 4, "good", "military academy"));
    }

    static {
        internCandidateList.add(new InternCandidate(1, "hung", "nguyen", 2000, "le thi tinh",
                1231431231, "hung@gmail.com", 2, "ìnnformationt", 8, "havert"));
        internCandidateList.add(new InternCandidate(2, "hoang", "nguyen", 2000, "le thi tinh",
                1231431231, "hung@gmail.com", 2, "ìnnformationt", 9, "hanoiu"));
        internCandidateList.add(new InternCandidate(3, "nha", "nguyen", 2000, "le thi tinh",
                1231431231, "hung@gmail.com", 2, "ìnnformationt", 10, "duy tan"));
    }


    @Override
    public void createCandidate(int choice) {
        System.out.println("enter candidate id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("enter first name of candidate : ");
        String firstName = sc.nextLine();
        System.out.println("enter last name candidate : ");
        String lastName = sc.nextLine();
        System.out.println("enter birthday of candidate : ");
        int birthDay = Integer.parseInt(sc.nextLine());
        int temp = birthDay;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        while (count != 4 || birthDay > 2021 || birthDay < 1990) {
            System.out.println("Please enter again");
            count = 0;
            birthDay = Integer.parseInt(sc.nextLine());
            int tomp = birthDay;
            while (tomp > 0) {
                tomp /= 10;
                count++;
            }
        }
        count = 0;
        System.out.println("enter address of candidate : ");
        String address = sc.nextLine();
        System.out.println("enter phone of candidate : ");
        long phone = Long.parseLong(sc.nextLine());
        long tempt = phone;
        while (tempt > 0) {
            tempt /= 10;
            count++;
        }
        while (count < 9) {
            System.out.println("Please enter again");
            count = 0;
            phone = Long.parseLong(sc.nextLine());
            long tomp = phone;
            while (tomp > 0) {
                tomp /= 10;
                count++;
            }
        }
        System.out.println("enter email candidate : ");
        String email = sc.nextLine();
        System.out.println("enter candidate type : \n" +
                "0 for experience candidate\n" +
                "1 for fresher candidate \n" +
                "2 for intern candidate");
        int type = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                System.out.println("enter ExperienceCandiDate years :");
                int expYears = Integer.parseInt(sc.nextLine());
                while (expYears < 0 || expYears > 100) {
                    System.out.println("please choose again");
                    expYears = Integer.parseInt(sc.nextLine());
                }
                System.out.println("enter Professional Skill ");
                String proSkill = sc.nextLine();
                ExperienceCandiDate experience = new ExperienceCandiDate(id, firstName, lastName, birthDay, address,
                        phone, email, type, expYears, proSkill);
                experienceList.add(experience);
                System.out.println(": Do you want to continue (Y/N)? ");
                String c = sc.nextLine();
                if ("y".equals(c)) {
                    System.out.println("enter 1 to create Experience candidate, 2 to create Fresher candidate, 3 to create intern candidate");
                    int i = Integer.parseInt(sc.nextLine());
                    createCandidate(i);
                } else {
                    displayExperienceCandidate();
                    displayFresherCandidate();
                    displayInternCandidate();
                }
                break;
            case 2:
                System.out.println("enter graduated time : ");
                int graYear = Integer.parseInt(sc.nextLine());
                System.out.println("enter Rank of Graduation (Excellence, Good, Fair, Poor): ");
                String graRank = sc.nextLine();
                while (true) {
                    if (graRank.equals("Excellence") || graRank.equals("Good") || graRank.equals("Fair") || graRank.equals("Poor")) {
                        break;
                    } else {
                        System.out.println("nhập lại:");
                        graRank = sc.nextLine();
                    }
                }
                System.out.println("enter university where student graduated : ");
                String education = sc.nextLine();
                FresherCandidate fresherCandidate = new FresherCandidate(id, firstName, lastName, birthDay, address,
                        phone, email, type, graYear, graRank, education);
                fresherCandidateList.add(fresherCandidate);
                System.out.println(": Do you want to continue (Y/N)? ");
                String d = sc.nextLine();
                if ("y".equals(d)) {
                    System.out.println("enter 1 to create Experience candidate, 2 to create Fresher candidate, 3 to create intern candidate");
                    int f = Integer.parseInt(sc.nextLine());
                    createCandidate(f);
                } else {
                    displayExperienceCandidate();
                    displayFresherCandidate();
                    displayInternCandidate();
                }
                break;
            case 3:
                System.out.println("enter Majors : ");
                String major = sc.nextLine();
                System.out.println("enter Semester : ");
                int semester = Integer.parseInt(sc.nextLine());
                System.out.println("enter University name : ");
                String university = sc.nextLine();
                InternCandidate internCandidate = new InternCandidate(id, firstName, lastName, birthDay, address,
                        phone, email, type, major, semester, university);

                System.out.println(": Do you want to continue (Y/N)? ");
                String t = sc.nextLine();
                if ("y".equals(t)) {
                    System.out.println("enter 1 to create Experience candidate, 2 to create Fresher candidate, 3 to create intern candidate");
                    int b = Integer.parseInt(sc.nextLine());
                    createCandidate(b);
                } else {
                    displayExperienceCandidate();
                    displayFresherCandidate();
                    displayInternCandidate();
                }
                break;
        }
    }

    @Override
    public void updateCandidate(int select, int id) {
        if (select == 1) {
            for (ExperienceCandiDate experience : experienceList) {
                if (experience.getCandidateId() == id) {
                    int index = experienceList.indexOf(experience);
                    System.out.println("enter candidate id: ");
                    int iD = Integer.parseInt(sc.nextLine());
                    System.out.println("enter first name of candidate : ");
                    String firstName = sc.nextLine();
                    System.out.println("enter last name candidate : ");
                    String lastName = sc.nextLine();
                    System.out.println("enter birthday of candidate : ");
                    int birthDay = Integer.parseInt(sc.nextLine());
                    int temp = birthDay;
                    while (temp > 0) {
                        temp /= 10;
                        count++;
                    }
                    while (count != 4 || birthDay > 2021 || birthDay < 1990) {
                        System.out.println("Please enter again");
                        count = 0;
                        birthDay = Integer.parseInt(sc.nextLine());
                        int tomp = birthDay;
                        while (tomp > 0) {
                            tomp /= 10;
                            count++;
                        }
                    }
                    System.out.println("enter address of candidate : ");
                    String address = sc.nextLine();
                    System.out.println("enter phone of candidate : ");
                    long phone = Long.parseLong(sc.nextLine());
                    long tempt = phone;
                    while (tempt > 0) {
                        tempt /= 10;
                        count++;
                    }
                    while (count < 9) {
                        System.out.println("Please enter again");
                        count = 0;
                        phone = Long.parseLong(sc.nextLine());
                        long tomp = phone;
                        while (tomp > 0) {
                            tomp /= 10;
                            count++;
                        }
                    }
                    System.out.println("enter email candidate : ");
                    String email = sc.nextLine();
                    System.out.println("enter candidate type : \n" +
                            "0 for experience candidate\n" +
                            "1 for fresher candidate \n" +
                            "2 for intern candidate");
                    int type = Integer.parseInt(sc.nextLine());
                    System.out.println("enter ExperienceCandiDate years :");
                    int expYears = Integer.parseInt(sc.nextLine());
                    while (expYears < 0 || expYears > 100) {
                        System.out.println("please choose again");
                        expYears = Integer.parseInt(sc.nextLine());
                    }
                    System.out.println("enter Professional Skill ");
                    String proSkill = sc.nextLine();
                    experience = new ExperienceCandiDate(iD, firstName, lastName, birthDay, address,
                            phone, email, type, expYears, proSkill);
                    experienceList.set(index, experience);
                }
            }
        } else if (select == 2) {
            for (FresherCandidate fresherCandidate : fresherCandidateList) {
                if (fresherCandidate.getCandidateId() == id) {
                    int index = fresherCandidateList.indexOf(fresherCandidate);
                    System.out.println("enter candidate id: ");
                    int iD = Integer.parseInt(sc.nextLine());
                    System.out.println("enter first name of candidate : ");
                    String firstName = sc.nextLine();
                    System.out.println("enter last name candidate : ");
                    String lastName = sc.nextLine();
                    System.out.println("enter birthday of candidate : ");
                    int birthDay = Integer.parseInt(sc.nextLine());
                    int temp = birthDay;
                    while (temp > 0) {
                        temp /= 10;
                        count++;
                    }
                    while (count != 4 || birthDay > 2021 || birthDay < 1990) {
                        System.out.println("Please enter again");
                        count = 0;
                        birthDay = Integer.parseInt(sc.nextLine());
                        int tomp = birthDay;
                        while (tomp > 0) {
                            tomp /= 10;
                            count++;
                        }
                    }
                    System.out.println("enter address of candidate : ");
                    String address = sc.nextLine();
                    System.out.println("enter phone of candidate : ");
                    long phone = Long.parseLong(sc.nextLine());
                    long tempt = phone;
                    while (tempt > 0) {
                        tempt /= 10;
                        count++;
                    }
                    while (count < 9) {
                        System.out.println("Please enter again");
                        count = 0;
                        phone = Long.parseLong(sc.nextLine());
                        long tomp = phone;
                        while (tomp > 0) {
                            tomp /= 10;
                            count++;
                        }
                    }
                    System.out.println("enter email candidate : ");
                    String email = sc.nextLine();
                    System.out.println("enter candidate type : \n" +
                            "0 for experience candidate\n" +
                            "1 for fresherCandidate candidate \n" +
                            "2 for intern candidate");
                    int type = Integer.parseInt(sc.nextLine());
                    System.out.println("enter graduated time : ");
                    int graYear = Integer.parseInt(sc.nextLine());
                    System.out.println("enter Rank of Graduation (Excellence, Good, Fair, Poor): ");
                    String graRank = sc.nextLine();
                    while (true) {
                        if (graRank.equals("Excellence") || graRank.equals("Good") || graRank.equals("Fair") || graRank.equals("Poor")) {
                            break;
                        } else {
                            System.out.println("nhập lại:");
                            graRank = sc.nextLine();
                        }
                    }
                    System.out.println("enter university where student graduated : ");
                    String education = sc.nextLine();
                    fresherCandidate = new FresherCandidate(iD, firstName, lastName, birthDay, address,
                            phone, email, type, graYear, graRank, education);
                    fresherCandidateList.set(index, fresherCandidate);
                }
            }
            displayFresherCandidate();
        } else if (select == 3) {
            for (InternCandidate internCandidate : internCandidateList) {
                if (internCandidate.getCandidateId() == id) {
                    int index = internCandidateList.indexOf(internCandidate);
                    System.out.println("enter candidate id: ");
                    int iD = Integer.parseInt(sc.nextLine());
                    System.out.println("enter first name of candidate : ");
                    String firstName = sc.nextLine();
                    System.out.println("enter last name candidate : ");
                    String lastName = sc.nextLine();
                    System.out.println("enter birthday of candidate : ");
                    int birthDay = Integer.parseInt(sc.nextLine());
                    int temp = birthDay;
                    while (temp > 0) {
                        temp /= 10;
                        count++;
                    }
                    while (count != 4 || birthDay > 2021 || birthDay < 1990) {
                        System.out.println("Please enter again");
                        count = 0;
                        birthDay = Integer.parseInt(sc.nextLine());
                        int tomp = birthDay;
                        while (tomp > 0) {
                            tomp /= 10;
                            count++;
                        }
                    }
                    System.out.println("enter address of candidate : ");
                    String address = sc.nextLine();
                    System.out.println("enter phone of candidate : ");
                    long phone = Long.parseLong(sc.nextLine());
                    long tempt = phone;
                    while (tempt > 0) {
                        tempt /= 10;
                        count++;
                    }
                    while (count < 9) {
                        System.out.println("Please enter again");
                        count = 0;
                        phone = Long.parseLong(sc.nextLine());
                        long tomp = phone;
                        while (tomp > 0) {
                            tomp /= 10;
                            count++;
                        }
                    }
                    System.out.println("enter email candidate : ");
                    String email = sc.nextLine();
                    System.out.println("enter candidate type : \n" +
                            "0 for experience candidate\n" +
                            "1 for fresher candidate \n" +
                            "2 for internCandidate candidate");
                    int type = Integer.parseInt(sc.nextLine());
                    System.out.println("enter Majors : ");
                    String major = sc.nextLine();
                    System.out.println("enter Semester : ");
                    int semester = Integer.parseInt(sc.nextLine());
                    System.out.println("enter University name : ");
                    String university = sc.nextLine();
                    internCandidate = new InternCandidate(iD, firstName, lastName, birthDay, address,
                            phone, email, type, major, semester, university);
                    internCandidateList.set(index, internCandidate);
                }
            }
        }
    }

    @Override
    public void searchCandidate(int select, String name) {
        if (select == 1) {
            for (ExperienceCandiDate e : experienceList) {
                if (name.equals(e.getFirstName()) || name.equals(e.getLastName())) {
                    System.out.println(e.getFirstName() + " " + e.getLastName() + " | " + e.getBirthDate() + " | " + e.getAddress() + " | " +
                            e.getPhone() + " | " + e.getEmail() + " | " + e.getCandidateType());
                }
            }
        } else if (select == 2) {
            for (FresherCandidate f : fresherCandidateList) {
                if (name.equals(f.getFirstName()) || name.equals(f.getLastName())) {
                    System.out.println(f.getFirstName() + " " + f.getLastName() + " | " + f.getBirthDate() + " | " + f.getAddress() + " | " +
                            f.getPhone() + " | " + f.getEmail() + " | " + f.getCandidateType());
                }
            }
        } else if (select == 3) {
            for (InternCandidate i : internCandidateList) {
                if (name.equals(i.getFirstName()) || name.equals(i.getLastName())) {
                    System.out.println(i.getFirstName() + " " + i.getLastName() + " | " + i.getBirthDate() + " | " + i.getAddress() + " | " +
                            i.getPhone() + " | " + i.getEmail() + " | " + i.getCandidateType());
                }
            }
        }
    }

    @Override
    public void deleteCandidate(int select, int id) {
        if (select == 1) {
            experienceList.removeIf(element -> element.getCandidateId() == id);
        } else if (select == 2) {
            fresherCandidateList.removeIf(element -> element.getCandidateId() == id);
        } else if (select == 3) {
            internCandidateList.removeIf(element -> element.getCandidateId() == id);
            displayInternCandidate();
        }
    }

    public void displayCandidate() {
        System.out.println("if you wanna display experience candidate, choose 1 \n" +
                "if you wanna display experience candidate, choose 2 \n" +
                "if you wanna display experience candidate, choose 3");
        int num = sc.nextInt();
        if (num == 1) {
            displayExperienceCandidate();
        } else if (num == 2) {
            displayFresherCandidate();
        } else if (num == 3) {
            displayInternCandidate();
        }
    }

    public void displayExperienceCandidate() {
        for (ExperienceCandiDate element : experienceList) {
            System.out.println(element);
        }
    }

    public void displayFresherCandidate() {
        for (FresherCandidate element : fresherCandidateList) {
            System.out.println(element);
        }
    }

    public void displayInternCandidate() {
        for (InternCandidate element : internCandidateList) {
            System.out.println(element);
        }
    }
}

