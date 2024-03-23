package com.ras.service;

import java.util.List;

import com.ras.model.Employee;

public interface IEmployeemgmtservice {
	public Employee showemployeebyno(int no);
	public List<Employee> fetchemployeedetailsbydesg(String desg);

}
