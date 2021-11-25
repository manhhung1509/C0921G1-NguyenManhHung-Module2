package bai_19_string_va_regex.bai_tap.validate_ten_lop_hoc;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String name1 = "C0318G";
        String name2 = "M0318G";
        String name3 = "P0323A";
        Pattern pattern = Pattern.compile("^[C|A|P](\\d){4}[G|H|I|K|L|M]$");
        System.out.println(name1 +":"+pattern.matcher(name1).matches());
        System.out.println(name2 +":"+pattern.matcher(name2).matches());
        System.out.println(name3 +":"+pattern.matcher(name3).matches());
    }
}
