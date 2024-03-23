package com.ras.bo;

public class EmployeeBO {
	private Integer eno;
	private String ename;
	private String desg;
	private Float basicsalary;
	private Float grosssalary;
	private Float netsalary;
	//alt+shift+s,r //get setter and getter methods
	//cntr+a,contr+i//slect code AND DO PROPGATION or cntr+shift+f//formating the code
	
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public Float getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(Float basicsalary) {
		this.basicsalary = basicsalary;
	}
	public Float getGrosssalary() {
		return grosssalary;
	}
	public void setGrosssalary(Float grosssalary) {
		this.grosssalary = grosssalary;
	}
	public Float getNetsalary() {
		return netsalary;
	}
	public void setNetsalary(Float netsalary) {
		this.netsalary = netsalary;
	}
	

}
