package bai_12_java_collection_framework.bai_tap.arraylist_linkedlist;


import bai_12_java_collection_framework.bai_tap.arraylist_linkedlist.compare.DecreaseSort;
import bai_12_java_collection_framework.bai_tap.arraylist_linkedlist.compare.IncreaseSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    Scanner input = new Scanner(System.in);
    ArrayList<Product> productList = new ArrayList<>();

    {
        productList.add(new Product(1, "iphone", "Usa", "hight", 1500));
        productList.add(new Product(2, "xiaomi", "China", "medium", 750));
        productList.add(new Product(3, "redmi", "China", "hight", 400));
        productList.add(new Product(4, "nokia", "Usa", "low", 50));
        productList.add(new Product(5, "vsmart", "VietNam", "low", 200));
        productList.add(new Product(6, "Samsung", "Korea", "hight", 1450));
    }

    public void addProduct() {
        System.out.println("nhập id sản phẩm: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("nhập tên sản phẩm: ");
        String name = input.nextLine();
        System.out.println("nhập nơi sản xuất: ");
        String address = input.nextLine();
        System.out.println("nhập chất lượng sản phẩm: ");
        String quality = input.nextLine();
        System.out.println("nhập giá sản phẩm: ");
        int price = input.nextInt();
        Product product = new Product(id, name, address, quality, price);
        productList.add(product);
    }

    public void editProduct(int select) {
        int choose;
        System.out.println("1. sửa id \n" +
                "2.sửa tên sản phẩm \n" +
                "3. sửa nơi sản xuất \n" +
                "4.sửa chất lượng sản phẩm \n" +
                "5.sửa giá sản phẩm");
        System.out.println("vui lòng chọn thông tin cần chỉnh sửa: ");
        choose = Integer.parseInt(input.nextLine());
        switch (choose) {
            case 1:
                System.out.println("nhập id cần chỉnh sửa: ");
                int id = Integer.parseInt(input.nextLine());
                for (int i = 0; i < productList.size(); i++) {
                    productList.get(select - 1).setId(id);
                }
                break;
            case 2:
                System.out.println("nhập tên sản phẩm cần chỉnh sửa: ");
                String productName = input.nextLine();
                for (int i = 0; i < productList.size(); i++) {
                    productList.get(select - 1).setProductName(productName);
                }
                break;
            case 3:
                System.out.println("nhập nơi sản xuất cần chỉnh sửa: ");
                String address = input.nextLine();
                for (int i = 0; i < productList.size(); i++) {
                    productList.get(select - 1).setProductName(address);
                }
                break;
            case 4:
                System.out.println("nhập chất lượng sản phẩm cần chỉnh sửa: ");
                String quality = input.nextLine();
                for (int i = 0; i < productList.size(); i++) {
                    productList.get(select - 1).setProductName(quality);
                }
                break;
            case 5:
                System.out.println("nhập giá cần chỉnh sửa: ");
                int price = Integer.parseInt(input.nextLine());
                for (int i = 0; i < productList.size(); i++) {
                    productList.get(select - 1).setPrice(price);
                }
                break;
            default:
                System.out.println("vui lòng nhập lại: ");
        }
    }

    public void deleteProduct(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() - id == 0) {
                productList.remove(i);
            }
        }
    }

    public void displayProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void searchProduct(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductName().equals(name)) {
                System.out.println(productList.get(i));
            }
        }
    }

    public void increaseSortProduct() {
        Collections.sort(productList, new IncreaseSort());
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void decreaseSortProduct() {
        Collections.sort(productList, new DecreaseSort());
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
