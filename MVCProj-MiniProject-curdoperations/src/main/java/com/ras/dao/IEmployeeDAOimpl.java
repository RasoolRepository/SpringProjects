package com.ras.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ras.model.Employee;
@Repository("empDAO")
public class IEmployeeDAOimpl implements IEmployeeDAO {
	@Autowired
	private JdbcTemplate jt;
	private static final String GET_ALL_EMPS="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP";
	private static final String INSERT_EMPLOYEE="INSERT INTO EMP(EMPNO,ENAME,JOB,SAL,DEPTNO) VALUES(?,?,?,?,?)";


	@Override
	public List<Employee> getallemployees() {
		List<Employee> list=jt.query(GET_ALL_EMPS,rs->{
			List<Employee> list1=new ArrayList();
			while(rs.next()) {
				Employee emp=new Employee();
				emp.setEmpno(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setSal(rs.getInt(4));
				emp.setDeptno(rs.getInt(5));
				list1.add(emp);
			}
			return list1;
		});
		return list;
	}

	@Override
	public int insertemployee(Employee emp) {
		// TODO Auto-generated method stub
		int count=jt.update(INSERT_EMPLOYEE, emp.getEmpno(),emp.getEname(),emp.getJob(),emp.getSal(),emp.getDeptno());
		return count;
	}
	private static final String GET_EMP_BY_NO="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE EMPNO=?";


	@Override
	public Employee getemployeebyno(int no) {
		// TODO Auto-generated method stub
		Employee emp=jt.queryForObject(GET_EMP_BY_NO, (rs,rowNum)->{
			Employee e=new Employee();
			e.setEmpno(rs.getInt(1));
			e.setEname(rs.getString(2));
			e.setJob(rs.getString(3));
			e.setSal(rs.getInt(4));
			e.setDeptno(rs.getInt(5));
			return e;
			
		}, no);
		return emp;
	}
	private static final String UPDATE_EMP_BY_NO="UPDATE EMP SET ENAME=?,JOB=?,SAL=?,DEPTNO=? WHERE EMPNO=?";


	@Override
	public int updateemployee(Employee emp) {
		// TODO Auto-generated method stub
		int count=jt.update(UPDATE_EMP_BY_NO, emp.getEname(),emp.getJob(),emp.getSal(),emp.getDeptno(),emp.getEmpno());
		return count;
	}
	private static final String DELETE_EMP_BY_NO="DELETE FROM EMP WHERE EMPNO=?";
	@Override
	public int deleteemployeebyno(int no) {
		// TODO Auto-generated method stub
		return jt.update(DELETE_EMP_BY_NO,no);
	}  

}
