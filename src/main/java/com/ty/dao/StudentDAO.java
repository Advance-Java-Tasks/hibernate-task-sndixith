package com.ty.dao;

import java.util.List;

import com.ty.entity.Student;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class StudentDAO {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("student-unit");

	public void saveStudent(Student student) {

		//fill the code

	}

	public Student getStudentById(int id) {

		//fill the code


		return null;
	}

	public List<Student> getAllStudents() {

		//fill the code

		return null;
	}
}
