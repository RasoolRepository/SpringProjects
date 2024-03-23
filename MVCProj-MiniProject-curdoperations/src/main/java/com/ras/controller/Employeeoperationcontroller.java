package com.ras.controller;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.ras.model.Employee;
import com.ras.service.IEmployeemgmtservice;

import oracle.jdbc.proxy.annotation.Post;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class Employeeoperationcontroller {
	@Autowired
	private IEmployeemgmtservice empservice;
	@GetMapping("/")
	public String showhomepage() {
		
		return"home";
		
	}
	@GetMapping("/report")
	public String showreport(Map<String,Object> map) {
		System.out.println("Employeeoperationcontroller.showreport()");
		List<Employee> list=empservice.showallemps();
		//keep the result in model attribute
		map.put("listemps", list);
		return"show_report";
			
	}
	@GetMapping("/add_employee")
	public String showaddemployeeFormpage(@ModelAttribute("emp") Employee emp) {
		return "register_employee_form";
	}
	/*
	@PostMapping("/add_employee")
	public String postMethodName( @ModelAttribute("emp") Employee emp,Map<String, Object> map) {
		//TODO: process POST request
		String msg=empservice.insertemploye(emp);
		List<Employee> list=empservice.showallemps();
		map.put("resultmsg", msg);
		map.put("listemps", list);
	
		return "show_report" ;using refresh phase duplicates  allowed solve this use prg(post pattern
	}
	
	@PostMapping("/add_employee")
	public String postMethodName( @ModelAttribute("emp") Employee emp,Map<String, Object> map) {
		System.out.println("Employeeoperationcontroller.postMethodName()");//using systrace
		//TODO: process POST request
		String msg=empservice.insertemploye(emp);
		
		map.put("resultmsg", msg);
		
	
		return "redirect:report" ;//using refresh phase duplicates not allowed
	}
	*/
	@PostMapping("/add_employee")
	public String postMethodName( @ModelAttribute("emp") Employee emp,RedirectAttributes attr) {
		System.out.println("Employeeoperationcontroller.postMethodName()");//using systrace
		//TODO: process POST request
		String msg=empservice.insertemploye(emp);
		
		attr.addFlashAttribute("resultmsg", msg);
		
	
		return "redirect:report" ;//
	}
	
	@GetMapping("/edit_employee")
	public String showeditemployeeformpage(@RequestParam("no") int no,@ModelAttribute("emp")Employee emp ){
		//use service
		Employee emp1=empservice.fetchemployeebyno(no);
		//copy emp1 object to emp
		BeanUtils.copyProperties(emp1, emp);
		return "edit_employee_form";
	}
	@PostMapping("/edit_employee")
	public String processupdatesubmission(@ModelAttribute("emp") Employee emp,Map<String,Object> map) {
		//use service
	 String msg=empservice.modifyemployeebyno(emp);
	 
	 //keep the result model attribute
	 List<Employee> list=empservice.showallemps();
	 map.put("resultmsg", msg);
	 map.put("listemps", list);
	 
	 return "show_report" ;
	}
	@GetMapping("/delete_employee")
  public String fireemployee(@RequestParam("no")int no,Map<String,Object> map) {
		String msg=empservice.deletedemployee(no);
		List<Employee> list=empservice.showallemps();
		map.put("resultmsg", msg);
		 map.put("listemps", list);
		
	  return "show_report";
  }
	
}
