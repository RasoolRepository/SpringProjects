package com.ras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ras.dao.IEmployeeDAO;
import com.ras.model.Employee;
@Service("empservice")
public class IEmployeemgmtserviceimpl implements IEmployeemgmtservice  {
	
	@Autowired
	IEmployeeDAO empDAO;

	@Override
	public List<Employee> showallemps() {
		// TODO Auto-generated method stub
		
		return empDAO.getallemployees();
	}

	@Override
	public String insertemploye(Employee emp) {
		// TODO Auto-generated method stub
		int count=empDAO.insertemployee(emp);
		return count==0?"employee not registered":"employee registered" ;
	}

	@Override
	public Employee fetchemployeebyno(int no) {
		// TODO Auto-generated method stub
		return empDAO.getemployeebyno(no);
	}

	@Override
	public String modifyemployeebyno(Employee emp) {
		// TODO Auto-generated method stub
	     int count=empDAO.updateemployee(emp);
		return count==0?"employee not found":"employee found and updated";
	}

	@Override
	public String deletedemployee(int no) {
		// TODO Auto-generated method stub
		int count=empDAO.deleteemployeebyno(no);
		return count==0?"employee not found":"employee deleted";
	}

}
