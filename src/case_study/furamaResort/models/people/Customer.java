package case_study.furamaResort.models.people;

public class Customer extends Person {
    private String typeCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String typeCustomer, String address) {
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public Customer(String code, String name, String birthDay, String gender, String id, String phoneNumber,
                    String email, String typeCustomer, String address) {
        super(code, name, birthDay, gender, id, phoneNumber, email);
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return code + "," + name + "," + birthDay + "," + gender + "," + id + "," + phoneNumber + "," + email + "," + typeCustomer + "," + address;
    }
}
