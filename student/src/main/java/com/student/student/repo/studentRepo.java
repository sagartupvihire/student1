package com.student.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.student.entity.studentEntity;

public interface studentRepo extends JpaRepository<studentEntity, Long> {
    // Custom queries can be added here if needed
}

