package module_2.ss1_introduction_java;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị USD");
        int uSD = Integer.parseInt(scanner.nextLine());
        int vND = uSD * 23000;
        System.out.println(uSD + "USD có tỉ giá bằng " + vND + "VND");
    }
}
