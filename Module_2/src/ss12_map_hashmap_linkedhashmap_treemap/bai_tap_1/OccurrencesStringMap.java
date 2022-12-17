package ss12_map_hashmap_linkedhashmap_treemap.bai_tap_1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class OccurrencesStringMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi bất kỳ: ");
        String str = scanner.nextLine().toLowerCase();
        Map<String, Integer> myTreeMap = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (myTreeMap.containsKey(str.charAt(i) + "")) {
                myTreeMap.put(str.charAt(i) + "", myTreeMap.get(str.charAt(i) + "") + 1);
            } else {
                myTreeMap.put(str.charAt(i) + "", 1);
            }
        }
        for (String key : myTreeMap.keySet()) {
            System.out.println(key + ": " + myTreeMap.get(key));
        }
    }
}
