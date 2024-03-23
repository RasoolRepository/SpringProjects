package com.ras.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ras.model.Employee;

@RestController
@RequestMapping("/employee/api")
public class EmployeeOperationController {
	
	@PostMapping("/new")
	public ResponseEntity<Employee> registeremployee(@RequestBody Employee emp){
		System.out.println("Employee details..."+emp);
		
		return new ResponseEntity<Employee>( emp,HttpStatus.OK);
	}

}
