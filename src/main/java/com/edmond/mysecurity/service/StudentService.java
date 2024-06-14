package com.edmond.mysecurity.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edmond.mysecurity.entity.Student;
import com.edmond.mysecurity.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;
    public void addStudent(Student st) {
        repo.save(st);
    }
}
