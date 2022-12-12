package ss7_abstraction.bai_tap_2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[2];
        shapeArray[0] = new Square("red", true, 6.6);
        shapeArray[1] = new Circle("black", false, 5.8);
        System.out.println(Arrays.toString(shapeArray));
        for (int i = 0; i < shapeArray.length; i++) {
            if (shapeArray[i] instanceof Square) {
                Square square = (Square) shapeArray[i];
                System.out.println("Diện tích hình vuông: " + square.getArea());
                if (square.isFilled() == true) {
                    square.howToColor();
                }
            } else {
                Circle circle = (Circle) shapeArray[i];
                System.out.println("Diện tích hình tròn: " + circle.getArea());
            }
        }
    }
}
