package ss4_class_va_object.bai_tap_1;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập giá trị b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập giá trị c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.setA(a);
        quadraticEquation.setB(b);
        quadraticEquation.setC(c);
        System.out.println(quadraticEquation.getDelta());
        if (quadraticEquation.getDelta() > 0) {
            System.out.println("Phuơng trình có 2 nghiệm phân biệt: ");
            System.out.println("X1 = " + quadraticEquation.getR1());
            System.out.println("X2 = " + quadraticEquation.getR2());
        } else if (quadraticEquation.getDelta() == 0) {
            System.out.println("Phương trình có nghiệm kép: X1 = X2 = " + quadraticEquation.getR1R2());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
