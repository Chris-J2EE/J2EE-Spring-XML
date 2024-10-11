package com.mylab021.pojo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class School implements Serializable {
    private Integer id;
    private List<Classes> classes;

    public void School() {

    }

    public School(Integer id, List<Classes> classes) {
        this.id = id;
        this.classes = classes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Classes> getClasses() {
        return classes;
    }

    public void setClasses(List<Classes> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", classes=" + classes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof School)) return false;
        School school = (School) o;
        return Objects.equals(getId(), school.getId()) &&
                Objects.equals(getClasses(), school.getClasses());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getClasses());
    }
}
