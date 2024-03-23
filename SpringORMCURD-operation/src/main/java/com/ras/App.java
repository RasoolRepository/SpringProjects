package com.ras;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ras.entity.Employee;
import com.ras.service.IEmployeemgmtservice;

public class App 
{
    public static void main( String[] args )
    {
       //create ioc container
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/ras/cfgs/applicationcontext.xml");
    	//get mgmtservice
    	IEmployeemgmtservice service=ctx.getBean("empservice",IEmployeemgmtservice.class);
    	//invoke the bmethod
    	/*try {
    		Employee emp=new Employee();
    	
    	    emp.setEmpname("rasool");emp.setDesg("clerk");emp.setSal(12000);
    	    String msg=service.employeeregistered(emp);
    	    System.out.println(msg);
    	}
    	catch (Exception e) {
			e.printStackTrace();
		}
		
    	try {
    		System.out.println("all employee details");
    		List<Employee> list=service.fetchallemployee();
    		list.forEach(emp->{
    			System.out.println(emp);
    		});
    	}
    	catch (Exception e) {
			e.printStackTrace();
		}
       
    }
    
    	try {
    		System.out.println("getting single record");
    		Employee emp=service.fetchbyno(1);
    		System.out.println(emp);
    	}
    	catch (Exception e) {
			e.printStackTrace();
		}
       
    
    try {
    	System.out.println("update user deatils::");
    	String empresult=service.hikeemployeesalary(1, 5);
    	System.out.println(empresult);
    	
    }
    catch (Exception e) {
		// TODO: handle exception
    	e.printStackTrace();
	}
    
    */
    	try {
    		System.out.println("delete employe....");
    		String res=service.removeemployee(1);
    		System.out.println(res);
    		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
