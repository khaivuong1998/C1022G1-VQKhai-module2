package ss4_class_va_object.bai_tap_1;

public class QuadraticEquation {
    private double a, b, c, delta, r1, r2;

//    public QuadraticEquation(double a, double b, double c) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDelta() {
        return delta = this.b * this.b - 4 * this.a * this.c;
    }

    public double getR1() {
        return r1 = (-this.b + Math.sqrt(delta)) / 2;
    }

    public double getR2() {
        return r2 = (-this.b - Math.sqrt(delta)) / 2;
    }

    public double getR1R2() {
        return r1 = r2 = -this.b / (2 * this.a);
    }
}
