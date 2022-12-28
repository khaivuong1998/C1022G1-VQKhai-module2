package case_study.services;

import case_study.models.Customer;
import case_study.repository.CustomerRepositoryImpl;
import case_study.repository.ICustomerRepository;

public class CustomerServiceImpl implements ICustomerService{
    public ICustomerRepository repository2 = new CustomerRepositoryImpl();
    @Override
    public void display() {
        repository2.display();
    }

    @Override
    public void add(Object object) {
        repository2.add(object);
    }

    @Override
    public Customer findCustomerIsCode(String customerIsCode) {
        return repository2.findCustomerIsCode(customerIsCode);
    }

    @Override
    public void edit(Customer customer) {
        repository2.edit(customer);
    }
}
