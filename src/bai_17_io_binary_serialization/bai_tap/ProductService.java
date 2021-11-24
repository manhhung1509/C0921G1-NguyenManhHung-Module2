package bai_17_io_binary_serialization.bai_tap;

import java.util.List;
import java.util.Scanner;

public class ProductService {
    ReadWriteFile readWriteFile = new ReadWriteFile();
    Scanner scanner = new Scanner(System.in);
    List<Product> productList;

    {
        productList = readWriteFile.readFile();
    }

    public void addProduct() {
        System.out.println("Please enter id of product");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter name product");
        String name = scanner.nextLine();
        System.out.println("Please enter manufacture");
        String manufacture = scanner.nextLine();
        System.out.println("Please enter price of product");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter another description");
        String descriptions = scanner.nextLine();
        productList.add(new Product(id, name, manufacture, price, descriptions));
        readWriteFile.writeFile(productList);
    }

    public void displayProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void searchProduct() {
        System.out.println("enter id of product to search ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product : productList) {
            if (product.getId() == id) {
                System.out.println(product);
            }
        }
    }
}

