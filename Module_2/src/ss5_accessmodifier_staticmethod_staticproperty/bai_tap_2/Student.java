package ss5_accessmodifier_staticmethod_staticproperty.bai_tap_2;

public class Student {
    private String name;
    private String classes;
    private static String city = "Đà Nẵng";

    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        Student.city = city;
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public Student() {
        this("John", "C02");
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
