package bai_19_string_va_regex.bai_tap.validate_so_dien_thoai;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String sdt1 ="(84)-(0978489648)";
        String sdt2 ="(a8)-(22222222)";
        Pattern pattern=Pattern.compile("^\\(\\d{2}\\)\\-\\([0]\\d{9}\\)$");
        System.out.println(sdt1 +":"+pattern.matcher(sdt1).matches());
        System.out.println(sdt2 +":"+pattern.matcher(sdt2).matches());
    }
}
