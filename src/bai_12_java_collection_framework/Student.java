package bai_12_java_collection_framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//public class Test {
////        public static void Employee(String[] args) {
////        HashMap<String, Integer> customers = new HashMap<>();
////        customers.put("John", 30);
////        customers.put("Mike", 28);
////        customers.put("Bill", 32);
////        customers.put("Maria", 27);
//////        Set<String> keys = customers.keySet();
////        for (String key: customers.keySet()){
////            System.out.println("Key: " + key + ": " + customers.get(key));
////        }
////            for (int value: customers.values()) {
////                System.out.println(value);
////            }
////    }
////    public static void Employee(String args[]) {
////        // khoi tao hashMap
////        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
////        // them cac phan tu vao hashMap
////        hashMap.put(1, "Java");
////        hashMap.put(3, "C++");
////        hashMap.put(2, "PHP");
////        hashMap.put(4, "Python");
////        // hien thi HashMap
////        System.out.println(hashMap);
////    }
//}

public class Student{
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ExampleIsIncorrect@name=" + name + ",age=" + age + ",address=" + address;
    }
}