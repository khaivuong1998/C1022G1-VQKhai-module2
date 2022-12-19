package ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.service;

import ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.model.Product;
import ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.repository.IProductManagerRepository;
import ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.repository.ProductManagerRepository;

public class ProductManagerService implements IProductManagerService {
    public IProductManagerRepository repository = new ProductManagerRepository();

    @Override
    public void menu() {
        repository.menu();
    }

    @Override
    public void display() {
        repository.display();
    }

    @Override
    public void more(Product product) {
        repository.more(product);
    }

    @Override
    public void search(String name) {
        repository.search(name);
    }

    @Override
    public void remove(int id) {
        repository.remove(id);
    }

    @Override
    public void fix(int index, Product product) {
        repository.fix(index, product);
    }

    @Override
    public void sort() {
        repository.sort();
    }

//    @Override
//    public void menu() {
//        repository.menu();
//    }
//
//    @Override
//    public void display() {
//        repository.display();
//    }
//
//    @Override
//    public void sort() {
//        repository.sort();
//    }
//    @Override
//    public void more(Product product) {
//        repository.more(product);
//    }
//    @Override
//    public void remove(int index2) {
//        repository.remove(index2);
//    }
//    @Override
//    public void search(String product4) {
//        repository.search(product4);
//    }
//    @Override
//    public void fix(int index3, Product product3) {
//        repository.fix(index3, product3);
//    }
}
