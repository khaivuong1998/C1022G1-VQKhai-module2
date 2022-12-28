package ss18_string_regex;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String str = "abcdefbceb";
        List<String> stringList = new ArrayList<>();
        String[] str1 = str.split("");
        for (int i = 0; i < str1.length; i++) {
            int count = 0;
            for (int j = 0; j < str1.length; j++) {
                if (str1[i] == (str1[j])) {
                    count++;
                }
            }
            if (count == 2){
                if (!stringList.contains(str1[i])){
                    stringList.add(str1[i]);
                }
            }
        }
        System.out.println(stringList);
    }
}
