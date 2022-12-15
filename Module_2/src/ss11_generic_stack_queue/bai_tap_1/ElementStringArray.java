package ss11_generic_stack_queue.bai_tap_1;

import java.util.Scanner;
import java.util.Stack;

public class ElementStringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi ký tự bất kỳ: ");
        String str = scanner.nextLine();
        Stack<String> wStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            wStack.push(str.charAt(i) + "");
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(wStack.pop());
        }
    }
}
