package com.mylab021.pojo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Classes implements Serializable {
    private Integer id;
    private List<Student> studentList;

    public void Classes() {

    }

    public void Classes(Integer id, List<Student> students) {
        this.id = id;
        this.studentList = students;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", students=" + studentList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Classes)) return false;
        Classes classes = (Classes) o;
        return Objects.equals(getId(), classes.getId()) &&
                Objects.equals(getStudentList(), classes.getStudentList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getStudentList());
    }
}
