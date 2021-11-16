package bai_12_java_collection_framework.bai_tap.arraylist_linkedlist.compare;

import bai_12_java_collection_framework.bai_tap.arraylist_linkedlist.Product;

import java.util.Comparator;

public class IncreaseSort implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() < o2.getPrice()) {
            return -1;
        } else {
            if (o1.getPrice() == o2.getPrice()) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}
