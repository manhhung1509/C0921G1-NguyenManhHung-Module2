package bai_17_io_binary_serialization.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    static final String PATH_FILE = "C:\\newcodegym\\C0921G1-NguyenManhHung-Module2\\src\\bai_17_io_binary_serialization\\bai_tap\\product_list.csv";
    File file = new File(PATH_FILE);
    public List<Product> readFile() {
        List<Product> productList = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            if (fileInputStream.available() != 0) {
                objectInputStream = new ObjectInputStream(fileInputStream);
                productList = (List<Product>) objectInputStream.readObject();
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productList;
    }

    public void writeFile(List<Product> productList) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                if (objectOutputStream != null){
                    objectOutputStream.close();
                }
                if (fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
