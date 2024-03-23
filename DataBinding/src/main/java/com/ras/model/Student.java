package com.ras.model;

public class Student {
	private int sno;
	private String sname;
	private String addrs;
	private float avg;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", addrs=" + addrs + ", avg=" + avg + "]";
	}


}
