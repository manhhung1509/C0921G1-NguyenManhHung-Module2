package bai_12_java_collection_framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String args[]) {
        // init hashMap
        Map<String, Student> hashMap = new HashMap<String, Student>();
        // add elements to hashMap
        hashMap.put("1", new Student("A", 12, "Hanoi"));
        hashMap.put(null, new Student("C", 13, "Hanoi"));
        hashMap.put("2", null);
        hashMap.put("4", new Student("D", 14, "Hanoi"));
        // show hashMap
        show(hashMap);
    }

    public static void show(Map<String, Student> map) {
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
