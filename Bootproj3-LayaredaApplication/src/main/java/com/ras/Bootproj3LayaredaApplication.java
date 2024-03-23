package com.ras;

import java.io.Closeable;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ras.controller.playrollsystemcontroller;
import com.ras.model.Employee;

@SpringBootApplication
public class Bootproj3LayaredaApplication {

	public static void main(String[] args) {
	ApplicationContext ctx	=SpringApplication.run(Bootproj3LayaredaApplication.class, args);
	playrollsystemcontroller control=ctx.getBean("controller",playrollsystemcontroller.class);
	Scanner sc=new Scanner(System.in);
	System.out.println("enter desg1::");
	String desg1=sc.next();
	System.out.println("enter desg2::");
	String desg2=sc.next();
	System.out.println("enter desg3::");
	String desg3=sc.next();
	
	try {
		List<Employee> emp=control.showemployeedetails(desg1, desg2, desg3);
		/*for(Employee e:emp) {
			System.out.println(e);//enhanced for loop
			}
		emp.forEach(e->{
			System.out.println(e);//foreach 
			
		});*/
		emp.forEach(System.out::println);//method reference java 8 feature and foreach also
		 
		
	} catch (Exception e) {
		System.out.println("internal db problem::");
		e.printStackTrace();
	}
		((ConfigurableApplicationContext) ctx).close();
	}
}
