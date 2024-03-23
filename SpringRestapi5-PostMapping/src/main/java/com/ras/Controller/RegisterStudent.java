package com.ras.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ras.model.Student;

@RestController
@RequestMapping("/register")
public class RegisterStudent {
	
	@PostMapping("/insert")
	public ResponseEntity<Student> registerdetails(@RequestBody Student stud ){
		System.out.println("RegisterStudent.registerdetails()");
		System.out.println("student detrails"+stud);
		
		return new ResponseEntity<Student>(stud, HttpStatus.CREATED);
		
	}

}
