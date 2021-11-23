package bai_17_io_binary_serialization.bai_tap;


import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    ProductService productService = new ProductService();

    public void menu() {
        int choice;
        while (true) {
            System.out.println("Please choice:\n" +
                    "1. Add \n" +
                    "2. Display \n" +
                    "3. search \n" +
                    "4. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productService.addProduct();
                    break;
                case 2:
                    productService.displayProduct();
                    break;
                case 3:
                    productService.searchProduct();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
