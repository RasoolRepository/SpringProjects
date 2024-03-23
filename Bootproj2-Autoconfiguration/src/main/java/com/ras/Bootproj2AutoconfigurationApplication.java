package com.ras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ras.dao.EmployeeDAO;

@SpringBootApplication
public class Bootproj2AutoconfigurationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Bootproj2AutoconfigurationApplication.class, args);
		EmployeeDAO dao=ctx.getBean("empDAO",EmployeeDAO.class);
		try {
			System.out.println("emps count::"+dao.getempscount());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
