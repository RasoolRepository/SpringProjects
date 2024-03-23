package com.ras.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ras.model.Employee;

@Repository("empDAO")
public class IEmployeeDAOimpl implements IEmployeeDAO {
	
	@Autowired
	private DataSource ds;
	private static final String GET_EMP_BY_DESGS="SELECT EMPNO,ENAME,JOB,SAL,DEPtNO FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";
	
	@Override
	public List<Employee> getemployeedesgs(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> list=null;
		//con pool
		
		try(Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement(GET_EMP_BY_DESGS)){
			//set query param values
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			list=new ArrayList<>();
			
			//execute query
			try(ResultSet rs=ps.executeQuery()){
				while(rs.next()) {
					Employee emp=new Employee();
					emp.setEmpno(rs.getInt(1));
					emp.setEname(rs.getString(2));
				    emp.setJob(rs.getString(3));
				    emp.setSal(rs.getInt(4));
				    emp.setDeptno(rs.getInt(5));
				    list.add(emp);
				}
				
			}
			catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();//exception rethrowing
				throw se;
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				throw e;//exception rethrowing
			}
			
			
		}
		return list;
			
			
			
		
		
	}//method

}//main
