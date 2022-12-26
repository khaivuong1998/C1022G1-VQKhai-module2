package ss18_string_regex.bai_tap_ten_lop;

import java.util.Scanner;

public class ValidateNameClass {
    private static final String REGEX_CLASSNAME = "^[CAP]\\d{4}[GHIKLM]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập tên lớp: ");
        String str = scanner.nextLine();
        if (str.matches(ValidateNameClass.REGEX_CLASSNAME)) {
            System.out.println("Đúng tên lớp");
        } else {
            System.out.println("Sai tên lớp");
        }
    }
}