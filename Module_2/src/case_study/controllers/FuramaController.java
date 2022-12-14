package case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        System.out.println("------Menu Furama------");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
    }

    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement();
        CustomerManagement customerManagement = new CustomerManagement();
        FacilityManagement facilityManagement = new FacilityManagement();
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            displayMainMenu();
            try {
                select = Integer.parseInt(scanner.nextLine());
                switch (select) {
                    case 1:
                        employeeManagement.controllerImpl();
                        break;
                    case 2:
                        customerManagement.controllerImpl();
                        break;
                    case 3:
                        facilityManagement.controllerImpl();
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.err.println("Hãy nhập số từ 1 - 6 để chọn");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Mời nhập số để sử dụng dịch vụ");
            }
        } while (true);
    }
}
