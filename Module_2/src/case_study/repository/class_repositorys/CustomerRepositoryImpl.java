package case_study.repository.class_repositorys;

import case_study.models.Customer;
import case_study.read_writer_file.ReadWriterFileCustomer;
import case_study.repository.interfaces.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {
    static List<Customer> customerList = new ArrayList<>();
//    static Customer customer1 = new Customer("Trần Văn Quang", "28-10-1993", "nam", "925014760", "058449955", "uuwuuwvvn185@.com", "054", "Member", "15 tran phu");
//    static Customer customer2 = new Customer("Trần Văn Thắng", "14-7-2001", "nam", "325014710", "051985266", "svjhvua@.com", "021", "Silver", "954 phạm thoại");
//    static Customer customer3 = new Customer("Trần Văn Đăng", "7-8-2002", "nam", "620320415", "0548415962", "vbjkvsv25@.com", "017", "Diamond", "34 hoàng diệu");
//    static Customer customer4 = new Customer("Trần Thị Ngọc", "12-3-1977", "nữ", "102458795", "025487496", "wuvhuwv@.com", "003", "Gold", "98 duong van an");
//    static Customer customer5 = new Customer("Nguyễn Trần Ánh Hoàng", "6-5-1998", "nữ", "410023588", "039587485", "wvug@.com", "08", "Platinium", "158 tran dinh nghe");
//
//    static {
//        customerList.add(customer1);
//        customerList.add(customer2);
//        customerList.add(customer3);
//        customerList.add(customer4);
//        customerList.add(customer5);
//    }

    @Override
    public void display() {
        List<Customer> customerList1 = ReadWriterFileCustomer.readCustomerCSV();
        for (int i = 0; i < customerList1.size(); i++) {
            System.out.println(customerList1.get(i));
        }
    }

    @Override
    public void add(Object object) {
        customerList.add((Customer) object);
        ReadWriterFileCustomer.writerCustomer1CSV(customerList);
        customerList.clear();
    }

    @Override
    public Customer findCustomerIsCode(String customerIsCode) {
        List<Customer> customerList1 = ReadWriterFileCustomer.readCustomerCSV();
        for (Customer customer : customerList1) {
            if (customerIsCode.equals(customer.getCustomerIsCode())) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void edit(Customer customer) {
        List<Customer> customerList1 = ReadWriterFileCustomer.readCustomerCSV();
        for (int i = 0; i < customerList1.size(); i++) {
            if (customerList1.get(i).getCustomerIsCode().equals(customer.getCustomerIsCode())) {
                customerList1.set(i, customer);
                break;
            }
        }
        ReadWriterFileCustomer.writerCustomer2CSV(customerList1);
    }
}
