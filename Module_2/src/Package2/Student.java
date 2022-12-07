package Package2;

import Package1.Persion;

public class Student extends Persion {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Tâm";
        System.out.println(student.getName());
    }
}
