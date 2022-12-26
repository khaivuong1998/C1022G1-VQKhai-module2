package ss18_string_regex.demo_regex;

public class MyRegex {
    private static final String REGEX_ID = "^[0-9]{9}$";
    public static void main(String[] args) {
        System.out.println("bhsdquja".matches(MyRegex.REGEX_ID));
    }
}
