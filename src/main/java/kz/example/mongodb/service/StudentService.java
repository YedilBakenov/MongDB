package kz.example.mongodb.service;

import kz.example.mongodb.model.Student;
import kz.example.mongodb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public Student getStudentById(String id) {
      return   studentRepository.findById(id).orElse(null);
    }
}
