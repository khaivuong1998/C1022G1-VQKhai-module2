package ss2_array_va_loop.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu gồm: 1.Print the rectangle " +
                "2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right) " +
                "3.Print isosceles triangle " +
                "4.Exit");
        System.out.println("Bạn muốn chọn mục nào? ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number == 1) {
            System.out.println("Nhập chiều dài: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập chiều rộng: ");
            int b = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < a; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else if (number == 2) {
            System.out.println("Nhập chiều cao: ");
            int h = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < h; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < h; i++) {
                for (int j = h; j > i; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < h; i++) {
                for (int j = h; j > i; j--) {
                    System.out.print("  ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
                for (int j = h; j > i; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else if (number == 3) {
            System.out.println("Nhập chiều cao");
            int h = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < h; i++) {
                for (int j = h - 1; j >= i; j--) {
                    System.out.print("  ");
                }
                for (int j = 0; j <= i * 2; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else if (number == 4) {
            System.out.println("Thoát");
        } else {
            System.out.println("Bạn đã chọn sai mục, mời nhập lại");
        }
    }
}
