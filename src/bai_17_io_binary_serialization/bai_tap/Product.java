package bai_17_io_binary_serialization.bai_tap;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String manufacturer;
    private int price;
    private String anotherDescriptions;

    public Product() {
    }

    public Product(int id, String name, String manufacturer, int price, String anotherDescriptions) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.anotherDescriptions = anotherDescriptions;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAnotherDescriptions() {
        return anotherDescriptions;
    }

    public void setAnotherDescriptions(String anotherDescriptions) {
        this.anotherDescriptions = anotherDescriptions;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + manufacturer + "," + price + "," + anotherDescriptions;
    }
}
