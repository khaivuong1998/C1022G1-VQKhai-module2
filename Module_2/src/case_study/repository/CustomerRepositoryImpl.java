package case_study.repository;

import case_study.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {
    static List<Customer> customerList = new ArrayList<>();
    static Customer customer1 = new Customer("Trần Văn Quang", "28-10-1993", "nam", "jbvhcuk", "058449955", "uuwuuwvvn185@.com", "054", "Member", "15 tran phu");
    static Customer customer2 = new Customer("Trần Văn Thắng", "14-7-2001", "nam", "jbvhcuk", "051985266", "svjhvua@.com", "021", "Silver", "954 phạm thoại");
    static Customer customer3 = new Customer("Trần Văn Đăng", "7-8-2002", "nam", "jbvhcuk", "0548415962", "vbjkvsv25@.com", "017", "Diamond", "34 hoàng diệu");
    static Customer customer4 = new Customer("Trần Thị Ngọc", "12-3-1977", "nữ", "jbvhcuk", "025487496", "wuvhuwv@.com", "003", "Gold", "98 duong van an");
    static Customer customer5 = new Customer("Nguyễn Trần Ánh Hoàng", "6-5-1998", "nữ", "jbvhcuk", "039587485", "wvug@.com", "08", "Platinium", "158 tran dinh nghe");

    static {
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);
    }

    @Override
    public void display() {
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }
    }

    @Override
    public void add(Object object) {
        customerList.add((Customer) object);
    }

    @Override
    public Customer findCustomerIsCode(String customerIsCode) {
        for (Customer customer : customerList) {
            if (customerIsCode.equals(customer.getCustomerIsCode())) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void edit(Customer customer) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerIsCode().equals(customer.getCustomerIsCode())) {
                customerList.set(i, customer);
                break;
            }
        }
    }
}
