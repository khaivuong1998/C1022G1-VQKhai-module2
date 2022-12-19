package ss13_thuat_toan_tim_kiem;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ComplexityAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi bất kỳ: ");
        String str = scanner.nextLine().toLowerCase();
        Map<String, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (treeMap.containsKey(str.charAt(i) + "")) {
                treeMap.put(str.charAt(i) + "", treeMap.get(str.charAt(i) + "") + 1);
            } else {
                treeMap.put(str.charAt(i) + "", 1);
            }
        }
        int max = -1;
        String str1 = "";
        for (String key : treeMap.keySet()) {
            if (max < treeMap.get(key)) {
                max = treeMap.get(key);
                str1 = key;
            }
        }
        System.out.println("Kí tự " + str1 + " xuất hiện nhiều nhất trong chuỗi với " + max + " lần");
    }
}
