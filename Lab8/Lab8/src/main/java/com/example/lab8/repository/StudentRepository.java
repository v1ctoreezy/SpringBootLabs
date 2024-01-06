package com.example.lab8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.lab8.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
