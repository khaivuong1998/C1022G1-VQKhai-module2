package case_study.controllers;

import case_study.services.EmployeeServiceImpl;
import case_study.services.IEmployeeService;

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
            count = Integer.parseInt(scanner.nextLine());
            switch (count){
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } while (count != 5);
    }
}
