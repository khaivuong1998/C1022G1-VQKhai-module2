package ss6_inheritanca_and_polymorphism.demo_casting;

public class KieuNguyenThuy {
    public static void main(String[] args) {
//        int a = 5;
//        double b = a; // ép kiểu ngầm định
//        System.out.println(b);
        double a = 5.9;
        int b = (int) a; // ép kiểu tường minh
        System.out.println(b);
    }
}
