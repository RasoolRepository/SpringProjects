package com.ras.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ras.service.ILoginmgmtservice;

public class springJDBCCall {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/ras/cfgs/applicationcontext.xml");
		ILoginmgmtservice service=ctx.getBean("service",ILoginmgmtservice.class);
		String res=service.singnin("rasool","ras");
		System.out.println(res);
        
	}

}
  