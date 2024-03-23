package com.ras.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ras.dao.IEmployeeDAO;
@Service("empservice")
public class IEmployeemgmtserviceimpl implements IEmployeemgmtService {
	@Autowired
	private IEmployeeDAO empDAO;


	@Override
	public int showemployeescount() {
		
		return empDAO.getemployeecount();
	}


	@Override
	public Map<String, Object> fetchemployee(int no) {
		
		return empDAO.getEmployeeByno(no);
	}


	@Override
	public List<Map<String, Object>> fetchempDesg(String desg1, String desg2) {
		// TODO Auto-generated method stub
		return empDAO.getemployeeDesgByno(desg1, desg2);
	}


	@Override
	public int registeremployee(int empno, String name, String desg, Double salary, int deptno) {
		// TODO Auto-generated method stub
		int count=empDAO.registeremployee(empno, name, desg, salary, deptno);
		return count ;

}


	@Override
	public int hikEmployeeSalarybydesg(double percentage, String desg) {
		// TODO Auto-generated method stub
		return empDAO.updateemployeesalaryBydesg(percentage, desg);
	}


	@Override
	public int fireemployeesalrange(int sal1, int sal2) {
		// TODO Auto-generated method stub
		return empDAO.deleteemployeebysalaryrange(sal1, sal2);
	}
	}
