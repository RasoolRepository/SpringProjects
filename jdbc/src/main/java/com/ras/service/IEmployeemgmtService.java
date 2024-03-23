package com.ras.service;

import java.util.List;
import java.util.Map;

public interface IEmployeemgmtService {
	public int showemployeescount();
	public Map<String, Object> fetchemployee(int no);
	public List<Map<String, Object>> fetchempDesg(String desg1,String desg2);
	public int registeremployee(int empno,String name,String desg, Double salary,int deptno);
	public int hikEmployeeSalarybydesg(double percentage,String desg) ;
	public int fireemployeesalrange(int sal1,int sal2);


}
