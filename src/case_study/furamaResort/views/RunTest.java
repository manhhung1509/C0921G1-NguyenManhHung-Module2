package case_study.furamaResort.views;

import case_study.furamaResort.controllers.FuramaController;

public class RunTest {
    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }
}
