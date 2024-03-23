package com.ras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ras.dao.IEmployeeDAO;
import com.ras.model.Employee;
@Service("empservice")
public class IEmployeemgmtserviceimpl implements IEmployeemgmtservice {
	@Autowired
	private IEmployeeDAO empDAO;

	@Override
	public Employee showemployeebyno(int no) {
		// TODO Auto-generated method stub
		return empDAO.getemployeebyno(no);
	}

	@Override
	public List<Employee> fetchemployeedetailsbydesg(String desg) {
		// TODO Auto-generated method stub
		return empDAO.getemployeeBydesg(desg);
	}
	

	
	

}
