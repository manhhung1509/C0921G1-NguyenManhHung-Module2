package stack_va_Queue.bai_tap.to_chuc_du_lieu_hop_ly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employee = new ArrayList<>();
        ArrayList<Employee> employeeOutput = new ArrayList<>();
        Queue<Employee> nam = new LinkedList<>();
        Queue<Employee> nu = new LinkedList<>();

        {
            employee.add(new Employee(1, "hùng", "nam", "15/09/2000"));
            employee.add(new Employee(2, "hoàng", "nam", "11/09/2000"));
            employee.add(new Employee(3, "ánh", "nữ", "16/9/2002"));
            employee.add(new Employee(4, "hằng", "nữ", "02/2/2001"));
            employee.add(new Employee(5, "thành", "nam", "28/7/1992"));
            employee.add(new Employee(6, "nhung", "nữ", "29/4/2010"));
        }
        Collections.sort(employee);

        for (Employee element : employee) {
            if (element.getGender().equals("nữ")) {
                nu.add(element);
            } else {
                nam.add(element);
            }
        }

        while (!nu.isEmpty()) {
            employeeOutput.add(nu.poll());
        }
        while (!nam.isEmpty()) {
            employeeOutput.add(nam.poll());
        }
        System.out.println("dis");
        for (Employee e : employeeOutput) {
            System.out.println(e);
        }
    }
}
