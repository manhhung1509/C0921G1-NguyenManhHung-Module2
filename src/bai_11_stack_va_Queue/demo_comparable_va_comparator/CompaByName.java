package stack_va_Queue.demo_comparable_va_comparator;

import java.util.Comparator;

public class CompaByName  implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
