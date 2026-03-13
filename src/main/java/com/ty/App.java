package com.ty;

import com.ty.dao.StudentDAO;
import com.ty.entity.Student;

public class App {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        Student s = new Student(1, "John", "john@test.com", 22);

        dao.saveStudent(s);

        System.out.println("Student saved successfully");

    }
}