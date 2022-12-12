package ss7_abstraction.bai_tap_2;

public class Circle extends Shape implements IColorable {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius +
                ", color='" + super.getColor() + '\'' +
                ", filled=" + super.isFilled() +
                '}';
    }

    @Override
    public void howToColor() {

    }
}
