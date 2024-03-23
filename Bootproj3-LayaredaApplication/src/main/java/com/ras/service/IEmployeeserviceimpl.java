package com.ras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ras.dao.IEmployeeDAO;
import com.ras.model.Employee;
@Service("empserevice")
public class IEmployeeserviceimpl implements IEmployeeservice {
	@Autowired
	private IEmployeeDAO empDAO;

	@Override
	public List<Employee> getempbydesg(String desg1, String desg2, String desg3) throws Exception {
		// TODO Auto-generated method stub
		return empDAO.getemployeedesgs(desg1, desg2, desg3);
	}

}
