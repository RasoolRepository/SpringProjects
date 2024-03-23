package com.ras.dao;

import java.util.List;
import java.util.Map;

public interface IEmployeeDAO {
	public int getemployeecount();
	public Map<String, Object> getEmployeeByno(int no);
	public List<Map<String,Object>> getemployeeDesgByno(String desg1,String desg2);
	public int registeremployee(int empno,String name,String desg, Double salary,int deptno);
	public int updateemployeesalaryBydesg(double percentage,String desg);
    public int deleteemployeebysalaryrange(int sal1,int sal2);
}
