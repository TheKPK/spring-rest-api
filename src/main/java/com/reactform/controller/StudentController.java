package com.reactform.controller;

import com.reactform.model.Student;
import com.reactform.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class StudentController {
    @Autowired
    private StudentService studentService;

    //post method for db
    @PostMapping("/add")
    private String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "student is been added";
    }

    //    get method
    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
