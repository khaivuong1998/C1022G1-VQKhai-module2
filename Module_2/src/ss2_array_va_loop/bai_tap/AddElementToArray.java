package ss2_array_va_loop.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng:");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            int value = Integer.parseInt(scanner.nextLine());
            arr[i] = value;
        }
        System.out.println("Nhập phần tử X:");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vị trí muốn chèn:");
        int index = Integer.parseInt(scanner.nextLine());
        if (index < 0 || index > arr.length - 1) {
            System.out.println("Vị trí không có trong mảng");
        } else {
            int[] arr1 = new int[length + 1];
            for (int i = 0; i < length + 1; i++) {
                if (index == i) {
                    arr1[i] = number;
                } else if (index > i) {
                    arr1[i] = arr[i];
                } else {
                    arr1[i] = arr[i - 1];
                }
            }
            System.out.println(Arrays.toString(arr1));
        }
    }
}
