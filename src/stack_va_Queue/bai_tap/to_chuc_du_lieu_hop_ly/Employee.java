package stack_va_Queue.bai_tap.to_chuc_du_lieu_hop_ly;

import org.jetbrains.annotations.NotNull;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String gender;
    private String birthDay;

    public Employee() {
    }

    public Employee(int id, String name, String gender, String birthDay) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ']';
    }

    @Override
    public int compareTo(Employee o) {
        String[] birthDay1 = this.birthDay.split("/");
        String[] birthDay2 = o.birthDay.split("/");
        String date1 = "";
        String date2 = "";

        for (int i = birthDay1.length -1; i >= 0; i--) {
            date1 += birthDay1[i];
            date2 += birthDay2[i];
        }
        return date1.compareTo(date2);
    }
}
