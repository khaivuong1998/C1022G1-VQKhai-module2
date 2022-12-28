package case_study.controllers;

import case_study.services.FacilityServiceImpl;
import case_study.services.IFacilityService;

import java.util.Scanner;

public class FacilityManagement {
    public void controllerImpl(){
        Scanner scanner = new Scanner(System.in);
        IFacilityService facilityService = new FacilityServiceImpl();
        int count = 0;
        do {
            System.out.println("----Facility Management----\n" +
                    "1.Display list facility\n" +
                    "2.Add new facility\n" +
                    "3.Return main menu");
            System.out.println("Nhập mục muốn chọn:");
            count = Integer.parseInt(scanner.nextLine());
//            if (count = 1) {
//
//            }
        } while (count != 3);
    }
}
