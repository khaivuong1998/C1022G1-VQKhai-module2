package ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.controller;

import ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.model.Product;
import ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.service.IProductManagerService;
import ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.service.ProductManagerService;

import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        IProductManagerService productManagerService = new ProductManagerService();
        Scanner scanner = new Scanner(System.in);
        do {
            productManagerService.menu();
            int count = Integer.parseInt(scanner.nextLine());
            switch (count) {
                case 1:
                    System.out.println("Nhập sản phẩm muốn thêm");
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
                    System.out.println("Nhập id sản phẩm cần xóa: ");
                    int index2 = Integer.parseInt(scanner.nextLine());
                    productManagerService.remove(index2);
                    break;
                case 3:
                    System.out.println("Nhập id muốn đổi: ");
                    int id3 = Integer.parseInt(scanner.nextLine());
                    Product produc3 = productManagerService.findById(id3);
                    if (produc3 != null) {
                        System.out.println("Nhập tên sản phẩm: ");
                        String name3 = scanner.nextLine();
                        System.out.println("Nhập giá tiền: ");
                        int price3 = Integer.parseInt(scanner.nextLine());
                        produc3.setName(name3);
                        produc3.setPrice(price3);
                        productManagerService.fix(produc3);
                    } else {
                        System.out.println("Id không đúng");
                    }
                    break;
                case 4:
                    System.out.println("Nhập sản phẩm muốn tìm kiếm: ");
                    System.out.println("Tên sản phẩm: ");
                    String name4 = scanner.nextLine();
                    productManagerService.search(name4);
                    break;
                case 5:
                    productManagerService.display();
                    break;
                case 6:
                    productManagerService.sortPrice();
                    break;
                case 7:
                    productManagerService.sortId();
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
