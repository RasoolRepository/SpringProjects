package com.ras.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer/api")
public class CustomerOperationController {
	@GetMapping("/report")
	public ResponseEntity<String> showreport(@RequestParam("sno") int no,@RequestParam("sname") String name){
		
		System.out.println(no + " "+ name);
		return new ResponseEntity<String>(no+ "" +name,HttpStatus.OK);
		
	}

}
