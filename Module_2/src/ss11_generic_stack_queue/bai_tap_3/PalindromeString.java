package ss11_generic_stack_queue.bai_tap_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> arrStack = new Stack<>();
        Queue<String> arrQueue = new LinkedList<>();
        System.out.println("Nhập chuỗi ngẫu nhiên: ");
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            arrStack.push(str.charAt(i) + "");
            arrQueue.offer(str.charAt(i) + "");
        }
        boolean check = true;
        for (int i = 0; i < str.length(); i++) {
            String char1 = arrStack.pop();
            String char2 = arrQueue.poll();
            if (!char1.equals(char2)) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Chuỗi " + str + " là chuỗi palindrome");
        } else {
            System.out.println("Chuỗi " + str + " không phải palindrome");
        }
    }
}
