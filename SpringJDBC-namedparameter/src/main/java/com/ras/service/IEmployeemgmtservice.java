package com.ras.service;

import java.util.List;

import com.ras.model.Employee;

public interface IEmployeemgmtservice {
	public int fetchempscountsalaryrange(int start,int end);
	public List<Employee> fetchemployeesdesg(String desg1,String desg2);
	public int registeremployee(Employee emp);
}
