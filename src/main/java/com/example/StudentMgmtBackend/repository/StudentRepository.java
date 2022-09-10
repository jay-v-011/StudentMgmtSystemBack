package com.example.StudentMgmtBackend.repository;

import com.example.StudentMgmtBackend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
