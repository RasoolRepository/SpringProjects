package com.ras.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee/api")
public class EmployeeoperationController {
	@GetMapping("/empall")
	public ResponseEntity<String> getallemployees(){
		System.out.println("EmployeeoperationController.getallemployees()");
		
		return new ResponseEntity<String>("GetMapping--fetching all employees",HttpStatus.OK);
		
	}
	@PostMapping("/save")
	public ResponseEntity<String> registeremployee(){
		System.out.println("EmployeeoperationController.registeremployee()");
		return new ResponseEntity<String>("PostMapping--save the  employee",HttpStatus.OK);
		
	}
	@PutMapping("/update")
	public ResponseEntity<String> updateemployee(){
		System.out.println("EmployeeoperationController.updateemployee()");
		return new ResponseEntity<String>("PutMapping--update  the  employee",HttpStatus.OK);
		
	}
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteemployee(){
		System.out.println("EmployeeoperationController.deleteemployee()");
		return new ResponseEntity<String>("DeleteMapping--delete  the  employee",HttpStatus.OK);
		
	}


}
