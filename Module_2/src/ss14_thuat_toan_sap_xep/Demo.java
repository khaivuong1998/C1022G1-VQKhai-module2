package ss14_thuat_toan_sap_xep;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
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
        int[] arr = {4, 8, 11, 43, 6, 2, 98, 45};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
