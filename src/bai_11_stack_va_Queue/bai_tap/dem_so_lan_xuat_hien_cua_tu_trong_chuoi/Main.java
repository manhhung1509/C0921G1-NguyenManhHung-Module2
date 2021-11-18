package bai_11_stack_va_Queue.bai_tap.dem_so_lan_xuat_hien_cua_tu_trong_chuoi;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        String string = "nguyen manh hung nguyen manh nguyen";
        Map<String, Integer> map = new TreeMap<String, Integer>();
        String[] arr = string.toLowerCase().split(" ");
        for (String element : arr) {
            if (!"".equals(element)) {
                if (map.containsKey(element)) {
                    map.put(element, map.get(element) + 1);
                } else {
                    map.put(element, 1);
                }
            }
        }
        System.out.println("Số lần xuất hiện từ trong chuỗi: ");
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
