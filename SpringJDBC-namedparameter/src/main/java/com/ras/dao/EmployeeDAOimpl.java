package com.ras.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ras.model.Employee;
@Repository("empDAO")
public class EmployeeDAOimpl implements IEmployeeDAO {
	private static final String GET_EMP_COUNT_BY_SALRANGE="SELECT COUNT(*) FROM EMP WHERE SAL>=:min AND SAL<=:max";
	private static final String GET_EMP_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(:DESG1,:DESG2) ORDER BY JOB";
	private static final String INSERT_QUERY="INSERT INTO EMP(empno,ename,job,sal,deptno) VALUES (:empno,:ename,:job,:sal,:deptno)";
	
	
	@Autowired
	private NamedParameterJdbcTemplate njt;

	@Override
	public int getempscountsalaryrange(int start, int end) {
		//create map object having names and values of names params
		Map<String,Object> paramsmap=new HashMap();
		paramsmap.put("min", start);
		paramsmap.put("max", end);
		int count=njt.queryForObject(GET_EMP_COUNT_BY_SALRANGE, paramsmap, Integer.class);
		
		return count;
	}

	@Override
	public List<Employee> getempbydesgs(String desg1, String desg2) {
		//BIND VALUES TO NAMED PARAMETRES MAP SQL PARAMETER SOURCE APPROACH
		MapSqlParameterSource source=new MapSqlParameterSource();
		source.addValue("DESG1", desg1);
		source.addValue("DESG2",desg2);
		List<Employee> list=njt.query(GET_EMP_BY_DESG,source,rs->{
			List<Employee> emplist=new ArrayList();
			while(rs.next()) {
				Employee em=new Employee();
				em.setEmpno(rs.getInt(1));
				em.setEname(rs.getString(2));
				em.setJob(rs.getString(3));
				em.setSal(rs.getInt(4));
				em.setDeptno(rs.getInt(5));
				emplist.add(em);
				
				
			}
			return emplist;
			
			
		});
		return list;
	}

	@Override
	public int insertemployee(Employee emp) {
		//create beanpropertysqlparametersource object having modal class object
		BeanPropertySqlParameterSource bps=new BeanPropertySqlParameterSource(emp);
		int count=njt.update(INSERT_QUERY, bps);
		return count;
	}
	
	
}
