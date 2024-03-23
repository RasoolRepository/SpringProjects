package com.ras.service;

import java.util.List;

import com.ras.model.Employee;

public interface IEmployeeservice {
	public List<Employee> getempbydesg(String desg1,String desg2,String desg3) throws Exception;

}
