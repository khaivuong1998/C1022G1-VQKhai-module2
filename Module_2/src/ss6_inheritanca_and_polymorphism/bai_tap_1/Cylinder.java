package ss6_inheritanca_and_polymorphism.bai_tap_1;

public class Cylinder extends Circle{
    private double heigth;

    public Cylinder() {
    }

//    public Cylinder(double radius, String color) {
//        super(radius, color);
//    }

    public Cylinder(double heigth) {
        this.heigth = heigth;
    }

    public Cylinder(double radius, String color, double heigth) {
        super(radius, color);
        this.heigth = heigth;
    }

    public double getVolume() {
        return super.getArea() * this.heigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + super.getRadius() +
                ", color='" + super.getColor() + '\'' +
                ", heigth=" + heigth +
                '}';
    }
}
