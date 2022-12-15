package ss11_generic_stack_queue.bai_tap_2;

import java.util.Scanner;
import java.util.Stack;

public class DecimalBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên bất kỳ: ");
        int number = Integer.parseInt(scanner.nextLine());
        Stack<Integer> arrStack = new Stack<>();
        int count = 0;
        while (number > 0) {
            count = number % 2;
            arrStack.push(count);
            number = number / 2;
        }
        int length = arrStack.size();
        for (int i = 0; i < length; i++) {
            System.out.print(arrStack.pop());
        }
    }
}
