package bai_tap_lam_them_arraylist_va_oop.service;

import bai_tap_lam_them_arraylist_va_oop.model.Candidate;
import bai_tap_lam_them_arraylist_va_oop.model.ExperienceCandiDate;
import bai_tap_lam_them_arraylist_va_oop.model.FresherCandidate;
import bai_tap_lam_them_arraylist_va_oop.model.InternCandidate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageCandidate implements FunctionsCandidate {
    Scanner sc = new Scanner(System.in);
    static List<Candidate> candidateList = new ArrayList<>();
    int count = 0;
    int count1 =0;

    static {
        candidateList.add(new ExperienceCandiDate(1, "manh hung", "nguyen", 2000, "le thi tinh",
                012312732122, "hung@gmail.com", 0, 1, "java"));
        candidateList.add(new ExperienceCandiDate(2, "viet hoang", "le ", 2001, "le thi toan",
                01231431231, "hoang@gmail.com", 0, 2, "c#"));
        candidateList.add(new ExperienceCandiDate(3, "van nha", "duong", 2002, "le thi tam",
                0231431231, "nha@gmail.com", 0, 3, "c++"));
        candidateList.add(new FresherCandidate(4, "thanh", "nguyen", 1989, "le thi tu",
                1231431231, "hung@gmail.com", 1, 2, "fair", "DTU"));
        candidateList.add(new FresherCandidate(5, "thang", "le", 1999, "le thi rieng",
                1231431231, "hung@gmail.com", 1, 3, "excilent", "science"));
        candidateList.add(new FresherCandidate(6, "tuan", "nguyen", 2001, "le thi ba",
                1231431231, "hung@gmail.com", 1, 4, "good", "military academy"));
        candidateList.add(new InternCandidate(7, "hung", "nguyen", 2000, "le thi tinh",
                1231431231, "hung@gmail.com", 2, "information", 8, "havert"));
        candidateList.add(new InternCandidate(8, "hoang", "nguyen", 2000, "le thi tinh",
                1231431231, "hung@gmail.com", 2, "ìnorr", 9, "hanoiu"));
        candidateList.add(new InternCandidate(9, "nha", "nguyen", 2000, "le thi tinh",
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
            count1++;
        }
        while (count1 < 9) {
            System.out.println("Please enter again");
            count1 = 0;
            phone = Long.parseLong(sc.nextLine());
            long tomp = phone;
            while (tomp > 0) {
                tomp /= 10;
                count1++;
            }
        }
        count1 = 0;
        System.out.println("enter email candidate : ");
        String email = sc.nextLine();
        System.out.println("enter candidate type : \n" +
                "0 for experience candidate\n" +
                "1 for fresher candidate \n" +
                "2 for intern candidate");
        int type = Integer.parseInt(sc.nextLine());
        if (choice == 1) {
            System.out.println("enter ExperienceCandiDate years :");
            int expYears = Integer.parseInt(sc.nextLine());
            while (expYears < 0 || expYears > 100) {
                System.out.println("please choose again");
                expYears = Integer.parseInt(sc.nextLine());
            }
            System.out.println("enter Professional Skill ");
            String proSkill = sc.nextLine();
            Candidate experience = new ExperienceCandiDate(id, firstName, lastName, birthDay, address,
                    phone, email, type, expYears, proSkill);
            candidateList.add(experience);
        } else if (choice == 2) {
            System.out.println("enter graduated time : ");
            int graYear = Integer.parseInt(sc.nextLine());
            System.out.println("enter Rank of Graduation (Excellence, Good, Fair, Poor): ");
            String graRank = sc.nextLine();
            while (true) {
                if (graRank.equals("Excellence") || graRank.equals("Good") || graRank.equals("Fair") || graRank.equals("Poor")) {
                    break;
                } else {
                    System.out.println("Enter again :");
                    graRank = sc.nextLine();
                }
            }
            System.out.println("enter university where student graduated : ");
            String education = sc.nextLine();
            Candidate fresherCandidate = new FresherCandidate(id, firstName, lastName, birthDay, address,
                    phone, email, type, graYear, graRank, education);
            candidateList.add(fresherCandidate);
        } else if (choice == 3) {
            System.out.println("enter Majors : ");
            String major = sc.nextLine();
            System.out.println("enter Semester : ");
            int semester = Integer.parseInt(sc.nextLine());
            System.out.println("enter University name : ");
            String university = sc.nextLine();
            Candidate internCandidate = new InternCandidate(id, firstName, lastName, birthDay, address,
                    phone, email, type, major, semester, university);
            candidateList.add(internCandidate);
        }
    }

    @Override
    public void updateCandidate(int id) {
        for (Candidate candidate : candidateList) {
            if (candidate.getCandidateId() == id) {
                if (candidate instanceof ExperienceCandiDate) {
                    createCandidate(1);
                } else if (candidate instanceof FresherCandidate) {
                    createCandidate(2);
                } else if (candidate instanceof InternCandidate) {
                    createCandidate(3);
                }
            }
        }
    }


    @Override
    public void searchCandidate(String name, int type) {
        for (Candidate candidate : candidateList) {
            if (name.equals(candidate.getFirstName()) || name.equals(candidate.getLastName())
                    && candidate.getCandidateType() == type) {
                System.out.println(candidate);
            }
        }
    }

    @Override
    public void deleteCandidate(int id) {
        candidateList.removeIf(element -> element.getCandidateId() == id);
    }

    public void displayCandidate() {
        System.out.println("if you wanna display experience candidate, choose 1 \n" +
                "if you wanna display fresher candidate, choose 2 \n" +
                "if you wanna display intern candidate, choose 3");
        int num = sc.nextInt();
        for (Candidate candidate : candidateList) {
            if (num == 1 && candidate instanceof ExperienceCandiDate) {
                System.out.println(candidate);
            } else if (num == 2 && candidate instanceof FresherCandidate) {
                System.out.println(candidate);
            } else if (num == 3 && candidate instanceof InternCandidate) {
                System.out.println(candidate);
            }
        }
    }

    @Override
    public String toString() {
        return "ManageCandidate{}";
    }
}

