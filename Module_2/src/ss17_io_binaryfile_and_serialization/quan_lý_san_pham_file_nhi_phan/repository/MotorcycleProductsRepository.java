package ss17_io_binaryfile_and_serialization.quan_lý_san_pham_file_nhi_phan.repository;

import ss17_io_binaryfile_and_serialization.quan_lý_san_pham_file_nhi_phan.model.MotorcycleProducts;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MotorcycleProductsRepository implements IMotorcycleProductsRepository {

    public static final String FILE_PATH = "D:\\codegym\\C1022G1-VQKhai-module2\\Module_2\\src\\ss17_io_binaryfile_and_serialization\\quan_lý_san_pham_file_nhi_phan\\MotorcycleProducts.dat";

    public static void writeObjectList(List<MotorcycleProducts> motorcycleProductsList) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(FILE_PATH);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(motorcycleProductsList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static List<MotorcycleProducts> readObjectList() {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(FILE_PATH);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            objectInputStream = new ObjectInputStream(fileInputStream);
            List<MotorcycleProducts> motorcycleProductsList = (List<MotorcycleProducts>) objectInputStream.readObject();
            return motorcycleProductsList;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static List<MotorcycleProducts> myProduct = new ArrayList<>();
    static MotorcycleProducts motorcycleProducts1 = new MotorcycleProducts(1, "sirius", "yamaha", 21000000);
    static MotorcycleProducts motorcycleProducts2 = new MotorcycleProducts(2, "AB", "honda", 43000000);
    static MotorcycleProducts motorcycleProducts3 = new MotorcycleProducts(3, "winner", "honda", 50000000);
    static MotorcycleProducts motorcycleProducts4 = new MotorcycleProducts(4, "suxibo", "suzuki", 75000000);

    static {
        myProduct.add(motorcycleProducts1);
        myProduct.add(motorcycleProducts2);
        myProduct.add(motorcycleProducts3);
        myProduct.add(motorcycleProducts4);
        writeObjectList(myProduct);
    }


    @Override
    public void add(MotorcycleProducts motorcycleProducts) {
        List<MotorcycleProducts> motorcycleProductsList = readObjectList();
        motorcycleProductsList.add(motorcycleProducts);
        writeObjectList(motorcycleProductsList);
    }

    @Override
    public void display() {
        List<MotorcycleProducts> motorcycleProductsList = readObjectList();
        for (int i = 0; i < motorcycleProductsList.size(); i++) {
            System.out.println(motorcycleProductsList.get(i));
        }
        writeObjectList(motorcycleProductsList);
    }

    @Override
    public void search(String name) {
        List<MotorcycleProducts> motorcycleProductsList = readObjectList();
        for (int i = 0; i < myProduct.size(); i++) {
            if (myProduct.get(i).getName().contains(name)) {
                System.out.println(myProduct.get(i));
            }
        }
        writeObjectList(motorcycleProductsList);
    }
}
