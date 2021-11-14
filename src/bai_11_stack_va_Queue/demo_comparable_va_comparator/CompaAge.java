package stack_va_Queue.demo_comparable_va_comparator;

import java.util.Comparator;

public class CompaAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age-o2.age;
    }
}
