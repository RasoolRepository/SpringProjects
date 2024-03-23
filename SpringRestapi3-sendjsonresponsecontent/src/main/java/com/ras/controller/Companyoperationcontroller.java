package com.ras.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ras.model.Company;
import com.ras.model.Employee;

@RestController
@RequestMapping("/company/api")
public class Companyoperationcontroller {
	/*
	@GetMapping("/get")
	public ResponseEntity<Company> showcompanysdetails(){
		
		Company company=new Company("hcl","hyd",100,5000000.0,"IT");
		return new ResponseEntity<Company>(company,HttpStatus.OK);
		
	}
	@GetMapping("/get")
	public Company showcompanysdetails(){
		
		Company company=new Company("hcl","hyd",100,5000000.0,"IT");
		return company;
		
	}*/
	@GetMapping("/get")
	public ResponseEntity<Employee> showcompanysdetails(){
		
		Company company=new Company("hcl","hyd",100,5000000.0,"IT");
		Employee emp=new Employee("101", 
				                  "rasool", 
				                   new String[] {"red","pink","black"},
				                   List.of("nayab","rasool"), 
				                   Set.of(3272495L,74128470L),    
				                   Map.of("adharno",67838L,"panno",327507L), false,LocalDateTime.of(2001,12, 13,16, 57),company);
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
		
	}
	

}
