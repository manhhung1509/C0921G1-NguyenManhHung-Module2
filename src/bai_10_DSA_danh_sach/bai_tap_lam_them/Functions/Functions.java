package bai_10_DSA_danh_sach.bai_tap_lam_them.Functions;

import bai_10_DSA_danh_sach.bai_tap_lam_them.Vehicle.Vehicle;

public interface Functions {
    void addVehicle(Vehicle obj);

    void deleteVehicle(String licensePlate);

    void displayVehicle();
}
