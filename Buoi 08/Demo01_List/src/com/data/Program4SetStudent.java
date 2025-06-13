package com.data;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Program4SetStudent {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        Student st1 = new Student();
        st1.setId(1);
        st1.setName("Ngoc");

        Student st2 = new Student();
        st2.setId(1);
        st2.setName("Ngoc");

        students.add(st1);
        students.add(st2);

        students.forEach(student -> {
            System.out.println(student.getId());
            System.out.println(student.getName());
        });
    }
}

class Student {
    private int id;

    private String name;

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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
