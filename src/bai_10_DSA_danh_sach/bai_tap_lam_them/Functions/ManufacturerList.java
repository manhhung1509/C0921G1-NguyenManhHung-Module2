package bai_10_DSA_danh_sach.bai_tap_lam_them.Functions;

import java.util.ArrayList;

public class ManufacturerList extends Manufacturer {
    public ManufacturerList() {
    }

    public ManufacturerList(String maHangSanXuat, String tenHangSanXuat, String tenQuocGia) {
        super(maHangSanXuat, tenHangSanXuat, tenQuocGia);
    }
    ArrayList<Manufacturer> manufacturersList = new ArrayList<>();
    {
        manufacturersList.add(new Manufacturer("HSX-001","Yamaha","Nhật Bản"));
        manufacturersList.add(new Manufacturer("HSX-002","Honda","Nhật Bản"));
        manufacturersList.add(new Manufacturer("HSX-003","Dongfeng","Trung Quốc"));
        manufacturersList.add(new Manufacturer("HSX-004","Huyndai","Hàn Quốc"));
        manufacturersList.add(new Manufacturer("HSX-005","Ford","Mỹ"));
        manufacturersList.add(new Manufacturer("HSX-006","Toyota","Nhật Bản"));
        manufacturersList.add(new Manufacturer("HSX-006","Hino","Nhật Bản"));
    }
    public void displayManufacturerList(){
        for (Manufacturer element : manufacturersList) {
            System.out.println(element);
        }
    }
}
