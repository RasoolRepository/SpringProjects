package com.ras.Test;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ras.service.IEmployeemgmtService;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/ras/cfgs/applicationcontext.xml");
        IEmployeemgmtService service=ctx.getBean("empservice",IEmployeemgmtService.class);
        System.out.println(service.showemployeescount());
        Map<String, Object> map=service.fetchemployee(101);
        System.out.println("emp details::"+map);
        System.out.println("------------------");
        List<Map<String, Object>> list=service.fetchempDesg("DEV", "BACK");
        list.forEach(m->{
        	System.out.println(m);
        });
        /*System.out.println("--------INSERT---------");
        int count=service.registeremployee(103, "naresh", "dev", 20000.00, 30);
        System.out.println("record inserted Successfuly......."+count);
        System.out.println("--------UPDATE---------");
        int count =service.hikEmployeeSalarybydesg(10.0, "dev");
        System.out.println(count);
        */
        System.out.println("--------DELETE EMPLOYEE---------");
        int count=service.fireemployeesalrange(25000, 25000);
        System.out.println(count);
        
        ctx.close();
	}

}
