package com.ras.beans;

public class Employee1 {
	private int eno;
	private String ename;
	private Float billamt;
	public Employee1(int eno, String ename, Float billamt) {
		
		System.out.println("employee 3 param constructor::");
		this.eno = eno;
		this.ename = ename;
		this.billamt = billamt;
	}
  public Employee1(int eno, String ename) {
		
		System.out.println("employee 2 param constructor::");
		this.eno = eno;
		this.ename = ename;
		
	}
  public Employee1(int eno , Float billamt) {
		
		System.out.println("employee 2 param constructor::");
		this.eno = eno;
		
		this.billamt = billamt;
	}
  public Employee1(String ename, Float billamt) {
		
		System.out.println("employee 2 param constructor::");
		
		this.ename = ename;
		this.billamt = billamt;
	}
  public Employee1(int eno) {
		
		System.out.println("employee 1 param constructor::");
		this.eno = eno;
	}
  public Employee1(String ename) {
		
		System.out.println("employee 1 param constructor::");
		
		this.ename = ename;
		
	}
  public Employee1( Float billamt) {
		
		System.out.println("employee 1 param constructor::");
		this.billamt = billamt;
	}
	@Override
	public String toString() {
		return "Employee1 [eno=" + eno + ", ename=" + ename + ", billamt=" + billamt + "]";
	}
	

}
