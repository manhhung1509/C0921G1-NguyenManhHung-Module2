package stack_va_Queue.demo_comparable_va_comparator;


public class Student implements Comparable<Student> {
    int id;
    String name;
    int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
        // nếu trả về 0 thì không sắp xếp
        // nếu trả về âm<0 => giảm dần
        // nếu trả vêf dương>0 =>tăng dần
        // sắp xếp theo tuổi
//        return this.age-s.age;
        // săp xếp theo tên
//        return this.name.compareTo(s.name);
        // nếu cùng tuổi thì sắp xếp theo tên;
        if (this.age-s.age==0){
            return this.name.compareTo(s.name);
        }else {
            return this.age-s.age;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
