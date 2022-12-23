package ss17_io_binaryfile_and_serialization.demo;

import java.io.Serializable;

public class Student implements Serializable {
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ",c1022g1 name='" + name + '\'' +
                '}';
    }
    public void myClass(){
        System.out.println("dsfhgwfyqua");
    }
}
