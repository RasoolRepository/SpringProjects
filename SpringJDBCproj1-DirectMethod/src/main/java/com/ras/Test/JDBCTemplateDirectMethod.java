package com.ras.Test;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ras.service.IEmployeeservice;

public class JDBCTemplateDirectMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/ras/cfgs/applicationcontext.xml");
        IEmployeeservice result=ctx.getBean("empservice",IEmployeeservice.class);
        int service=result.showemployeecount();
        System.out.println(service);
        System.out.println("----------------");
        Map<String, Object> map=result.fetchemployeebyno(102);
        System.out.println("101 employee details are"+map);
        System.out.println("----------------");
        
     
        ctx.close();
        
        
      
       
        
       
	}

}
