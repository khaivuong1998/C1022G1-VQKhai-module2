package ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.service;

import ss12_map_hashmap_linkedhashmap_treemap.bai_tap_2.model.Product;

public interface IProductManagerService {
    void menu();
    void display();
    void more(Product product);
    void search(String name);
    void remove(int index);
    void fix(int index, Product product);
    void sort();
}
