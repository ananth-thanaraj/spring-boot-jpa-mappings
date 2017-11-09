package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.data.StudentRepository;
import com.jpa.model.Student;

@RestController
@RequestMapping("/students")
public class StudentController {

	private StudentRepository stuRepo;
	
	
	public StudentController(StudentRepository stuRepo) {
		this.stuRepo=stuRepo;
	}
	
	@PostMapping("/student")
	ResponseEntity<?> addStudent(@RequestBody Student student){
		stuRepo.save(student);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping("/student")
	ResponseEntity<List> getStudents(){
		List stu = stuRepo.findAll();
		return new ResponseEntity<>(stu, HttpStatus.OK);
	}
}
