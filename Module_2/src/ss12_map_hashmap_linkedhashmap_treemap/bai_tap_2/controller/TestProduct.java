package ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.controller;

import ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.model.Product;
import ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.service.ProductManagerService;

import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        ProductManagerService productManagerService = new ProductManagerService();
        Scanner scanner = new Scanner(System.in);
        int count;
        do {
            productManagerService.menu();
            count = Integer.parseInt(scanner.nextLine());
            switch (count) {
                case 1:
                    System.out.println("Sản phẩm bạn muốn thêm");
                    System.out.println("Id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Tên sản phẩm: ");
                    String nameProduct = scanner.nextLine();
                    System.out.println("Giá tiền: ");
                    int price = Integer.parseInt(scanner.nextLine());
                    Product product = new Product(id, nameProduct, price);
                    productManagerService.more(product);
                    break;
            }
        }
    }
}
