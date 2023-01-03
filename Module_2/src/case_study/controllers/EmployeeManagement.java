package case_study.controllers;

import case_study.models.Employee;
import case_study.services.class_services.EmployeeServiceImpl;
import case_study.services.interfaces.IEmployeeService;

import java.util.Scanner;

public class EmployeeManagement {
    public void controllerImpl() {
        Scanner scanner = new Scanner(System.in);
        IEmployeeService employeeService = new EmployeeServiceImpl();
        int count = 0;
        do {
            System.out.println("----Employee Management----\n" +
                    "1.Display list employees\n" +
                    "2.Add new employee\n" +
                    "3.Delete employee\n" +
                    "4.Edit employee\n" +
                    "5.Return main menu");
            System.out.println("Nhập mục muốn chọn: ");
            try {
                count = Integer.parseInt(scanner.nextLine());
                switch (count) {
                    case 1:
                        employeeService.display();
                        break;
                    case 2:
                        System.out.println("nhập thông tin nhân viên cần thêm:");
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
                        System.out.println("nhập mã nhân viên:");
                        String employeeCode2 = scanner.nextLine();
                        System.out.println("nhập trình độ:");
                        String level2 = scanner.nextLine();
                        System.out.println("nhập vị trí:");
                        String position2 = scanner.nextLine();
                        System.out.println("nhập lương:");
                        String wage2 = scanner.nextLine();
                        Employee employee2 = new Employee(name2, dayOfBirth2, sex2, idNumber2, phoneNumber2, email2, employeeCode2, level2, position2, wage2);
                        employeeService.add(employee2);
                        break;
                    case 3:
                        System.out.println("Nhập mã nhân viên muốn xóa:");
                        String employeeCode3 = scanner.nextLine();
                        employeeService.remove(employeeCode3);
                        break;
                    case 4:
                        System.out.println("Nhập mã nhân viên muốn sửa:");
                        String employeeCode4 = scanner.nextLine();
                        Employee employee4 = employeeService.findEmployeeCode(employeeCode4);
                        if (employee4 != null) {
                            System.out.println("nhập tên:");
                            String name4 = scanner.nextLine();
                            System.out.println("nhập ngày sinh:");
                            String dayOfBirth4 = scanner.nextLine();
                            System.out.println("nhập giới tính:");
                            String sex4 = scanner.nextLine();
                            System.out.println("nhập số CMND:");
                            String idNumber4 = scanner.nextLine();
                            System.out.println("nhập SDT:");
                            String phoneNumber4 = scanner.nextLine();
                            System.out.println("nhập email:");
                            String email4 = scanner.nextLine();
                            System.out.println("nhập trình độ:");
                            String level4 = scanner.nextLine();
                            System.out.println("nhập vị trí:");
                            String position4 = scanner.nextLine();
                            System.out.println("nhập lương:");
                            String wage4 = scanner.nextLine();
                            employee4.setName(name4);
                            employee4.setDateOfBith(dayOfBirth4);
                            employee4.setSex(sex4);
                            employee4.setIdNumber(idNumber4);
                            employee4.setPhoneNumber(phoneNumber4);
                            employee4.setEmail(email4);
                            employee4.setLevel(level4);
                            employee4.setPosition(position4);
                            employee4.setWage(wage4);
                            employeeService.edit(employee4);
                        } else {
                            System.out.println("Mã nhân viên không hợp lệ");
                        }
                        break;
                    case 5:
                        return;
                    default:
                        System.err.println("Hãy nhập số từ 1 - 5 để chọn");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Mời nhập số để lựa chọn dịch vụ");
            }
        } while (true);
    }
}
