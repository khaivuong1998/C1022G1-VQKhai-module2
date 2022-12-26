package ss18_string_regex.bai_tap_sdt;

import Package1.Main;

import java.util.Scanner;

public class ValidatePhoneNumber {
    private static final String REGEX_PHONENUMBER = "^[(][0-9]{2}[)][-][(][0]\\d{9}[)]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện thoại bất kỳ");
        String str = scanner.nextLine();
        if (str.matches(ValidatePhoneNumber.REGEX_PHONENUMBER)) {
            System.out.println("Số điện thoại hợp lệ");
        } else {
            System.out.println("Số điện thoại không phù hợp");
        }
    }
}
