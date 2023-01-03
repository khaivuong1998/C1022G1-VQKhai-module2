package case_study.controllers;

import case_study.models.Customer;
import case_study.services.class_services.CustomerServiceImpl;
import case_study.services.interfaces.ICustomerService;

import java.util.Scanner;

public class CustomerManagement {
    public void controllerImpl() {
        Scanner scanner = new Scanner(System.in);
        ICustomerService customerService = new CustomerServiceImpl();
        int count = 0;
        do {
            System.out.println("----Customer Management----\n" +
                    "1.Display list customers\n" +
                    "2.Add new customer\n" +
                    "3.Edit customer\n" +
                    "4.Return main menu");
            System.out.println("Nhập mục muốn chọn: ");
            try {
                count = Integer.parseInt(scanner.nextLine());
                switch (count) {
                    case 1:
                        customerService.display();
                        break;
                    case 2:
                        System.out.println("nhập thông tin khách hàng cần thêm:");
                        System.out.println("nhập tên:");
                        String name2 = scanner.nextLine();
                        System.out.println("nhập ngày sinh:");
                        String dayOfBirth2 = scanner.nextLine();
                        System.out.println("nhập giới tính:");
                        String sex2 = scanner.nextLine();
                        System.out.println("nhập số CMND:");
                        String idNumber2 = scanner.nextLine();
                        System.out.println("nhập SDT:");
                        String phoneNumber2 = scanner.nextLine();
                        System.out.println("nhập email:");
                        String email2 = scanner.nextLine();
                        System.out.println("nhập mã khách hàng:");
                        String customerIsCode2 = scanner.nextLine();
                        System.out.println("nhập loại khách:");
                        String typeGuest2 = scanner.nextLine();
                        System.out.println("nhập địa chỉ:");
                        String address2 = scanner.nextLine();
                        Customer customer2 = new Customer(name2, dayOfBirth2, sex2, idNumber2, phoneNumber2, email2, customerIsCode2, typeGuest2, address2);
                        customerService.add(customer2);
                        break;
                    case 3:
                        System.out.println("Nhập mã khách hàng muốn sửa:");
                        String customerIsCode3 = scanner.nextLine();
                        Customer customer3 = customerService.findCustomerIsCode(customerIsCode3);
                        if (customer3 != null) {
                            System.out.println("nhập tên:");
                            String name3 = scanner.nextLine();
                            System.out.println("nhập ngày sinh:");
                            String dayOfBirth3 = scanner.nextLine();
                            System.out.println("nhập giới tính:");
                            String sex3 = scanner.nextLine();
                            System.out.println("nhập số CMND:");
                            String idNumber3 = scanner.nextLine();
                            System.out.println("nhập SDT:");
                            String phoneNumber3 = scanner.nextLine();
                            System.out.println("nhập email:");
                            String email3 = scanner.nextLine();
                            System.out.println("nhập loại khách:");
                            String typeGuest3 = scanner.nextLine();
                            System.out.println("nhập địa chỉ:");
                            String address3 = scanner.nextLine();
                            customer3.setName(name3);
                            customer3.setDateOfBith(dayOfBirth3);
                            customer3.setSex(sex3);
                            customer3.setIdNumber(idNumber3);
                            customer3.setPhoneNumber(phoneNumber3);
                            customer3.setEmail(email3);
                            customer3.setTypeGuest(typeGuest3);
                            customer3.setAddress(address3);
                            customerService.edit(customer3);
                        } else {
                            System.out.println("Mã khách hàng không hợp lệ");
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.err.println("Hãy nhập số từ 1 - 4 để chọn");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Mời nhập số để lựa chọn dịch vụ");
            }
        } while (true);
    }
}
