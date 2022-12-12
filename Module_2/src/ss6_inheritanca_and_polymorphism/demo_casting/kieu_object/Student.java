package ss6_inheritanca_and_polymorphism.demo_casting.kieu_object;

public class Student extends Persion{
    private int point;

    public Student() {
    }

    public Student(String name) {
        super(name);
    }

    public Student(int point) {
        this.point = point;
    }

    public Student(String name, int point) {
        super(name);
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "point=" + point +
                '}';
    }
}
