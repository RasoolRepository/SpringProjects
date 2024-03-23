package com.ras.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("empDAO")
public class EmployeeDAO {
	private static final String GET_EMPS_COUNT="SELECT COUNT(*) FROM EMP ";  
	@Autowired
	private DataSource ds;
	
	//method with persistence logic 
	public int getempscount() throws Exception{
		System.out.println("EmployeeDAO.getempscount()"+ds.getClass());
		//pooled jdbc con object
		Connection con=ds.getConnection();
		//PREPARED STATEMENT
		PreparedStatement pr=con.prepareStatement(GET_EMPS_COUNT);
		//execute query
		ResultSet rs=pr.executeQuery();
		//result set
		rs.next();
		int count=rs.getInt(1);
		rs.close();
		pr.close();
		return count;
		
	}

}
