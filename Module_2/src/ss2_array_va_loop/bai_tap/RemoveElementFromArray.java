package ss2_array_va_loop.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng:");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];
//        System.out.println(Arrays.toString(arr));
//        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ [" + i + "]:");
            int value = Integer.parseInt(scanner.nextLine());
            arr[i] = value;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập phần tử muốn xóa");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                arr[i] = 0;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
