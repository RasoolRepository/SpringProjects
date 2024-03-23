package com.ras.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ras.model.Student;

@Controller
public class Studentoperationcontroller {
	
	@GetMapping("/")
	public String showhomepage() {
		
		return"welcome";
		
	}
	@GetMapping("/student")
	public String showstudentformpage(@ModelAttribute("stud")Student st) {
		System.out.println("model class object::"+st);
		//return lvn
		
		return"student_form";
	}
	@PostMapping("/student")
	public String processstudentForm(@ModelAttribute("stud")Student st,Map<String,Object> map) {
	    System.out.println("model class object data"+st);
	    String result=null;
	    //write b.logic
	    if(st.getAvg()<35)
	    	result="fail";
	    else
	    	result="pass";
	    //keep the result in model attribute
	    map.put("resultdata", result);
	    //return logical view (lvn)
		return"show_result";
		
	}
	

}
