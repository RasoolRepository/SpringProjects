package com.ras.service;

import java.util.List;

import com.ras.entity.Employee;

public interface IEmployeemgmtservice {
	public String employeeregistered(Employee emp);
	public List<Employee> fetchallemployee();
	public Employee fetchbyno(int no);
	public String hikeemployeesalary(int no,int sal);
	public String removeemployee(int no);
}
