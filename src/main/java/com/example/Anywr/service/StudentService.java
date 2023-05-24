package com.example.Anywr.service;

import com.example.Anywr.model.Student;
import com.example.Anywr.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(String className, String teacherFullName, int page, int size) {
        if (className != null && teacherFullName != null) {
            return studentRepository.findByClassNameAndTeacherFullName(className, teacherFullName, PageRequest.of(page, size));
        } else if (className != null) {
            return studentRepository.findByClassName(className, PageRequest.of(page, size));
        } else if (teacherFullName != null) {
            return studentRepository.findByTeacherFullName(teacherFullName, PageRequest.of(page, size));
        } else {
            return studentRepository.findAll(PageRequest.of(page, size)).getContent();
        }
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student student) {
        student.setId(id);
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
