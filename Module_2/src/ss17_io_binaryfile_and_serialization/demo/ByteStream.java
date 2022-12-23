package ss17_io_binaryfile_and_serialization.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ByteStream {

    public static final String FILE_PATH = "D:\\codegym\\C1022G1-VQKhai-module2\\Module_2\\src\\ss17_io_binaryfile_and_serialization\\demo\\student.dat";

    public static void writeObject(Student student) throws IOException {
//        File file = new File(FILE_PATH);
//        System.out.println(file.exists());
//        System.out.println(file.length());
        FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
    }
    public static Student readObject() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(FILE_PATH);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student = (Student) objectInputStream.readObject();
        return student;
    }
    public static void writeObjectList(List<Student> studentList) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(studentList);
        objectOutputStream.close();
    }
    public static List<Student> readObjectList() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(FILE_PATH);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Student> studentList = (List<Student>) objectInputStream.readObject();
        return studentList;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student1 = new Student(1, "quoc");
        Student student2 = new Student(2, "dong");
        Student student3 = new Student(3, "khai");
//        writeObject(student1);
//        System.out.println(readObject());
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        writeObjectList(studentList);
        List<Student> students = readObjectList();
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
//        for (Student student : students){
//            System.out.println(student);
//        }
    }
}
