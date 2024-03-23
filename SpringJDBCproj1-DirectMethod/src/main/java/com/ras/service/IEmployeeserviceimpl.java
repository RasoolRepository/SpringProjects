package com.ras.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ras.dao.IEmpolyeeDAO;

@Service("empservice")
public class IEmployeeserviceimpl implements IEmployeeservice {
	@Autowired
	private IEmpolyeeDAO dao;
	

	@Override
	public int showemployeecount() {
		int count=dao.getempscount();
		
		return count;
	}


	@Override
	public Map<String, Object> fetchemployeebyno(int no) {
		// TODO Auto-generated method stub
		//use dao
		
		return dao.getemployeebyno(no);
	}


	@Override
	public List<Map<String, Object>> fetchemployeesbydesg(String desg1, String desg2) {
		// TODO Auto-generated method stub
		return dao.getemployeedesg(desg1, desg2);
	}

}
