package com.example.myrestspringbootapph2db.dao;

import com.example.myrestspringbootapph2db.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDAO {
    List<Student> getAllStudents();

    Student getStudent(int id);

    Student saveStudent(Student student);

    void deleteStudent(int id);
}
