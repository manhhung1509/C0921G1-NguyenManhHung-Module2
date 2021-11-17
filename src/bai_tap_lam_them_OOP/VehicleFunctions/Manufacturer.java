package bai_tap_lam_them_OOP.VehicleFunctions;

public class Manufacturer {
    public String maHangSanXuat;
    public String tenHangSanXuat;
    public String tenQuocGia;

    public Manufacturer() {
    }

    public Manufacturer(String maHangSanXuat, String tenHangSanXuat, String tenQuocGia) {
        this.maHangSanXuat = maHangSanXuat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.tenQuocGia = tenQuocGia;
    }

    public String getMaHangSanXuat() {
        return maHangSanXuat;
    }

    public void setMaHangSanXuat(String maHangSanXuat) {
        this.maHangSanXuat = maHangSanXuat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "maHangSanXuat='" + maHangSanXuat + '\'' +
                ", tenHangSanXuat='" + tenHangSanXuat + '\'' +
                ", tenQuocGia='" + tenQuocGia + '\'' +
                '}';
    }
}
