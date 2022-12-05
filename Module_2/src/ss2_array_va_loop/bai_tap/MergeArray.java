package ss2_array_va_loop.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng 1");
        int length1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập độ dài mảng 2");
        int length2 = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[length1];
        int[] arr2 = new int[length2];
        for (int i = 0; i < length1; i++) {
            System.out.println("Nhập phần tử thứ " + i + " của mảng 1");
            int value = Integer.parseInt(scanner.nextLine());
            arr1[i] = value;
        }
        for (int i = 0; i < length2; i++) {
            System.out.println("Nhập phần tử thứ " + i + " của mảng 2");
            int value = Integer.parseInt(scanner.nextLine());
            arr2[i] = value;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int length3 = length1 + length2;
        int[] arr3 = new int[length3];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[length1 + i] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
