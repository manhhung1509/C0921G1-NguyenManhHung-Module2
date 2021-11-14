package stack_va_Queue.demo_comparable_va_comparator;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"chanh7" ,45));
        studentList.add(new Student(2,"chanh4" ,23));
        studentList.add(new Student(3,"chanh6" ,18));
        studentList.add(new Student(4,"chanh1" ,23));
        studentList.add(new Student(5,"chanh3" ,23));

        // sắp xếp đối tượng trong list thì 2 cách
        // Cach1: dùng comparable  => implement interface Comparable(Java)
        // ghi đè phương compaTo() (trong class đối tượng cần so sánh;
        // Cách 2 : dùng commparator
        // trước khi sắp xếp
//        System.out.println("trước kh sắp xếp");
//        for (Student student: studentList) {
//            System.out.println(student);
//        }
//        Collections.sort(studentList);
//        // sau khi sắp xếp
//        System.out.println("sau khi sắp xếp");
//        for (Student student: studentList) {
//            System.out.println(student);
//        }
        // Cách 2 : dùng commparator => viết class riêng implement interface
        // comprator và ghi đè phương thức compare()

        // trước khi sắp xếp
        System.out.println("trước kh sắp xếp");
        for (Student student: studentList) {
            System.out.println(student);
        }
        Collections.sort(studentList,new CompaByName());
        // sau khi sắp xếp
        System.out.println("sau khi sắp xếp theo tên");
        for (Student student: studentList) {
            System.out.println(student);
        }
        Collections.sort(studentList,new CompaAge());
        System.out.println("sau khi sắp xếp theo tuổi");
        for (Student student: studentList) {
            System.out.println(student);
        }
    }
}

