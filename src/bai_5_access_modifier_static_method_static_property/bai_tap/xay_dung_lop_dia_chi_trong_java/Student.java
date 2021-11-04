package bai_5_access_modifier_static_method_static_property.bai_tap.xay_dung_lop_dia_chi_trong_java;

public class Student {
    private String name = "john";
    private String classes = "Co2";
    public Student(){
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
