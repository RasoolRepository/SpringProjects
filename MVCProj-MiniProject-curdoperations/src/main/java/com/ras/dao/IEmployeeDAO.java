package com.ras.dao;

import java.util.List;

import com.ras.model.Employee;

public interface IEmployeeDAO {
	public List<Employee> getallemployees();
	public int insertemployee(Employee emp);
	public Employee getemployeebyno(int no);
	public int updateemployee(Employee emp);
	public int deleteemployeebyno(int no);
	

}
