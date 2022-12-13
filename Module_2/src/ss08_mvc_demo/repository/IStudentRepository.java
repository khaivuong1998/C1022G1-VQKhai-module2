package ss08_mvc_demo.repository;

import ss08_mvc_demo.model.Student;

public interface IStudentRepository {
    /*CRUD*/
    Student[] findAll();

    void addStudent(Student student);
}
