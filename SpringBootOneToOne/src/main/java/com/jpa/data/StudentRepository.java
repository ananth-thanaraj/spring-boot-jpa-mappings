package com.jpa.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
