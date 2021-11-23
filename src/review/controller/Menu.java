package review.controller;

import review.service.ManageCandidate;

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
                    + "8. write file \n"
                    + "9. Exit \n");
            System.out.println("=============================");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    manageCandidate.createCandidate(1);
                    System.out.println(": Do you want to continue (Y/N)?. User chooses Y to continues, if you chooses N," +
                            " the program returns main screen and display all candidates who are created");
                    String choice1 = sc.nextLine();
                    if (choice1.equals("n")) {
                        manageCandidate.displayAll();
                        displayMenu();
                    }
                    break;
                case 2:
                    manageCandidate.createCandidate(2);
                    System.out.println(": Do you want to continue (Y/N)?. User chooses Y to continues, if you chooses N," +
                            " the program returns main screen and display all candidates who are created");
                    String choice2 = sc.nextLine();
                    if (choice2.equals("n")) {
                        manageCandidate.displayAll();
                        displayMenu();
                    }
                    break;
                case 3:
                    manageCandidate.createCandidate(3);
                    System.out.println(": Do you want to continue (Y/N)?. User chooses Y to continues, if you chooses N," +
                            " the program returns main screen and display all candidates who are created");
                    String choice3 = sc.nextLine();
                    if (choice3.equals("n")) {
                        manageCandidate.displayAll();
                        displayMenu();
                    }
                    break;
                case 4:
                    System.out.println("please choose type candidate to update: \n" +
                            "1 to update ExperienceCandiDate Candidate \n" +
                            "2 to update FresherCandidate Candidate \n" +
                            "3 to update Internship Candidate \n");
                    select = Integer.parseInt(sc.nextLine());
                    System.out.println("please enter id of candidate to update: ");
                    id = Integer.parseInt(sc.nextLine());
                    manageCandidate.updateCandidate(id);
                    break;
                case 5:
                    System.out.println("please enter id of candidate to delete: ");
                    id = Integer.parseInt(sc.nextLine());
                    manageCandidate.deleteCandidate(id);
                    break;
                case 6:
                    System.out.println("LIST OF CANDIDATE : \n");
                    manageCandidate.displayAll();
                    System.out.println("=================================== \n");
                    System.out.println("please enter type of candidate");
                    int type = Integer.parseInt(sc.nextLine());
                    System.out.println("please enter name of candidate to search: ");
                    String name = sc.nextLine();
                    manageCandidate.searchCandidate(name, type);
                    break;
                case 7:
                    manageCandidate.displayCandidate();
                    break;
                case 8:
                    manageCandidate.writeCandidateFile();
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.err.println("please enter again ");
                    System.out.println("================================");
            }
        } while (true);
    }
}
