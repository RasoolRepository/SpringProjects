package com.ras.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;

import com.ras.dao.IEmployeeDAO;
import com.ras.entity.Employee;


@Service("empservice")
@org.springframework.transaction.annotation.Transactional(propagation = Propagation.REQUIRED)//enablesc commit or rollback activities to perform
public class IEmployeemgmtserviceimpl implements IEmployeemgmtservice {
	@Autowired
	private IEmployeeDAO empDAO;

	@Override
	public String employeeregistered(Employee emp) {
		// TODO Auto-generated method stub
		
		int res=empDAO.insertemployee(emp);
		return "employee registered with val"+res;
	}

	@Override
	public List<Employee> fetchallemployee() {
		// TODO Auto-generated method stub
		
		
		return (List<Employee>) empDAO.getallemployees();
	}

	@Override
	public Employee fetchbyno(int no) {
		// TODO Auto-generated method stub
		return empDAO.getemployeebyno(no);
	}

	@Override
	public String hikeemployeesalary(int no, int sal) {
		// TODO Auto-generated method stub
		//get existing employee of sal
		Employee emp=fetchbyno(no);
		int salary=emp.getSal();
		salary=salary+(salary*sal/100);
		
		
		return empDAO.updateemployeesalary(no, salary) ;
	}

	@Override
	public String removeemployee(int no) {
		// TODO Auto-generated method stub
		
		return empDAO.deletemployee(no);
	}

}
