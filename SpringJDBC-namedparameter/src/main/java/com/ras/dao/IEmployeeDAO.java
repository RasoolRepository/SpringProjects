package com.ras.dao;

import java.util.List;

import com.ras.model.Employee;

public interface IEmployeeDAO {
	public int getempscountsalaryrange(int start,int end);
	public List<Employee> getempbydesgs(String desg1,String desg2);
	public int insertemployee(Employee emp);
}
