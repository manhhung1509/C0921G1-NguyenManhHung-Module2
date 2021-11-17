package bai_tap_lam_them_OOP.VehicleFunctions;

import bai_tap_lam_them_OOP.vehicle.Truck;
import bai_tap_lam_them_OOP.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class TruckFunctions implements Functions {
    Scanner input = new Scanner(System.in);
    ArrayList<Truck> truckList = new ArrayList<>();

    {
        truckList.add(new Truck("43C-012.34", "Huyndai", 2019, "Nguyễn Văn A", 3));
        truckList.add(new Truck("43C-47.678", "Dongfeng", 2020, "Nguyễn Văn B", 9));
        truckList.add(new Truck("43C-45.235", "Hino", 2021, "Nguyễn Văn C", 12));
    }

    @Override
    public void addVehicle(Vehicle obj) {
        truckList.add((Truck) obj);
    }

    @Override
    public void deleteVehicle(String licensePlate) {
        for (int i = 0; i < truckList.size(); i++) {
            if (truckList.get(i).getLicensePlate().equals(licensePlate)) {
                System.out.println("vui lòng xác thực muốn xóa phương tiện này:\n" + "Yes. \n" + "No.");
                String choice = input.nextLine();
                if (choice.equals("yes")) {
                    truckList.remove(i);
                    System.out.println("Đã xóa thành công \n");
                }
            }
        }
    }

    @Override
    public void displayVehicle() {
        for (Vehicle truck : truckList) {
            System.out.println(truck);
        }
    }
}
