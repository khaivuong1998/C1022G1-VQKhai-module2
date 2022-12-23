package ss17_io_binaryfile_and_serialization.quan_lý_san_pham_file_nhi_phan.service;

import ss17_io_binaryfile_and_serialization.quan_lý_san_pham_file_nhi_phan.model.MotorcycleProducts;

public interface IMotorcycleProductsService {
    void add(MotorcycleProducts motorcycleProducts);
    void display();
    void search(String name);
}
