package module_2.ss1_introduction_java;

import java.util.Scanner;

public class ThucHanh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("Input name: ");
        String str = scanner.nextLine();
        System.out.println("Num: " + num);
        System.out.println("Name: " + str);
    }
}
