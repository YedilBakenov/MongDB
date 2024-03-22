package kz.example.mongodb.controller;


import kz.example.mongodb.model.Student;
import kz.example.mongodb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/students")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping(value = "/{id}")
    public Student getStudentById(@PathVariable String id){
        return studentService.getStudentById(id);
    }

}
