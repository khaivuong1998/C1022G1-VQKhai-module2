package ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.controller;

import ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.model.Product;
import ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.service.ProductManagerService;

import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        ProductManagerService productManagerService = new ProductManagerService();
        Scanner scanner = new Scanner(System.in);
        do {
            productManagerService.menu();
            int count = Integer.parseInt(scanner.nextLine());
            switch (count) {
                case 1:
                    System.out.println("Sản phẩm muốn thêm");
                    System.out.println("Id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.println("Giá tiền: ");
                    int price = Integer.parseInt(scanner.nextLine());
                    Product product = new Product(id, name, price);
                    productManagerService.more(product);
                    break;
                case 2:
                    System.out.println("Nhập sản phẩm cần xóa: ");
                    int index2 = Integer.parseInt(scanner.nextLine());
                    productManagerService.remove(index2);
                case 3:
                    System.out.println("Nhập sản phẩm muốn đổi: ");
                    System.out.println("Id: ");
                    int id3 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Tên sản phẩm: ");
                    String name3 = scanner.nextLine();
                    System.out.println("Giá tiền: ");
                    int price3 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Vị trí muốn đổi: ");
                    int index3 = Integer.parseInt(scanner.nextLine());
                    Product product3 = new Product(id3, name3, price3);
                    productManagerService.fix(index3, product3);
                    break;
                case 4:
                    System.out.println("Nhập sản phẩm muốn tìm kiếm: ");
                    System.out.println("Tên sản phẩm: ");
                    String product4 = scanner.nextLine();
                    productManagerService.search(product4);
                    break;
                case 5:
                    productManagerService.display();
                    break;
                case 6:
                    productManagerService.sort();
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
