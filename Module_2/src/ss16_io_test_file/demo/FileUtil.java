package ss16_io_test_file.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public static final String FILE_NAME = "D:\\codegym\\C1022G1-VQKhai-module2\\Module_2\\src\\ss16_io_test_file\\demo\\student.csv";

    public static List<Student> readCSV() throws IOException {
        List<Student> studentList = new ArrayList<>();
        FileReader fileReader = new FileReader(FILE_NAME);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String temp[];
        Student student;
        while ((line = bufferedReader.readLine()) != null) {
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String name = temp[1];
            student = new Student(id, name);
            studentList.add(student);
        }
        bufferedReader.close();
        return studentList;
    }

    public static void writeCSV(Student student) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_NAME, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("\n" + student.getId() + "," + student.getName());
        bufferedWriter.close();
    }

    public static void main(String[] args) throws IOException {
//        readCSV();
//        writeCSV(new Student(6, "khoa"));
        List<Student> studentList = readCSV();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
