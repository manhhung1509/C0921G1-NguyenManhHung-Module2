package bai_12_java_collection_framework.bai_tap.arraylist_linkedlist;

import org.jetbrains.annotations.NotNull;

public class Product {
    private int id;
    private String productName;
    private String madeIn;
    private String Quality;
    private int price;

    public Product() {
    }

    public Product(int id, String productName, String madeIn, String quality, int price) {
        this.id = id;
        this.productName = productName;
        this.madeIn = madeIn;
        Quality = quality;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public String getQuality() {
        return Quality;
    }

    public void setQuality(String quality) {
        Quality = quality;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", Quality='" + Quality + '\'' +
                ", price=" + price +
                '}';
    }

}
