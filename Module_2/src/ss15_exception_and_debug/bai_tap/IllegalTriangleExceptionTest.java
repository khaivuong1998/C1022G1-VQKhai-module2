package ss15_exception_and_debug.bai_tap;

import java.util.Scanner;

public class IllegalTriangleExceptionTest {
    public static void checkIllegalTriangleException(int a, int b, int c) {
        try {
            if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && c + a > b) {
                System.out.println(a + ", " + b + ", " + c + " là 3 cạnh của tam giác");
            } else {
                throw new IllegalTriangleException();
            }
        } catch (IllegalTriangleException e) {
            System.out.println(a + ", " + b + ", " + c + " không phải 3 cạnh của tam giác");
        } finally {
            System.out.println("kết thúc chương trình");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Inout b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Input c: ");
        int c = Integer.parseInt(scanner.nextLine());
        checkIllegalTriangleException(a, b, c);
    }
}
