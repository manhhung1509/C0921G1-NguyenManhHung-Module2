package bai_tap_lam_them_arraylist_va_oop.menu_candidate;
import bai_tap_lam_them_arraylist_va_oop.candidate_management.ManageCandidate;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    ManageCandidate manageCandidate = new ManageCandidate();
    int choice;
    int select;
    int id;

    public void displayMenu() {
        do {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM \n"
                    + "1. ExperienceCandiDate \n"
                    + "2. FresherCandidate \n"
                    + "3. Internship \n"
                    + "4. Update \n"
                    + "5. Delete \n"
                    + "6. Searching\n"
                    + "7. Display\n"
                    + "8. Exit");
            System.out.println("Please choose 1 to Create ExperienceCandiDate Candidate \n" +
                    "2 to Create FresherCandidate Candidate \n" +
                    "3 to Create Internship Candidate \n" +
                    "4 to Update Candidate \n" +
                    "5 to Delete Candidate \n" +
                    "6 to Searching \n" +
                    "7 to display \n" +
                    "8 to Exit program \n");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    manageCandidate.createCandidate(1);
                    break;
                case 2:
                    manageCandidate.createCandidate(2);
                    break;
                case 3:
                    manageCandidate.createCandidate(3);
                    break;
                case 4:
                    System.out.println("please choose type candidate to update: \n" +
                            "1 to update ExperienceCandiDate Candidate \n" +
                            "2 to update FresherCandidate Candidate \n" +
                            "3 to update Internship Candidate \n");
                    select = Integer.parseInt(sc.nextLine());
                    System.out.println("please enter id of candidate to update: ");
                    id = Integer.parseInt(sc.nextLine());
                    manageCandidate.updateCandidate(select, id);
                    break;
                case 5:
                    System.out.println("please choose type candidate to delete: \n" +
                            "1 to delete ExperienceCandiDate Candidate \n" +
                            "2 to delete FresherCandidate Candidate \n" +
                            "3 to delete Internship Candidate \n");
                    select = Integer.parseInt(sc.nextLine());
                    System.out.println("please enter id of candidate to delete: ");
                    id = Integer.parseInt(sc.nextLine());
                    manageCandidate.deleteCandidate(select, id);
                    break;
                case 6:
                    System.out.println("LIST OF CANDIDATE : \n");
                    manageCandidate.displayExperienceCandidate();
                    System.out.println("=================================== \n");
                    manageCandidate.displayFresherCandidate();
                    System.out.println("=================================== \n");
                    manageCandidate.displayInternCandidate();
                    System.out.println("please choose type candidate to search: \n" +
                            "1 to search ExperienceCandiDate Candidate \n" +
                            "2 to search FresherCandidate Candidate \n" +
                            "3 to search Internship Candidate \n");
                    select = Integer.parseInt(sc.nextLine());
                    System.out.println("please enter name of candidate to search: ");
                    String name = sc.nextLine();
                    manageCandidate.searchCandidate(select, name);
                    break;
                case 7:
                    manageCandidate.displayCandidate();
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("please enter again ");
                    System.out.println("================================");
            }
        } while (true);
    }
}
