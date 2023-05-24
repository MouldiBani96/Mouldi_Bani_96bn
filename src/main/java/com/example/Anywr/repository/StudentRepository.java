package com.example.Anywr.repository;

import com.example.Anywr.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByClassNameAndTeacherFullName(String className, String teacherFullName, Pageable pageable);

    List<Student> findByClassName(String className, Pageable pageable);

    List<Student> findByTeacherFullName(String teacherFullName, Pageable pageable);

    Page<Student> findAll(Pageable pageable);
}
