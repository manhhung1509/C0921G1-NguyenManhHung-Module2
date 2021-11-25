package bai_19_string_va_regex.thuc_hanh.validate_email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {

    public boolean validate(String regex) {
        final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
