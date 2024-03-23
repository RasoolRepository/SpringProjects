package com.ras.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.ras.model.Employee;
@Repository("empDAO")
public class EmployeeDAOimpl implements IEmployeeDAO {
	private static final String GET_EMP_BY_NO="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE EMPNO=?";
	private static final String GET_EMP_BYDESG="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB=?";
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public Employee getemployeebyno(int no) {
	Employee emp=jt.queryForObject(GET_EMP_BY_NO,new BeanPropertyRowMapper<Employee>(Employee.class) ,no);
		return emp;//ready made class is BeanPropertyRowMapper
	}
	@Override
	public List<Employee> getemployeeBydesg(String desg) {
		// TODO Auto-generated method stub
		List<Employee> emp=jt.query(GET_EMP_BYDESG,new RowMapperResultSetExtractor<Employee>(new BeanPropertyRowMapper(Employee.class)),desg );
		return emp    ;
	}
	
	/*// lambda expression
	@Override
	public List<Employee> getemployeeBydesg(String desg) {
		List<Employee> emp=jt.query(GET_EMP_BYDESG, rs-> {
			List<Employee> emplist=new ArrayList<Employee>();
			while(rs.next()) {
				Employee e=new Employee();
				e.setEmpno(rs.getInt(1));
				e.setEname(rs.getString(2));
				e.setJob(rs.getString(3));
				e.setSal(rs.getInt(4));
				e.setDeptno(rs.getInt(5));
				emplist.add(e);
			
		}
			return emplist;
			},desg);
		
		return emp;
	}
	

	@Override
	public List<Employee> getemployeeBydesg(String desg) {
		List<Employee> emp=jt.query(GET_EMP_BYDESG, new ResultSetExtractor<List<Employee>>() {

			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> emplist=new ArrayList<Employee>();
				while(rs.next()) {
					Employee e=new Employee();
					e.setEmpno(rs.getInt(1));
					e.setEname(rs.getString(2));
					e.setJob(rs.getString(3));
					e.setSal(rs.getInt(4));
					e.setDeptno(rs.getInt(5));
					emplist.add(e);
					
				}
				
				return emplist;
			}
			
		},desg);
		return emp;
	}
	
	@Override
	public Employee getemployeebyno(int no) {
		//Lambda expression anonymous inner class object
		Employee emp=jt.queryForObject(GET_EMP_BY_NO, (rs, row)->{
			//copy rs object
			Employee e=new Employee();
			e.setEmpno(rs.getInt(1));
			e.setEname(rs.getString(2));
			e.setJob(rs.getString(3));
			e.setSal(rs.getInt(4));
			e.setDeptno(rs.getInt(5));
			return e;
			
		},no);
		return emp;
	}
	
	
	//Anonymous inner class
	@Override
	public Employee getemployeebyno(int no) {
		
		
		Employee emp=jt.queryForObject(GET_EMP_BY_NO,new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				//copy rs obejct to employee
				Employee emp=new Employee();
				emp.setEmpno(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setSal(rs.getInt(4));
				emp.setDeptno(rs.getInt(5));
				return emp;
			}
			
		}, no);
		return emp;
	}
	
// normal inner class
	@Override
	public Employee getemployeebyno(int no) {
		Employee emp=jt.queryForObject(GET_EMP_BY_NO,new EmployeeRowMapper(),no);
				
		return emp;
	}
	//static inner class(nested inner cls)
	private static class EmployeeRowMapper implements RowMapper<Employee>{

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			//copy resultset object to employee class
			Employee emp=new Employee();
			emp.setEmpno(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setSal(rs.getInt(4));
			emp.setDeptno(rs.getInt(5));
			return emp;
		}
		
	}*/

	
}
