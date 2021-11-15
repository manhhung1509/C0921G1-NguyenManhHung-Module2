package bai_10_DSA_danh_sach.bai_tap_lam_them.Functions;

import bai_10_DSA_danh_sach.bai_tap_lam_them.Vehicle.MotorBike;
import bai_10_DSA_danh_sach.bai_tap_lam_them.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorFunctions implements Functions {
    Scanner input = new Scanner(System.in);
    ArrayList<MotorBike> motorBikerList = new ArrayList<>();

    {
        motorBikerList.add(new MotorBike("43-K1-678.56", "Yamaha", 2019, "Nguyễn Văn A", 100));
        motorBikerList.add(new MotorBike("43-H1-345.89", "honda", 2019, "Nguyễn Văn B", 150));
        motorBikerList.add(new MotorBike("43-AK-765.23", "Yamaha", 2019, "Nguyễn Văn C", 50));
    }

    @Override
    public void addVehicle(Vehicle obj) {
        motorBikerList.add((MotorBike) obj);
    }

    @Override
    public void deleteVehicle(String licensePlate) {
        for (int i = 0; i < motorBikerList.size(); i++) {
            if (motorBikerList.get(i).getLicensePlate().equals(licensePlate)) {
                System.out.println("vui lòng xác thực muốn xóa phương tiện này:\n" + "Yes. \n" + "No.");
                String choice = input.nextLine();
                if (choice.equals("Yes")) {
                    motorBikerList.remove(i);
                    System.out.println("Đã xóa thành công");
                }
            }
        }
    }

    @Override
    public void displayVehicle() {
        for (Vehicle motor : motorBikerList) {
            System.out.println(motor);
        }
    }
}
