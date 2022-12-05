package ss2_array_va_loop.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElementInATwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng của mảng 2 chiều:");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột của mảng 2 chều:");
        int column = Integer.parseInt(scanner.nextLine());
        int[][] arr2Chieu = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Nhập phần tử thứ " + (j + 1) + " của mảng " + (i + 1));
                int value = Integer.parseInt(scanner.nextLine());
                arr2Chieu[i][j] = value;
            }
        }
        System.out.println(Arrays.deepToString(arr2Chieu));
        int max = arr2Chieu[0][0];
        for (int i = 0; i < arr2Chieu.length; i++) {
            for (int j = 0; j < arr2Chieu[i].length; j++) {
                if (max < arr2Chieu[i][j]) {
                    max = arr2Chieu[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng 2 chiều: " + max);
    }
}
