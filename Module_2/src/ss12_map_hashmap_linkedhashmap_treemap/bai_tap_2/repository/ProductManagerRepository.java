package ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.repository;

import ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.model.Product;
import ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.service.ProductManagerService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManagerRepository implements IProductManagerRepository {
    static List<Product> myProduct = new ArrayList<>();
    static Product product1 = new Product(1, "Exciter", 50000000);
    static Product product2 = new Product(2, "Sirius", 20000000);
    static Product product3 = new Product(3, "Jupiter", 22000000);
    static Product product4 = new Product(4, "Air Blade", 43000000);

    static {
        myProduct.add(product1);
        myProduct.add(product2);
        myProduct.add(product3);
        myProduct.add(product4);
    }

    @Override
    public void menu() {
        System.out.println("------Chọn thư mục bạn muốn sử dụng------ \n" +
                "1.Thêm sản phẩm: \n" +
                "2.Xóa sản phẩm: \n" +
                "3.Sửa sản phẩm: \n" +
                "4.Tìm kiếm sản phẩm: \n" +
                "5.Hiển thị sản phẩm: \n" +
                "6.Sắp xếp sản phẩm theo id: \n" +
                "7.Sắp xếp sản phẩm theo giá: \n" +
                "8.Thoát lựa chon:");
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
            if (myProduct.get(i).getName().contains(name)) {
                System.out.println(myProduct.get(i));
            }
        }
    }

    @Override
    public void remove(int id) {
        for (int i = 0; i < myProduct.size(); i++) {
            if (id == myProduct.get(i).getId()) {
                myProduct.remove(myProduct.get(i));
                break;
            }
        }
    }

    @Override
    public Product findById(int id) {
        for (Product c : myProduct) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void fix( Product product) {
        for (int i = 0; i < myProduct.size(); i++) {
            if (myProduct.get(i).getId() == product.getId()) {
                myProduct.set(i, product);
                break;
            }
        }
    }

    @Override
    public void sortPrice() {
        Collections.sort(myProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
    }
    public void sortId() {
        Collections.sort(myProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getId() - o2.getId();
            }
        });
    }
}
