package ss3_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumNumbersMainDiagonalSquareMatrix {
    public static int totalDiagonal(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài của ma trận vuông:");
        int longs = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chiều rộng của ma trận vuông:");
        int width = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[longs][width];
        if (longs == width) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.println("Nhập phần tử thứ " + (j + 1) + " của mảng " + (i + 1));
                    int value = Integer.parseInt(scanner.nextLine());
                    arr[i][j] = value;
                }
            }
            System.out.println(Arrays.deepToString(arr));
        }
        System.out.println("Tổng các số ở đường chéo chính của ma trận: " + totalDiagonal(arr));
    }
}
