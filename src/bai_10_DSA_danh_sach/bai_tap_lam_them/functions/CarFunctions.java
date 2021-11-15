package bai_10_DSA_danh_sach.bai_tap_lam_them.functions;

import bai_10_DSA_danh_sach.bai_tap_lam_them.vehicle.Car;
import bai_10_DSA_danh_sach.bai_tap_lam_them.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class CarFunctions implements Functions {
    Scanner sc = new Scanner(System.in);
    ArrayList<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("43A-212.56", "Toyota", 2019, "Nguyen Van A", 5, "du lich"));
        carList.add(new Car("43B-453.88", "Huyndai", 2020, "Nguyen Van b", 45, "khách"));
        carList.add(new Car("43B-453.89", "Ford", 2020, "Nguyen Van C", 16, "khách"));

    }

    @Override
    public void addVehicle(Vehicle obj) {
        carList.add((Car) obj);
    }

    @Override
    public void deleteVehicle(String licensePlate) {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getLicensePlate().equals(licensePlate)) {
                System.out.println("vui lòng xác thực muốn xóa phương tiện này:\n" + "Yes \n" + "No");
                String choice = sc.nextLine();
                if (choice.equals("Yes")) {
                    carList.remove(i);
                    System.out.println("Đã xóa thành công");
                }
            }
        }
    }

    @Override
    public void displayVehicle() {
        for (Vehicle car : carList) {
            System.out.println(car);
        }
    }
}
