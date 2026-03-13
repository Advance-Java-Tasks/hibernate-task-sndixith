package com.ty;


import com.ty.dao.StudentDAO;
import com.ty.entity.Student;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentDAOTest {

    private StudentDAO studentDAO;

    @BeforeEach
    void setUp() {
        studentDAO = new StudentDAO();
    }

    @Test
    void testSaveStudent() {

        Student student = new Student(1, "John", "john@test.com", 22);

        studentDAO.saveStudent(student);

        Student result = studentDAO.getStudentById(1);

        assertNotNull(result);
        assertEquals("John", result.getName());
    }

    @Test
    void testGetStudentById() {

        Student student = new Student(2, "Alice", "alice@test.com", 23);

        studentDAO.saveStudent(student);

        Student result = studentDAO.getStudentById(2);

        assertEquals("Alice", result.getName());
    }

    @Test
    void testGetAllStudents() {

        studentDAO.saveStudent(new Student(3, "Bob", "bob@test.com", 21));
        studentDAO.saveStudent(new Student(4, "Tom", "tom@test.com", 24));

        List<Student> students = studentDAO.getAllStudents();

        assertTrue(students.size() >= 2);
    }

}
