package com.ras.service;

import java.util.List;

import com.ras.model.Employee;

public interface IEmployeemgmtservice {
	public List<Employee> showallemps();
	public String insertemploye(Employee emp);
	public Employee fetchemployeebyno(int no);
	public String modifyemployeebyno(Employee emp);
	public String deletedemployee(int no);
}
