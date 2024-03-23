package com.ras.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ras.model.Company;


@RestController
@RequestMapping("/company")
public class Companyoperationcontroller {

	@GetMapping("/get")
	public ResponseEntity<Company> showcompanysdetails(){
		
		Company company=new Company("hcl","hyd",100,5000000.0,"IT");
		return new ResponseEntity<Company>(company,HttpStatus.PARTIAL_CONTENT);
		
	}
	

}
