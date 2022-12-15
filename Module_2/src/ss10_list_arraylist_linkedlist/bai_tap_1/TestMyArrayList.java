package ss10_list_arraylist_linkedlist.bai_tap_1;

public class TestMyArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Jack");
        Student student2 = new Student(2, "David");
        Student student3 = new Student(3, "Tu");
        Student student4 = new Student(4, "Nghia");
        Student student5 = new Student(5, "My");
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(student1);
        studentMyArrayList.add(student2);
        studentMyArrayList.add(student3);
        studentMyArrayList.add(student4);
//        studentMyArrayList.add(student5, 3);
//        studentMyArrayList.clear();
        System.out.println(studentMyArrayList.size());
        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student student = (Student) studentMyArrayList.elements[i];
            System.out.print(student.getId() + " ");
            System.out.print(student.getName() + " ");
        }
        System.out.println();
//        System.out.println(studentMyArrayList.get(4).getName());
        System.out.println(studentMyArrayList.contains(student2));
        newMyArrayList = studentMyArrayList.clone();
        Student student = newMyArrayList.remove(3);
        System.out.println(student.getName());
        for (int i = 0; i < newMyArrayList.size(); i++) {
            System.out.println(newMyArrayList.get(i).getName());
        }
        System.out.println(studentMyArrayList.size());
    }
}
