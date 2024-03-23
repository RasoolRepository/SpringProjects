package com.ras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ras.model.Employee;
import com.ras.service.IEmployeeservice;

@Controller("controller")
public class playrollsystemcontroller {
	
	
	public playrollsystemcontroller() {
		System.out.println("controller 0-param, constructor::");
	}

	@Autowired
	private IEmployeeservice empservice;
	
	public List<Employee> showemployeedetails(String desg1,String desg2,String desg3) throws Exception{
		return empservice.getempbydesg(desg1, desg2, desg3);
	}

}
