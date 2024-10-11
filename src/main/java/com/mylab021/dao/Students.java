package com.mylab021.dao;

import com.mylab021.pojo.Student;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Students implements Serializable {
    private List<Student> studentList = new ArrayList<>();

    public void Students() {

    }

    public void Students(List<Student> students) {
        this.studentList = students;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public Student getStudent(Student student) {
        Student result = new Student();
        for (Student item : studentList) {
            if (item == student) {
                result = item;
                break;
            }
        }
        return result;
    }

    public Student getStudent(Integer id) {
        Student result = new Student();
        for (Student item : studentList) {
            if (item.getId() == id) {
                result = item;
                break;
            }
        }
        return result;
    }
}
