package com.ras.Test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ras.model.Employee;
import com.ras.service.IEmployeemgmtservice;

public class springJDBCcallbackinterface {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/ras/cfgs/applicationcontext.xml");
        IEmployeemgmtservice service=ctx.getBean("empservice",IEmployeemgmtservice.class);
         int count=service.fetchempscountsalaryrange(20000, 25000);
         System.out.println(count);
         System.out.println("-------------------");
         List<Employee> emp=service.fetchemployeesdesg("dev","back");
         emp.forEach(e->{
        	 System.out.println(e);
        	 
         });
         System.out.println("-------------------");
         Employee emp1=new Employee();
         emp1.setEmpno(104);
         emp1.setEname("venky");
         emp1.setJob("manger");
         emp1.setSal(200000);
         emp1.setDeptno(30);
         int e=service.registeremployee(emp1);
         System.out.println("registered successfully....."+e);
         ctx.close();
        
	}

}
  