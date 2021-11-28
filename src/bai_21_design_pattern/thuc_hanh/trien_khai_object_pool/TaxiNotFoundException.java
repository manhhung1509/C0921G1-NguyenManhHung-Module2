package bai_21_design_pattern.thuc_hanh.trien_khai_object_pool;

public class TaxiNotFoundException extends RuntimeException {

    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}
