package com.ras.controller;

import com.ras.dto.EmployeeDTO;
import com.ras.service.IEmployeeMgmtService;
import com.ras.vo.EmployeeVO;

public class MainController {
	//has-a property
	private IEmployeeMgmtService service;

	public MainController(IEmployeeMgmtService service) {
		System.out.println("maincontroller 1 param constructor:::");
		
		this.service = service;
	}
	public String processEmploye(EmployeeVO vo) throws Exception{
		  // convert employeevo class object to employeedto class
		EmployeeDTO dto=new EmployeeDTO();
		dto.setEname(vo.getEname());
		dto.setDesg(vo.getDesg());
		dto.setBasicsalary(Float.parseFloat(vo.getBasicsalary()));
		//use serviece
		String result=service.registerEmployee(dto);
		return result;
	}

}

