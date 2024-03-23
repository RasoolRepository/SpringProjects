package com.ras.dao;

import java.util.List;
import java.util.Map;

public interface IEmpolyeeDAO {
	public int getempscount();
	public Map<String, Object> getemployeebyno(int no);
	public List<Map<String,Object>> getemployeedesg(String desg1,String desg2);
	

}
