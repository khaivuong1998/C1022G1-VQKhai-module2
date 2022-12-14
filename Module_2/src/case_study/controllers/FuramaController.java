package case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("------Menu Furama------");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Customer Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            select = Integer.parseInt(scanner.nextLine());
        } while (true);
    }
}
