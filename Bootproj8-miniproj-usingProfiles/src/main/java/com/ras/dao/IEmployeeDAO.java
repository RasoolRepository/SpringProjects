package com.ras.dao;

import java.util.List;

import com.ras.model.Employee;

public interface IEmployeeDAO {
	
	public List<Employee> getemployeedesgs(String desg1,String desg2,String desg3)throws Exception;

}
