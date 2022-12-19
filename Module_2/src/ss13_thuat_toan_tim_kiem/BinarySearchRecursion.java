package ss13_thuat_toan_tim_kiem;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursion {
    public static int binarySearch(int[] array, int left, int right, int value) {
        int mid = (left + right) / 2;
        if (left <= right) {
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] > value) {
                return binarySearch(array, left, mid - 1, value);
            } else {
                return binarySearch(array, mid + 1, right, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            int value1 = Integer.parseInt(scanner.nextLine());
            arr[i] = value1;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập số cần tim: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Vị trí: " + binarySearch(arr, 0, arr.length - 1, number));
    }
}
