package validate;

public class validate {
    String validateEmail = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\\\.[A-Za-z0-9]+)$";
    String account = "^[_a-z0-9]{6,}$";
    String birthDay = "^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$";
    String phoneNumber = "^\\+?\\d{1,3}?[- .]?\\(?(?:\\d{2,3})\\)?[- .]?\\d\\d\\d[- .]?\\d\\d\\d\\d$";
    //diện tích phải là số lớn hơn 30
    String area = "^([3-9]\\d|[1-9]\\d{2,})$";
}
