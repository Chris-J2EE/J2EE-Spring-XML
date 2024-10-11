package com.mylab021.service;

import com.mylab021.pojo.Student;

public interface StudentService {
    public void addStudent(Student student);

    public Student getStudent(Integer id);
}
