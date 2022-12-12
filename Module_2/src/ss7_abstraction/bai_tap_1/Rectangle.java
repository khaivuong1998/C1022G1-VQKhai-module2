package ss7_abstraction.bai_tap_1;

public class Rectangle extends Shape implements IResizeable {
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return this.width * this.length;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "color=" + super.getColor() +
                ", filler=" + super.isFilled() +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public void resize(double percent) {
        System.out.println((this.width + percent) * (this.length + percent));
    }
}
