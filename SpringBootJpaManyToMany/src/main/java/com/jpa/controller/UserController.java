

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

import com.jpa.data.UserInterface;
import com.jpa.model.Users;

@RestController
@RequestMapping("/users")
public class UserController {

@Autowired	
private UserInterface urepo;	
	
	@PostMapping("/user")
	ResponseEntity<?> addStudent(@RequestBody Users user){
		urepo.save(user);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping("/user")
	ResponseEntity<List> getStudents(){
		List usr = urepo.findAll();
		return new ResponseEntity<>(usr, HttpStatus.OK);
	}
}
