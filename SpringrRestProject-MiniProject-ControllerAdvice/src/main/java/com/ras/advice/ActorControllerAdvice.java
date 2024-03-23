package com.ras.advice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ras.exeption.ActornotfoundException;
import com.ras.model.Errordetails;

@ControllerAdvice
public class ActorControllerAdvice {
	
	@ExceptionHandler(ActornotfoundException.class)
	public ResponseEntity<Errordetails> handleActronotfoundexception(ActornotfoundException antef){
		System.out.println("ActorControllerAdvice.handleActronotfoundexception()");
		Errordetails details=new Errordetails(LocalDateTime.now(), "500",antef.getMessage());
		return new ResponseEntity<Errordetails>(details,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Errordetails> handleallexception(Exception e){
		System.out.println("ActorControllerAdvice.handleallexception()");
		Errordetails details=new Errordetails(LocalDateTime.now(), "500",e.getMessage());
		return new ResponseEntity<Errordetails>(details,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	

}
