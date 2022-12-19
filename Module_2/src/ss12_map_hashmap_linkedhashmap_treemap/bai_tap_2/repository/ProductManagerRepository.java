package ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.repository;

import ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.model.Product;
import ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.service.ProductManagerService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManagerRepository implements IProductManagerRepository {
    List<Product> myProduct = new ArrayList<>();
    Product product1 = new Product(1, "Exciter", 50000000);
    Product product2 = new Product(2, "Sirius", 20000000);
    Product product3 = new Product(3, "Jupiter", 22000000);
    Product product4 = new Product(4, "Air Blade", 43000000);
    {
        myProduct.add(product1);
        myProduct.add(product2);
        myProduct.add(product3);
        myProduct.add(product4);
    }

    @Override
    public void menu() {
        System.out.println("Chọn thư mục bạn muốn sử dụng: \n" +
                "1.Thêm sản phẩm: \n" +
                "2.Xóa sản phẩm: \n" +
                "3.Sửa sản phẩm: \n" +
                "4.Tìm kiếm sản phẩm: \n" +
                "5.Hiển thị sản phẩm: \n" +
                "6.Sắp xếp sản phẩm: \n" +
                "7.Thoát lựa chon:");
    }

    @Override
    public void display() {
        for (int i = 0; i < myProduct.size(); i++) {
            System.out.println(myProduct.get(i));
        }
    }

    @Override
    public void more(Product product) {
        myProduct.add(product);
    }

    @Override
    public void search(String name) {
        for (int i = 0; i < myProduct.size(); i++) {
            if (myProduct.get(i).getName().equals(name)){
                System.out.println(myProduct.get(i));
            }
        }
    }

    @Override
    public void remove(int id) {
//        myProduct.remove(index);
        for (int i = 0; i < myProduct.size(); i++) {
            if (id == myProduct.get(i).getId()) {
                myProduct.remove(myProduct.get(i));
            }
        }
    }

    @Override
    public void fix(int id, Product product) {
//        myProduct.set(index, product);
        for (int i = 0; i < myProduct.size(); i++) {
            if (id == myProduct.get(i).getId()) {
                myProduct.set(myProduct.indexOf(myProduct.get(i)), product);
            }
        }
    }

    @Override
    public void sort() {
        Collections.sort(myProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
    }
}
