package bai_19_string_va_regex.thuc_hanh.validate_account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {

    public boolean validate(String regex) {
        final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
