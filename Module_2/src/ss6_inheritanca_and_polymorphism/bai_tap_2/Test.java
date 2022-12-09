package ss6_inheritanca_and_polymorphism.bai_tap_2;

public class Test {
    public static void main(String[] args) {
        Point2D point2D1 = new Point2D(5.7f, 12.4f);
        Point3D point3D1 = new Point3D(point2D1.getX(), point2D1.getY(), 7.3f);
        System.out.println(point2D1);
        System.out.println(point3D1);
    }
}
