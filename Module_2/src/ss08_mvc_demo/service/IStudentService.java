package ss08_mvc_demo.service;

import ss08_mvc_demo.model.Student;

public interface IStudentService {
    /*CRUD*/
    Student[] findAll();

    void addStudent(Student student);

    /*Validation*/

}
