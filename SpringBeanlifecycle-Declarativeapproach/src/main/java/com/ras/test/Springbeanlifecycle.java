package com.ras.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ras.beans.VotingElegibilityCheck;

public class Springbeanlifecycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stubc
		ClassPathXmlApplicationContext ctx=new  ClassPathXmlApplicationContext("com/ras/cfgs/applicationcontext.xml");
		VotingElegibilityCheck service=ctx.getBean("voter",VotingElegibilityCheck.class);
		//invoke businss ,method
		String result=service.checkvotingeligible();
		System.out.println(result);
		ctx.close();

	}

}
