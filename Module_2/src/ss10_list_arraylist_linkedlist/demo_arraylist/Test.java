//package ss10_danh_sach_stack_va_queue.demo_arraylist;
//
//import ss10_danh_sach_stack_va_queue.bai_tap_1.MyArrayList;
//import ss10_danh_sach_stack_va_queue.bai_tap_1.TestMyArrayList;
//
//import java.util.ArrayList;
//
//public class Test {
//    public static class Student {
//        private int id;
//        private String name;
//
//        public Student() {
//        }
//
//        public Student(int id, String name) {
//            this.id = id;
//            this.name = name;
//        }
//
//        public int getId() {
//            return id;
//        }
//
//        public void setId(int id) {
//            this.id = id;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//    }
//
//    public static void main(String[] args) {
//        TestMyArrayList.Student student1 = new TestMyArrayList.Student(1, "Jack");
//        TestMyArrayList.Student student2 = new TestMyArrayList.Student(2, "David");
//        TestMyArrayList.Student student3 = new TestMyArrayList.Student(3, "Tu");
//        TestMyArrayList.Student student4 = new TestMyArrayList.Student(4, "Nghia");
//        TestMyArrayList.Student student5 = new TestMyArrayList.Student(5, "My");
//        ArrayList<TestMyArrayList.Student> studentMyArrayList = new ArrayList<>();
//        ArrayList<TestMyArrayList.Student> newMyArrayList = new ArrayList<>();
//        studentMyArrayList.add(student1);
//        studentMyArrayList.add(student2);
//        studentMyArrayList.add(student3);
//        studentMyArrayList.add(student4);
////        studentMyArrayList.add(student5, 3);
////        studentMyArrayList.clear();
//        System.out.println(studentMyArrayList.size());
//        for (int i = 0; i < studentMyArrayList.size(); i++) {
//            TestMyArrayList.Student student = (TestMyArrayList.Student) studentMyArrayList.elements[i];
//            System.out.print(student.getId() + " ");
//            System.out.print(student.getName() + " ");
//        }
//        System.out.println();
////        System.out.println(studentMyArrayList.get(4).getName());
//        System.out.println(studentMyArrayList.contains(student2));
//        TestMyArrayList.Student student = newMyArrayList.remove(3);
//        System.out.println(student.getName());
//        for (int i = 0; i < newMyArrayList.size(); i++) {
//            System.out.println(newMyArrayList.get(i).getName());
//        }
//        System.out.println(studentMyArrayList.size());
//    }
//}
