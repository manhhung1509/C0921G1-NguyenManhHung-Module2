package bai_5_access_modifier_static_method_static_property.bai_tap.xay_dung_lop_dia_chi_trong_java;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("hung");
        student.setClasses("N2O");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
