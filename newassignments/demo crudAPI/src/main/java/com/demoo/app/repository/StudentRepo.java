package com.demoo.app.repository;



import com.demoo.app.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student,Integer> {
    Optional<Student> findByName(String name);
}
