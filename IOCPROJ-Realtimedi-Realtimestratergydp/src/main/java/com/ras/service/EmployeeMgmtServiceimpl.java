package com.ras.service;

import com.ras.bo.EmployeeBO;
import com.ras.dao.IEmployeeDAO;
import com.ras.dto.EmployeeDTO;

public class EmployeeMgmtServiceimpl implements IEmployeeMgmtService {
	//has-a property
	private IEmployeeDAO dao;

	public EmployeeMgmtServiceimpl(IEmployeeDAO dao) {
		System.out.println("employeemgmtservice 1 param::constructor");
		this.dao = dao;
	}

	public String registerEmployee(EmployeeDTO dto) throws Exception {
		
		// WRITE b.logic calculate gross salary and netsalry
		float grosssalary=dto.getBasicsalary()+dto.getBasicsalary()*0.4f;
		float netsalary=grosssalary-dto.getBasicsalary()*0.2f;
		EmployeeBO bo=new EmployeeBO();
		bo.setEname(dto.getEname());
		bo.setDesg(dto.getDesg());
		bo.setBasicsalary(dto.getBasicsalary());
		bo.setGrosssalary(grosssalary);
		bo.setNetsalary(netsalary);
		//use dao 
		int count=dao.insertemployee(bo);
		//generate final result
		
		return count==1?"Employee register with netsalary::"+netsalary:"Employee not register with netsalary:"+netsalary  ;
	}

}
