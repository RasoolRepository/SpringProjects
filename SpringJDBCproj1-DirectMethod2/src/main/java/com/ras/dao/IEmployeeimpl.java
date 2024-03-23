package com.ras.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class IEmployeeimpl implements IEmpolyeeDAO {
	private static final String GET_EMP_COUNT="SELECT COUNT(*) FROM EMP";
	private static final String GET_EMP_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	private static final String GET_EMP_BY_DESG="SELECT EMPNO,ENAME,SAL,DEPNO FROM EMP WHERE JOB in(??)";
	@Autowired
	private JdbcTemplate jt;
	

	@Override
	public int getempscount() {
		int count=jt.queryForObject(GET_EMP_COUNT,Integer.class);
		return count;
	}


	@Override
	public Map<String, Object> getemployeebyno(int no) {
		// TODO Auto-generated method stub
		Map<String,Object> map=jt.queryForMap(GET_EMP_BY_NO,no);
		return map;
	}


	@Override
	public List<Map<String, Object>> getemployeedesg(String desg1,String desg2) {
		List<Map<String,Object>> list=jt.queryForList(GET_EMP_BY_DESG, desg1, desg2);
		
		return list;
	}

}
