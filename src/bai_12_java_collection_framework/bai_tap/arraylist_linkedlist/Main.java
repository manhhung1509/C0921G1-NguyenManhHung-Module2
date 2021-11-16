package bai_12_java_collection_framework.bai_tap.arraylist_linkedlist;

import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);
    ProductManager productManager = new ProductManager();
    int choice;
    int select;
    int id;

    public void selectionMenuFunction() {
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM");
            System.out.println("các chức năng: \n" + "=====================================");
            System.out.println("1. Thêm sản phẩm.");
            System.out.println("2. Sửa thông tin sản phẩm theo id");
            System.out.println("3. Xoá sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("7. thoát");
            System.out.println("Enter your choice : \n");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    System.out.println("nhập id sản phẩm muốn chỉnh sửa:");
                    select = Integer.parseInt(input.nextLine());
                    productManager.editProduct(select);
                    break;
                case 3:
                    System.out.println("nhập id của sản phẩm muốn xóa: ");
                    id = Integer.parseInt(input.nextLine());
                    productManager.deleteProduct(id);
                    break;
                case 4:
                    productManager.displayProduct();
                    break;
                case 5:
                    System.out.println("nhập tên sản phẩm muốn tìm kiếm: ");
                    String name = input.nextLine();
                    productManager.searchProduct(name);
                    break;
                case 6:
                    int select;
                    System.out.println("lựa chọn sắp xếp tăng dần hoặc giảm dần: ");
                    System.out.println("1. sắp xếp tăng dần: ");
                    System.out.println("2. sắp xếp giảm dần: ");
                    select = Integer.parseInt(input.nextLine());
                    if (select == 1) {
                        productManager.increaseSortProduct();
                    } else if (select == 2) {
                        productManager.decreaseSortProduct();
                    }
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println(" please choose again \n");
                    System.out.println("============================");
            }
        } while (true);
    }
}
