package com.ras.beans;

public class Jobdetails {
	private String desg;
	private String company;
	private Integer deptno;
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Jobdetails [desg=" + desg + ", company=" + company + ", deptno=" + deptno + "]";
	}
	

}
