package case_study.furamaResort.models;

public class Contract {
    private int contractNumber;
    private String bookingCode;
    private int depositNumber;
    private int totalPayment;
    private String customerCode;

    public Contract() {
    }

    public Contract(int contractNumber, String bookingCode, int depositNumber, int totalPayment, String customerCode) {
        this.contractNumber = contractNumber;
        this.bookingCode = bookingCode;
        this.depositNumber = depositNumber;
        this.totalPayment = totalPayment;
        this.customerCode = customerCode;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public int getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(int depositNumber) {
        this.depositNumber = depositNumber;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber=" + contractNumber +
                ", bookingCode='" + bookingCode + '\'' +
                ", depositNumber=" + depositNumber +
                ", totalPayment=" + totalPayment +
                ", customerCode='" + customerCode + '\'' +
                '}';
    }
}
