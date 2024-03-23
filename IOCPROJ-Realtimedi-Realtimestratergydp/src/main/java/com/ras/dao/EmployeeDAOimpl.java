package com.ras.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.ras.bo.EmployeeBO;

public class EmployeeDAOimpl implements IEmployeeDAO {
	private static final String EMP_INSERT_QUERY="INSERT INTO REALTIMEDI_SPRING_EMPLOYEE1 VALUES(SP_ENO_SEQ.NEXTVAL,?,?,?,?,?)";

	private DataSource ds;
	

	public EmployeeDAOimpl(DataSource ds) {
		System.out.println("employeeDAOIMPL::1 PARAM CONSTRUCTOR");
		this.ds = ds;
	}
	public int insertemployee(EmployeeBO bo) throws Exception {
		int result=0;
		try(Connection con=ds.getConnection();PreparedStatement ps=con.prepareStatement(EMP_INSERT_QUERY);){
			//set the values query param
			ps.setString(1,bo.getEname());
			ps.setString(2,bo.getDesg());
			ps.setFloat(3,bo.getBasicsalary());
			ps.setFloat(4,bo.getGrosssalary());
			ps.setFloat(5,bo.getNetsalary());
			//execute the query
			 result=ps.executeUpdate();
			
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;//exception rethrowing
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e; //exception rethrowing
		}
		
		return result;
		
	}
	
	}


	
	/*
	 public int insertemployee(EmployeeBO bo) throws Exception {
	 
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		try {
			con=ds.getConnection();	
			ps=con.prepareStatement(EMP_INSERT_QUERY);
			//set the values query param
			ps.setString(1,bo.getEname());
			ps.setString(2,bo.getDesg());
			ps.setFloat(3,bo.getBasicsalary());
			ps.setFloat(4,bo.getGrosssalary());
			ps.setFloat(5,bo.getNetsalary());
			//execute the query
			 result=ps.executeUpdate();
			}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		finally {
			try {
				if(ps!=null) 
					ps.close();
				
			}
				catch(SQLException se)
				{
					se.printStackTrace();
				}
				try {
					if(con!=null) 
						con.close();
					
				}
				catch(SQLException se) {
					se.printStackTrace();
				}
				
			}
		
		
		return result;
	}
	*/


