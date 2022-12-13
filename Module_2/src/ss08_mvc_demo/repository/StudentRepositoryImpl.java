package ss08_mvc_demo.repository;

import ss08_mvc_demo.model.Student;

public class StudentRepositoryImpl implements IStudentRepository {
    private static Student[] studentList;
    private static int size = 0;

    static {
        studentList = new Student[10];
        studentList[0] = new Student(1, "Nguyen Van A");
        studentList[1] = new Student(2, "Nguyen Van B");
        studentList[2] = new Student(3, "Nguyen Van C");
        studentList[3] = new Student(4, "Nguyen Van D");
        size = 4;
    }

    @Override
    public Student[] findAll() {
        Student[] students = new Student[size];
        for (int i = 0; i < size; i++) {
            students[i] = studentList[i];
        }
        return students;
    }

    @Override
    public void addStudent(Student student) {
        /*Kiem tra size..*/

        /*Thêm*/
        studentList[size] = student;
        size++;
    }
}
