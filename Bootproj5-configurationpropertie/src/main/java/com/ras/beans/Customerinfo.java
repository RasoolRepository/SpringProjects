package com.ras.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("custinfo")

@ConfigurationProperties("cust")
public class Customerinfo {
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public void setBillamt(int billamt) {
		this.billamt = billamt;
	}
	private String name;
	private int age;
	private String addrs;
	private int billamt;
	@Override
	public String toString() {
		return "Customerinfo [name=" + name + ", age=" + age + ", addrs=" + addrs + ", billamt=" + billamt + "]";
	}
	

}
