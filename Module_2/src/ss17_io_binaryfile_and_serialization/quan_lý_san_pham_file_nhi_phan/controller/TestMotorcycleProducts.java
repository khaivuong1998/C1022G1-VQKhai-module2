package ss17_io_binaryfile_and_serialization.quan_lý_san_pham_file_nhi_phan.controller;

import ss17_io_binaryfile_and_serialization.quan_lý_san_pham_file_nhi_phan.model.MotorcycleProducts;
import ss17_io_binaryfile_and_serialization.quan_lý_san_pham_file_nhi_phan.service.MotorcycleProductsService;

import java.util.Scanner;

public class TestMotorcycleProducts {
    public static void main(String[] args) {
        MotorcycleProductsService motorcycleProductsService = new MotorcycleProductsService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-----Menu Motorcycle-----\n" +
                    "1.Thêm sản phẩm:\n" +
                    "2.Hiển thị sản phẩm:\n" +
                    "3.Tìm kiếm sản phẩm:\n" +
                    "4.Thoát:");
            int count = Integer.parseInt(scanner.nextLine());
            switch (count) {
                case 1:
                    System.out.println("Nhập id:");
                    int id1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập tên:");
                    String name1 = scanner.nextLine();
                    System.out.println("Nhập hãng:");
                    String manufacturer1 = scanner.nextLine();
                    System.out.println("Nhập giá:");
                    int price1 = Integer.parseInt(scanner.nextLine());
                    MotorcycleProducts motorcycleProducts1 = new MotorcycleProducts(id1, name1, manufacturer1, price1);
                    motorcycleProductsService.add(motorcycleProducts1);
                    break;
                case 2:
                    motorcycleProductsService.display();
                    break;
                case 3:
                    System.out.println("Nhập tên sản phẩm muốn tìm kiếm:");
                    String name2 = scanner.nextLine();
                    motorcycleProductsService.search(name2);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
