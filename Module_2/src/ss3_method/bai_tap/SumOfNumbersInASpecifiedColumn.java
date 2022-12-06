package ss3_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfNumbersInASpecifiedColumn {
    public static int sum(int number, int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr[number].length; i++) {
            count += arr[number][i];
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng của mảng 2 chiều:");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột của mảng 2 chiều:");
        int column = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Nhập phần tử thứ " + (j + 1) + " của mảng " + (i + 1));
                int value = Integer.parseInt(scanner.nextLine());
                arr[i][j] = value;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Nhập số cột muốn tính:");
        int number = Integer.parseInt(scanner.nextLine());
        if (number >= 0 && number < arr.length) {
            System.out.println("Tổng các số trong cột " + number + ": " + sum(number, arr));
        }
    }
}
