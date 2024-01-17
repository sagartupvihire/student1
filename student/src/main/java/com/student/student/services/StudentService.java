package com.student.student.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.student.entity.studentEntity;
import com.student.student.repo.studentRepo;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private studentRepo studentRepository;

    public List<studentEntity> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<studentEntity> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public studentEntity createStudent(studentEntity student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    // public studentEntity updateStudent(Long id, studentEntity updatedStudent) {
    //     if (studentRepository.existsById(id)) {
    //         updatedStudent.setId(id);
    //         return studentRepository.save(updatedStudent);
    //     } else {
    //         // Handle not found scenario
    //         return null;
    //     }
    // }
}
