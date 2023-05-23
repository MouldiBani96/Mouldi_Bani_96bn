package com.example.Anywr.service;

import com.example.Anywr.model.Class;
import com.example.Anywr.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {

    @Autowired
    private ClassRepository classRepository;

    public List<Class> getAllClasses() {
        return classRepository.findAll();
    }

    public Class getClassById(Long id) {
        return classRepository.findById(id).orElse(null);
    }

    public Class createClass(Class cls) {
        return classRepository.save(cls);
    }

    public Class updateClass(Long id, Class cls) {
        cls.setId(id);
        return classRepository.save(cls);
    }

    public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }
}
