package com.ras.service;

import java.util.List;
import java.util.Map;

public interface IEmployeeservice {
	public int showemployeecount();
	public Map<String, Object> fetchemployeebyno(int no);
	public List<Map<String,Object>> fetchemployeesbydesg(String desg1,String desg2);

}
