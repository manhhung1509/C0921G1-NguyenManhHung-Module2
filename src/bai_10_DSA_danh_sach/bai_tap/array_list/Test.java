package bai_10_DSA_danh_sach.bai_tap.array_list;


import bai_10_DSA_danh_sach.bai_tap.array_list.MyList;

public class Test {
    static class Person {
        int age;
        String name;

        public Person() {
        }

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return " name=" + name + ", age=" + age;

        }

        @Override
        public boolean equals(Object obj) {
            return name.equals(((Person) obj).name) && age == ((Person) obj).age;
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        MyList<Person> myList = new MyList<>(1);
        myList.ensureCapacity(4);
        myList.add(new Person(18, "hậu"));
        myList.add(new Person(18, "hoàng"));
        myList.add(new Person(17, "hùng"));
        myList.add(new Person(16, "ánh"));
        myList.add(3, new Person(18, "Huyền"));
        MyList<Person> myNewList = myList.clone();
        myNewList.remove(2);
        for (int i = 0; i < myNewList.size; i++) {
            System.out.println(myNewList.get(i).toString());
        }
        int index = myNewList.indexOf(new Person(16, "thành"));
        boolean check = myNewList.contains(new Person(20, "lâm"));
        System.out.println("index " + index);
        System.out.println("check " + check);
    }
}