package ss14_thuat_toan_sap_xep;

import java.util.Arrays;
import java.util.Scanner;

public class IllustrationInsertionSortAlgorithm {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int count = array[i];
            int j = i - 1;
            for (; j >= 0 && array[j] > count; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = count;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int number = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
