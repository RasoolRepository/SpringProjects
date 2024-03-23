package com.ras.beans;

import java.sql.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component("voter")
public class VotingElegibilityCheck  implements InitializingBean,DisposableBean{
	@Value("${per.name}")
	private String name;
	@Value("${per.age}")
	private int age;
	@Value("${per.addrs}")
	private String addrs;
	private Date dov;
	/*
	//setter injection
	public void setName(String name) {
		System.out.println("Voting eligibilty checkservice name:");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("Voting eligibilty checkservice age:");
		this.age = age;
	}
	public void setAddrs(String addrs) {
		System.out.println("Voting eligibilty checkservice addres:");
		this.addrs = addrs;
	}
	*/
	public String checkvotingeligible() {
		System.out.println("Voting eligibilty checkservice age:");
		if(age>18)
			return"Mr/Mrs/miss"  +name+ "ur eligible to date"  +dov;
		
		else {
			return" you are not eligible for voting date::"+dov;
		} 
			
		
	}
	//equavalent custom init method
	
	public void afterproperties() {
		System.out.println("voting eligiblity  custom init method:;");
	    if (name==null || age<0) {
	    	throw new IllegalArgumentException();	
		}
}
	//custom destroy method
	public void destroy() {
		System.out.println("voting eligiblity destroy method:;");
		name=null;
		age=0;
		addrs=null;
		dov=null;
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
}

