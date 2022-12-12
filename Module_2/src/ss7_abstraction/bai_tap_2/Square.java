package ss7_abstraction.bai_tap_2;

public class Square extends Shape implements IColorable {
    private double width;

    public Square() {
    }

    public Square(double width) {
        this.width = width;
    }

    public Square(String color, boolean filled, double width) {
        super(color, filled);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color=" + super.getColor() +
                ", filled=" + super.isFilled() +
                ", width=" + width +
                '}';
    }
    public double getArea() {
        return this.width * this.width;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
