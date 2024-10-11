package com.mylab021.dao;

import com.mylab021.pojo.Classes;
import com.mylab021.pojo.Student;

import java.util.ArrayList;
import java.util.List;

public class ClassesDao {
    private List<Student> classesList = new ArrayList<>();
    private Students studentList = new Students();
    private Classes classes = new Classes();

    public void addStudentToClasses(Student student) {
        classesList.add(student);
    }

}
