package ss7_abstraction.bai_tap_1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Shape[] shapeArrays = new Shape[3];
        shapeArrays[0] = new Square("blue", true, 6.7);
        shapeArrays[1] = new Rectangle("yellow", false, 4.6, 7);
        shapeArrays[2] = new Circle("red", false, 3.9);
        System.out.println(Arrays.toString(shapeArrays));
        System.out.println("Diện tích ban đầu: ");
        for (int i = 0; i < shapeArrays.length; i++) {
            if (shapeArrays[i] instanceof Square) {
                Square square = (Square) shapeArrays[i];
                System.out.println("Hình vuông: " + square.getArea());
            } else if (shapeArrays[i] instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shapeArrays[i];
                System.out.println("Hình chữ nhật: " + rectangle.getArea());
            } else {
                Circle circle = (Circle) shapeArrays[i];
                System.out.println("Hình tròn: " + circle.getArea());
            }
        }
        System.out.println("Diện tích sau khi tăng kích thước: ");
        shapeArrays[0].resize(Math.floor(Math.random() * 100) + 1);
        shapeArrays[1].resize(Math.floor(Math.random() * 100) + 1);
        shapeArrays[2].resize(Math.floor(Math.random() * 100) + 1);
    }
}
