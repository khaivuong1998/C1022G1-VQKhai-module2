package ss3_method.bai_tap;

import java.util.Scanner;

public class CountOccurrencesCharactersString {
    public static int countOccurrences(char character, String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi ký tự bất kỳ:");
        String str = scanner.nextLine();
        System.out.println("Nhập ký tự bất kỳ:");
        char character = scanner.nextLine().charAt(0);
        if (countOccurrences(character, str) > 0) {
            System.out.println("Ký tự " + character + " xuất hiện " + countOccurrences(character, str) + " lần trong chuỗi");
        } else {
            System.out.println("ký tự " + character + " không có trong chuỗi");
        }
    }
}
