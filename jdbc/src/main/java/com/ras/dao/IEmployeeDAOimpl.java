package com.ras.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("empDAO")
public class IEmployeeDAOimpl implements IEmployeeDAO {
	private static final String GET_EMP_COUNT="SELECT COUNT(*) FROM EMP ";
	private static final String GET_EMP_NO="SELECT EMPNO,ENAME,SAL FROM EMP WHERE EMPNO=?";
	private static final String GET_EMP_BY_DESG="SELECT EMPNO,ENAME,SAL,JOB FROM EMP WHERE JOB IN (?,?)";
	private static final String  EMP_INSERT_QUERY="INSERT INTO EMP(EMPNO,ENAME,JOB,SAL,DEPTNO) VALUES (?,?,?,?,?)";
	private static final String EMP_UPDATE_QUERY="UPDATE EMP SET SAL=SAL+SAL*? WHERE JOB=?";
	private static final String EMP_DELETE_QUERY="DELETE FROM EMP WHERE SAL>=? AND SAL<=?";
	@Autowired
	private JdbcTemplate jt;

	@Override
	public int getemployeecount() {
		int count=jt.queryForObject(GET_EMP_COUNT, Integer.class);
		
		return count;
	}

	@Override
	public Map<String, Object> getEmployeeByno(int no) {
		Map<String,Object> count=jt.queryForMap(GET_EMP_NO, no);
		return count;
	}

	@Override
	public List<Map<String, Object>> getemployeeDesgByno(String desg1, String desg2) {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list=jt.queryForList(GET_EMP_BY_DESG,desg1,desg2);
				return list;
	}

	@Override
	public int registeremployee(int empno, String name, String desg, Double salary, int deptno) {
		// TODO Auto-generated method stub
		return jt.update(EMP_INSERT_QUERY,empno,name,desg,salary,deptno);
	}

	@Override
	public int updateemployeesalaryBydesg(double percentage, String desg) {
		double percentvalue=percentage/100.0;
		// TODO Auto-generated method stub
		return jt.update(EMP_UPDATE_QUERY, percentvalue,desg);
	}

	@Override
	public int deleteemployeebysalaryrange(int sal1, int sal2) {
		
		return jt.update(EMP_DELETE_QUERY, sal1,sal2);
	}

}

	
