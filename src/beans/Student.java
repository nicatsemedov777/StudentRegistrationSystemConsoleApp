package beans;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String surname;
    private String className;
    private int age;


    public Student() {
    }

    public Student(String name, String surname, String className, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
