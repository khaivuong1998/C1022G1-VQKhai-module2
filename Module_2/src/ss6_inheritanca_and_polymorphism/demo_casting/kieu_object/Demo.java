package ss6_inheritanca_and_polymorphism.demo_casting.kieu_object;

public class Demo {
    public static void main(String[] args) {
        Persion persion = new Student("Dao");
        Student student = new Student("Anh");
        System.out.println(persion.getName());
        System.out.println(student.getName());
//        persion = student; // Upcasting
        student = (Student) persion; // Down casting
        System.out.println(persion.getName());
        System.out.println(student.getName());
    }
}
