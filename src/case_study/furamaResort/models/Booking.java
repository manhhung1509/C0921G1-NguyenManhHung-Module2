package case_study.furamaResort.models;
import java.util.Date;
import java.util.Objects;

public class Booking implements Comparable<Booking>{
    private String bookingCode;
    private String startDay;
    private String endDay;
    private String customerCode;
    private String serviceName;
    private String serviceCode;

    public Booking(){
    }

    public Booking(String bookingCode, String startDay, String endDay, String customerCode, String serviceName,
                   String serviceCode) {
        this.bookingCode = bookingCode;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customerCode = customerCode;
        this.serviceName = serviceName;
        this.serviceCode = serviceCode;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceCode;
    }

    public void setServiceType(String serviceType) {
        this.serviceCode = serviceType;
    }

    @Override
    public String toString() {
        return bookingCode + "," + startDay + "," + endDay + "," + customerCode + "," + serviceName + "," + serviceCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Booking)) return false;
        Booking booking = (Booking) o;
        return Objects.equals(bookingCode, booking.bookingCode) &&
                Objects.equals(startDay, booking.startDay) &&
                Objects.equals(endDay, booking.endDay) &&
                Objects.equals(customerCode, booking.customerCode) &&
                Objects.equals(serviceName, booking.serviceName) &&
                Objects.equals(serviceCode, booking.serviceCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingCode, startDay, endDay, customerCode, serviceName, serviceCode);
    }

    @Override
    public int compareTo(Booking o) {
        Date dateStart1 = new Date(startDay);
        Date dateStart2 = new Date(o.startDay);
        Date dateEnd1 = new Date(endDay);
        Date dateEnd2 = new Date(o.endDay);

        if (dateStart1.compareTo(dateStart2) == 0){
            return dateEnd1.compareTo(dateEnd2);
        }
        return dateStart1.compareTo(dateStart2) ;
    }
}
