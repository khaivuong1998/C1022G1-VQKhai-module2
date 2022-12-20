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
    public Product findById(int id) {
       return repository.findById(id);
    }

    @Override
    public void fix(Product product) {
        repository.fix(product);
    }

    @Override
    public void sortPrice() {
        repository.sortPrice();
    }
    public void sortId() {
        repository.sortId();
    }
}
