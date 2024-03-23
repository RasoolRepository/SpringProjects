package com.ras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ras.model.Actor;
import com.ras.service.IActormgmtService;

@RestController
@RequestMapping("/actor/api")   
public class ActorOperationController {
	@Autowired
	private IActormgmtService service;
	@PostMapping("/insert")
	public ResponseEntity<String> savactor(@RequestBody Actor actor){
		try {
			String msg=service.registeractor(actor);
			return new ResponseEntity<String>(msg,HttpStatus.ACCEPTED);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/get")
	public ResponseEntity<?> fetchallactors(){
		try {
			Iterable<Actor> list=service.getallactors();
			return new ResponseEntity<Iterable<Actor>>(list,HttpStatus.OK);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.OK);
			
		}
		
		
	}
	@GetMapping("/get/{id}")
	public ResponseEntity<?> fetchacorid(@PathVariable int id){
		try {
			Actor actor=service.getactorbyid(id);
			return new ResponseEntity<Actor>(actor,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@GetMapping("/get/{categori1}/{categori2}")
	public ResponseEntity<?> showactorsbycategories(@PathVariable String categori1,@PathVariable String categori2){
		
		
		try {
			List<Actor> actor=service.fetchactorsbycategory(categori1, categori2);
			return new ResponseEntity<List<Actor>>(actor,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.OK);
		}
	}
	@PutMapping("/update")
	public ResponseEntity<?> modifyactor(@RequestBody Actor actor){
		
		
		try {
			String msg=service.UpdateActor(actor);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.OK);
		}
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteactor(@PathVariable int id){
		
		
		try {
			String msg=service.deletebyid(id);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.OK);
		}
	}
}
