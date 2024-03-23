package com.ras.dao;

import java.util.List;

import com.ras.entity.Employee;

public interface IEmployeeDAO {
	public int insertemployee(Employee emp);
	public List<?> getallemployees();
	public Employee getemployeebyno(int no);
	public String updateemployeesalary(int no,int sal);
	public String deletemployee(int no);
	
    
}
