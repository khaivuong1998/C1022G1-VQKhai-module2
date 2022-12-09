package ss6_inheritanca_and_polymorphism.bai_tap_1;

public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.6, "red");
        Cylinder cylinder1 = new Cylinder(circle1.getRadius(), circle1.getColor(), 7.8);
//        Circle circle2 = new Circle();
        System.out.println(circle1);
        System.out.println(cylinder1);
//        System.out.println(circle2);
        System.out.println(circle1.getArea());
        System.out.println(cylinder1.getVolume());
    }
}
