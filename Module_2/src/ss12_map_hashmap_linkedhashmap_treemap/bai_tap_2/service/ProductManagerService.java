package ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.service;

import ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.model.Product;
import ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.repository.IProductManagerRepository;
import ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.repository.ProductManagerRepository;

public class ProductManagerService implements IProductManagerService {
    private IProductManagerRepository repository = new ProductManagerRepository();

    @Override
    public void menu() {
        repository.menu();
    }

    @Override
    public void display() {
        repository.display();
    }

    @Override
    public void more() {
        repository.more();
    }

    @Override
    public void search() {
        repository.search();
    }

    @Override
    public void remove() {
        repository.remove();
    }

    @Override
    public void fix() {
        repository.fix();
    }

    @Override
    public void sort() {
        repository.sort();
    }

    public void more(Product product) {
    }
}
