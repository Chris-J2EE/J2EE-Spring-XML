package com.mylab021.dao;


import com.mylab021.pojo.Student;

public class StudentDao {
    Students students = new Students();

    public void addStudent(Student student) {
        students.addStudent(student);
    }

    public Student getStudent(Student student) {
        return students.getStudent(student);
    }

    public Student getStudent(Integer id) {
        return students.getStudent(id);
    }


}
