package ss7_abstraction.bai_tap_1;

public class Square extends Shape {
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
    public double getArea() {
        return this.width * this.width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color=" + super.getColor() +
                ", filled=" + super.isFilled() +
                ", width=" + width +
                '}';
    }

    @Override
    public void resize(double percent) {
        System.out.println((this.width + percent) * (this.width + percent));
    }
}
