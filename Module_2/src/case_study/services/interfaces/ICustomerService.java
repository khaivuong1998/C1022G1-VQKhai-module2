package case_study.services.interfaces;

import case_study.models.Customer;

public interface ICustomerService extends IService {
    Customer findCustomerIsCode(String customerIsCode);
    void edit(Customer customer);
}
