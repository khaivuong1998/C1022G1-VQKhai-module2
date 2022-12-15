package ss11_generic_stack_queue.bai_tap_1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ElementIntegerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        Stack<Integer> arrStack = new Stack<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
            arrStack.push(arr[i]);
        }
        System.out.println(arrStack);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrStack.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}
