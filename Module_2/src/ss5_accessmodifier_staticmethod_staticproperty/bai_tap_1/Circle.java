package ss5_accessmodifier_staticmethod_staticproperty.bai_tap_1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

   public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
