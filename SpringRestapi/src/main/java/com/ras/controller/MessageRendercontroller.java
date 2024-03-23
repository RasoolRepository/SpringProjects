package com.ras.controller;

import java.time.LocalDateTime;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")//global path
public class MessageRendercontroller {
	@GetMapping("/wish")//method path
	public ResponseEntity<String> showmessage(){
		//get system date and time
		LocalDateTime ldt=LocalDateTime.now();
		int hour=ldt.getHour();
		String msg=null;
		
		if(hour<12)
			msg="GoodMorning";
		else if(hour<16)
			msg="Good Afternoon";
		else if(hour<20)
			msg="Good Evening";
		else
			msg="Good Night";
		//create and response entity object having response content and status code
		ResponseEntity<String> response=new ResponseEntity<String>(msg,HttpStatus.OK);
		return response;
		
		
		}

}
