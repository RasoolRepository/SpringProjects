package com.ras.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("hsptl")
@Data
public class Hospital {
	@Value("KIMS")//hard coding
	private String name;
	@Value("30")//hard coding
	private int rank;
	@Value("${hsptl.name}")//collecting from properties files
	private String name1;
	@Value("${hsptl.age}")//collecting from properties files
	private int age;
	@Value("${path}")// injecting from envirnoment variable
	private String pathData;
	@Value("${os.name}")//injecting system propertie values
	private String os;
	
	
	@Override
	public String toString() {
		return "Hospital [name=" + name + ", rank=" + rank + ", name1=" + name1 + ", age=" + age + ", pathData="
				+ pathData + ", os=" + os + ", lab=" + lab + ", billamt=" + billamt + "]";
	}


	@Autowired//autowiring
	//@VALUE("#{linfo}")// using spel performing injection to object type property  
	private Labtestinfo lab;
	@Value("#{linfo.boodprofileprice+linfo.rtpcrprice}")//SPEL(SPRING LANGUAGE) based arithmetic operation  and injection
	private float billamt;
	
	

}
