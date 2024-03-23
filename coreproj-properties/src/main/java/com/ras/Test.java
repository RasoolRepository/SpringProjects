package com.ras;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ras.beans.Personinfo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/ras/commons/applicationcontext.xml");
	    
        Personinfo info=ctx.getBean("per",Personinfo.class);
        System.out.println(info);
        ctx.close();

	}

}
