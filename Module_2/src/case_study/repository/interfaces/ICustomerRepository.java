package case_study.repository.interfaces;

import case_study.models.Customer;

public interface ICustomerRepository extends IRepository {
    Customer findCustomerIsCode(String customerIsCode);
    void edit(Customer customer);
}
