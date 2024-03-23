package com.ras.dao;

import java.util.List;

import com.ras.model.Employee;

public interface IEmployeeDAO {
	public Employee getemployeebyno(int no); 
	public List<Employee> getemployeeBydesg(String desg);

}
