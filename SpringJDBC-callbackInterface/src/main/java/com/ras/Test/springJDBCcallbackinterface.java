package com.ras.Test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ras.model.Employee;
import com.ras.service.IEmployeemgmtservice;

public class springJDBCcallbackinterface {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/ras/cfgs/applicationcontext.xml");
        IEmployeemgmtservice service=ctx.getBean("empservice",IEmployeemgmtservice.class);
        Employee emp=service.showemployeebyno(101);
        System.out.println("101 employee details------ "+emp);
        System.out.println("------------------");
        List<Employee> emp1=service.fetchemployeedetailsbydesg("dev");
        emp1.forEach(e->{
        	System.out.println(e);
        	
        });
        
        ctx.close();
        
	}

}
