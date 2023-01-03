package case_study.controllers;

import case_study.models.Room;
import case_study.models.Villa;
import case_study.services.class_services.FacilityServiceImpl;
import case_study.services.interfaces.IFacilityService;
import case_study.utils.Regex;

import java.util.Scanner;

import static case_study.utils.Regex.REGEX_ROOM_SERVICECODE;

public class FacilityManagement {
    public void controllerImpl() {
        Scanner scanner = new Scanner(System.in);
        IFacilityService facilityService = new FacilityServiceImpl();
        int count = 0;
        do {
            System.out.println("----Facility Management----\n" +
                    "1.Display list facility\n" +
                    "2.Add new facility\n" +
                    "3.Display list facility maintenance\n" +
                    "4.Return main menu");
            System.out.println("Nhập mục muốn chọn:");
            try {
                count = Integer.parseInt(scanner.nextLine());
                switch (count) {
                    case 1:
                        facilityService.display();
                        break;
                    case 2:
                        int number = 0;
                        do {
                            System.out.println("1.Room:\n" + "2.Villa:\n" + "3.Return Facility Management:");
                            System.out.println("Mời chọn dịch vụ phòng:");
                            try {
                                number = Integer.parseInt(scanner.nextLine());
                                if (number == 1) {
                                    System.out.println("nhập thông tin Room muốn thêm:");
                                    System.out.println("nhập tên dịch vụ(viết hoa kí tự đầu, các ký tự sau viết thường):");
                                    String serviceName1 = scanner.nextLine();
                                    do {
                                        if (!serviceName1.matches(Regex.REGEX_SERVICENAME)) {
                                            System.out.println("tên dịch vụ sai, mời nhập lại");
                                            serviceName1 = scanner.nextLine();
                                        }
                                    } while (!serviceName1.matches(Regex.REGEX_SERVICENAME));
                                    System.out.println("nhập diện tích sử dụng(số thực lớn hơn 30):");
                                    String usableArea1 = scanner.nextLine();
                                    do {
                                        if (!usableArea1.matches(Regex.REGEX_USED_AREA)) {
                                            System.out.println("diện tích sử dụng sai, mời nhập lại");
                                            usableArea1 = scanner.nextLine();
                                        }
                                    } while (!usableArea1.matches(Regex.REGEX_USED_AREA));
                                    System.out.println("nhập chi phí thuê(số dương):");
                                    String rentalCosts1 = scanner.nextLine();
                                    do {
                                        if (!rentalCosts1.matches(Regex.REGEX_RENTAL_COSTS)) {
                                            System.out.println("chi phí thuê sai, mời nhập lại");
                                            rentalCosts1 = scanner.nextLine();
                                        }
                                    } while (!rentalCosts1.matches(Regex.REGEX_RENTAL_COSTS));
                                    System.out.println("nhập số người tối đa(0<a<20):");
                                    String maximumNumberPeople1 = scanner.nextLine();
                                    do {
                                        if (!maximumNumberPeople1.matches(Regex.REGEX_MAXIMUM_NUMBER_PERSONS)) {
                                            System.out.println("số người tối đa sai, mời nhập lại");
                                            maximumNumberPeople1 = scanner.nextLine();
                                        }
                                    } while (!maximumNumberPeople1.matches(Regex.REGEX_MAXIMUM_NUMBER_PERSONS));
                                    System.out.println("nhập kiểu thuê(viết hoa kí tự đầu, các ký tự sau viết thường):");
                                    String rentalType1 = scanner.nextLine();
                                    do {
                                        if (!rentalType1.matches(Regex.REGEX_RENTAL_TYPE)) {
                                            System.out.println("kiểu thuê sai, mời nhập lại");
                                            rentalType1 = scanner.nextLine();
                                        }
                                    } while (!rentalType1.matches(Regex.REGEX_RENTAL_TYPE));
                                    System.out.println("nhập mã dịch vụ(SVRO-YYYY: Y là các số từ 0-9):");
                                    String serviceCode1 = scanner.nextLine();
                                    do {
                                        if (!serviceCode1.matches(REGEX_ROOM_SERVICECODE)) {
                                            System.out.println("mã dịch vụ sai, mời nhập lại");
                                            serviceCode1 = scanner.nextLine();
                                        }
                                    } while (!serviceCode1.matches(REGEX_ROOM_SERVICECODE));
                                    System.out.println("nhập dịch vụ miễn phí:");
                                    String freeServiceIncluded1 = scanner.nextLine();
                                    Room room1 = new Room(serviceName1, usableArea1, rentalCosts1, maximumNumberPeople1, rentalType1, serviceCode1, freeServiceIncluded1);
                                    facilityService.add(room1);
                                }
                                if (number == 2) {
                                    System.out.println("nhập thông tin Villa muốn thêm:");
                                    System.out.println("nhập tên dịch vụ(viết hoa kí tự đầu, các ký tự sau viết thường):");
                                    String serviceName2 = scanner.nextLine();
                                    do {
                                        if (!serviceName2.matches(Regex.REGEX_SERVICENAME)) {
                                            System.out.println("tên dịch vụ sai, mời nhập lại");
                                            serviceName2 = scanner.nextLine();
                                        }
                                    } while (!serviceName2.matches(Regex.REGEX_SERVICENAME));
                                    System.out.println("nhập diện tích sử dụng(số thực lớn hơn 30):");
                                    String usableArea2 = scanner.nextLine();
                                    do {
                                        if (!usableArea2.matches(Regex.REGEX_USED_AREA)) {
                                            System.out.println("diện tích sử dụng sai, mời nhập lại");
                                            usableArea2 = scanner.nextLine();
                                        }
                                    } while (!usableArea2.matches(Regex.REGEX_USED_AREA));
                                    System.out.println("nhập chi phí thuê(số dương):");
                                    String rentalCosts2 = scanner.nextLine();
                                    do {
                                        if (!rentalCosts2.matches(Regex.REGEX_RENTAL_COSTS)) {
                                            System.out.println("chi phí thuê sai, mời nhập lại");
                                            rentalCosts2 = scanner.nextLine();
                                        }
                                    } while (!rentalCosts2.matches(Regex.REGEX_RENTAL_COSTS));
                                    System.out.println("nhập số người tối đa(0<a<20):");
                                    String maximumNumberPeople2 = scanner.nextLine();
                                    do {
                                        if (!maximumNumberPeople2.matches(Regex.REGEX_MAXIMUM_NUMBER_PERSONS)) {
                                            System.out.println("số người tối đa sai, mời nhập lại");
                                            maximumNumberPeople2 = scanner.nextLine();
                                        }
                                    } while (!maximumNumberPeople2.matches(Regex.REGEX_MAXIMUM_NUMBER_PERSONS));
                                    System.out.println("nhập kiểu thuê(viết hoa kí tự đầu, các ký tự sau viết thường):");
                                    String rentalType2 = scanner.nextLine();
                                    do {
                                        if (!rentalType2.matches(Regex.REGEX_RENTAL_TYPE)) {
                                            System.out.println("kiểu thuê sai, mời nhập lại");
                                            rentalType2 = scanner.nextLine();
                                        }
                                    } while (!rentalType2.matches(Regex.REGEX_RENTAL_TYPE));
                                    System.out.println("nhập mã dịch vụ(SVVL-YYYY: Y là các số từ 0-9):");
                                    String serviceCode2 = scanner.nextLine();
                                    do {
                                        if (!serviceCode2.matches(Regex.REGEX_VILLA_SERVICECODE)) {
                                            System.out.println("mã dịch vụ sai, mời nhập lại");
                                            serviceCode2 = scanner.nextLine();
                                        }
                                    } while (!serviceCode2.matches(Regex.REGEX_VILLA_SERVICECODE));
                                    System.out.println("nhập tiêu chuẩn phòng(viết hoa kí tự đầu, các ký tự sau viết thường):");
                                    String roomStandard2 = scanner.nextLine();
                                    do {
                                        if (!roomStandard2.matches(Regex.REGEX_STANDARD_ROOM)) {
                                            System.out.println("tiêu chuẩn phòng sai, mời nhập lại");
                                            roomStandard2 = scanner.nextLine();
                                        }
                                    } while (!roomStandard2.matches(Regex.REGEX_STANDARD_ROOM));
                                    System.out.println("nhập diện tích hồ bơi(số thực lớn hơn 30):");
                                    String swimmingPoolArea2 = scanner.nextLine();
                                    do {
                                        if (!swimmingPoolArea2.matches(Regex.REGEX_SWIMMING_POOL_AREA)) {
                                            System.out.println("diện tích hồ bơi sai, mời nhập lại");
                                            swimmingPoolArea2 = scanner.nextLine();
                                        }
                                    } while (!swimmingPoolArea2.matches(Regex.REGEX_SWIMMING_POOL_AREA));
                                    System.out.println("nhập số tầng(số nguyên dương):");
                                    String numberFloors2 = scanner.nextLine();
                                    do {
                                        if (!numberFloors2.matches(Regex.REGEX_NUMBER_FLOORS)) {
                                            System.out.println("số tầng sai, mời nhập lại");
                                            numberFloors2 = scanner.nextLine();
                                        }
                                    } while (!numberFloors2.matches(Regex.REGEX_NUMBER_FLOORS));
                                    Villa villa2 = new Villa(serviceName2, usableArea2, rentalCosts2, maximumNumberPeople2, rentalType2, serviceCode2, roomStandard2, swimmingPoolArea2, numberFloors2);
                                    facilityService.add(villa2);
                                }
                            } catch (NumberFormatException e) {
                                System.err.println("Mời nhập số để lựa chọn dịch vụ");
                            }
                        } while (number != 3);
                        break;
                    case 3:
                        facilityService.displayFacilityMaintenance();
                        break;
                    default:
                        System.err.println("Hãy nhập số từ 1 - 3 để chọn");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Mời nhập số để lựa chọn dịch vụ");
            }
        } while (count != 4);
    }
}
