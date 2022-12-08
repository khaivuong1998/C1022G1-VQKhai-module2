package ss5_accessmodifier_staticmethod_staticproperty.bai_tap_2;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();
//        Student.setCity("Quảng Nam");
        System.out.println(student1);
        student.setName("nghĩa");
        student.setClasses("c10");
        System.out.println(student);
    }
}
