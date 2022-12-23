package ss17_io_binaryfile_and_serialization.quan_lý_san_pham_file_nhi_phan.service;

import ss17_io_binaryfile_and_serialization.quan_lý_san_pham_file_nhi_phan.model.MotorcycleProducts;
import ss17_io_binaryfile_and_serialization.quan_lý_san_pham_file_nhi_phan.repository.IMotorcycleProductsRepository;
import ss17_io_binaryfile_and_serialization.quan_lý_san_pham_file_nhi_phan.repository.MotorcycleProductsRepository;

public class MotorcycleProductsService implements IMotorcycleProductsService {
    public IMotorcycleProductsRepository repository = new MotorcycleProductsRepository();

    @Override
    public void add(MotorcycleProducts motorcycleProducts) {
        repository.add(motorcycleProducts);
    }

    @Override
    public void display() {
        repository.display();
    }

    @Override
    public void search(String name) {
        repository.search(name);
    }
}
