package com.mylab021.service.impl;

import com.mylab021.dao.StudentDao;
import com.mylab021.pojo.Student;
import com.mylab021.service.StudentService;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
    @Override
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    @Override
    public Student getStudent(Integer id) {
        return studentDao.getStudent(id);
    }
}
