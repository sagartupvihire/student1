package com.student.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.student.student.entity.studentEntity;
import com.student.student.services.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<studentEntity> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Optional<studentEntity> getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/create")
    public studentEntity createStudent(@RequestBody studentEntity student) {
        System.out.println("Received student data: " + student);
        return studentService.createStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }

    // @PostMapping("/{id}")
    // public studentEntity updateStudent(@PathVariable Long id, @RequestBody studentEntity updatedStudent) {
    //     return studentService.updateStudent(id, updatedStudent);
    // }
}
