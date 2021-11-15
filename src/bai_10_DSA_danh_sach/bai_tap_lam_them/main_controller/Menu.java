package bai_10_DSA_danh_sach.bai_tap_lam_them.main_controller;

import bai_10_DSA_danh_sach.bai_tap_lam_them.functions.*;
import bai_10_DSA_danh_sach.bai_tap_lam_them.vehicle.Car;
import bai_10_DSA_danh_sach.bai_tap_lam_them.vehicle.MotorBike;
import bai_10_DSA_danh_sach.bai_tap_lam_them.vehicle.Truck;
import bai_10_DSA_danh_sach.bai_tap_lam_them.vehicle.Vehicle;

import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    ManufacturerList manufacturerList = new ManufacturerList();
    Functions xeOTo = new CarFunctions();
    Functions xeTai = new TruckFunctions();
    Functions xeMay = new MotorFunctions();
    int choice;
    int select;

    public void displayMenu() {
//        int choice;
//        int select;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("chọn chức năng: \n" + "=====================================");
            System.out.println("1. Thêm mới phương tiện.");
            System.out.println("2. Hiện thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. thoát");
            System.out.println("Enter your chose: \n");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("1. Thêm ô tô,\n" +
                            " 2. Thêm xe tải, \n" +
                            "3. Thêm  xe máy.\n");
                    System.out.println("mời chọn loại xe cần thêm vào:");
                    select = Integer.parseInt(input.nextLine());

                    if (select == 1) {
                        addVehicle(1);
                    } else if (select == 2) {
                        addVehicle(2);
                    } else {
                        addVehicle(3);
                    }
                    break;
                case 2:
                    System.out.println("1. Hiện thị ô tô.\n" +
                            "2. Hiện thị xe tải. \n" +
                            "3. Hiện  xe máy.\n");
                    System.out.println("mời chọn loại xe cần hiển thị: ");
                    select = Integer.parseInt(input.nextLine());
                    if (select == 1) {
                        xeOTo.displayVehicle();
                    } else if (select == 2) {
                        xeTai.displayVehicle();
                    } else {
                        xeMay.displayVehicle();
                    }
                    break;
                case 3:
                    deleteVehicle();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println(" please choose again \n");
                    System.out.println("============================");
            }
        } while (true);
    }

    public void addVehicle(int num) {
        System.out.println("nhập biển kiểm soát: ");
        String bienKiemSoat = input.nextLine();
        manufacturerList.displayManufacturerList();
        System.out.println("nhập tên hãng sản xuất: ");
        String hangSanXuat = input.nextLine();
        System.out.println("nhập năm sản xuất: ");
        int namSanXuat = Integer.parseInt(input.nextLine());
        System.out.println("nhập chủ sở hữu: ");
        String owner = input.nextLine();
        if (num == 1) {
            System.out.println("nhập số chỗ ngồi: ");
            int numberOfSeat = Integer.parseInt(input.nextLine());
            System.out.println("nhập kiểu xe: ");
            String carType = input.nextLine();
            Vehicle car = new Car(bienKiemSoat, hangSanXuat, namSanXuat, owner, numberOfSeat, carType);
            xeOTo.addVehicle(car);
        } else if (num == 2) {
            System.out.println("nhập trọng tải: ");
            double trongTai = Double.parseDouble(input.nextLine());
            Vehicle truck = new Truck(bienKiemSoat, hangSanXuat, namSanXuat, owner, trongTai);
            xeTai.addVehicle(truck);
        } else {
            System.out.println("nhập công suất: ");
            int congSuat = Integer.parseInt(input.nextLine());
            Vehicle motorbike = new MotorBike(bienKiemSoat, hangSanXuat, namSanXuat, owner, congSuat);
            xeMay.addVehicle(motorbike);
        }
    }

    public void deleteVehicle() {
        System.out.println("nhập biển kiểm soát: ");
        String bienKiemSoat = input.nextLine();
        xeMay.deleteVehicle(bienKiemSoat);
        xeTai.deleteVehicle(bienKiemSoat);
        xeOTo.deleteVehicle(bienKiemSoat);

//        System.out.println("1. Hiện thị xe tải.\n" +
//                "2. Hiện thị ôtô. \n" +
//                "3. Hiện  xe máy.\n");
//        System.out.println("mời chọn loại xe cần hiển thị: ");
//        select = Integer.parseInt(input.nextLine());
//        if (select == 1) {
//            xeTai.displayVehicle();
//        } else if (select == 2) {
//            xeOTo.displayVehicle();
//        } else {
//            xeMay.displayVehicle();
//        }
    }

}
