package ss18_string_regex.demo_string;

public class MyString {
    public static void main(String[] args) {
        int a = 5;
//        String str = "abc"; //kieu nguyen thuy
//        String str1 = new String("abc"); //kieu doi tuong

//        String str1 = "abc";
//        String str2 = "abc";
//        System.out.println(str1 == str2); //true

//        String str1 = new String("abc");
//        String str2 = new String("abc");
//
//        System.out.println(str1 == str2); //false

//        String str1 = "abc";
//        String str2 = str1;
//        str2 = str2 + "def";
//        System.out.println(str1);
//        System.out.println(str2);

//        String str1 = new String("abc");
//        String str2 = str1;
//        str2 = str2 + "def";
//        System.out.println(str1);
//        System.out.println(str2);

//        String str1 = "abc";
//        str1 = str1.concat("def");
//        System.out.println(str1);
//        System.out.println(str1.indexOf("c"));

        StringBuilder str1 = new StringBuilder("abc");
        StringBuilder str2 = str1;
        str2 = str2.append("def");
        System.out.println(str1);
        System.out.println(str2);

        StringBuilder str3 = new StringBuilder("r");
    }
}
