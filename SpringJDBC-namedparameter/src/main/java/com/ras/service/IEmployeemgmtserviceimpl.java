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
	public int fetchempscountsalaryrange(int start, int end) {
		
		return empDAO.getempscountsalaryrange(start, end);
	}

	@Override
	public List<Employee> fetchemployeesdesg(String desg1, String desg2) {
		// TODO Auto-generated method stub
		return empDAO.getempbydesgs(desg1, desg2);
	}

	@Override
	public int registeremployee(Employee emp) {
		// TODO Auto-generated method stub
		return empDAO.insertemployee(emp);
	}
	

	
	

}
