package com.ras.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
	private Integer studno;
	private String sname;
	private Float avg;
	private String addrs;
	public Integer getStudno() {
		return studno;
	}
	public void setStudno(Integer studno) {
		this.studno = studno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Float getAvg() {
		return avg;
	}
	public void setAvg(Float avg) {
		this.avg = avg;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public Student(Integer studno, String sname, Float avg, String addrs) {
		super();
		this.studno = studno;
		this.sname = sname;
		this.avg = avg;
		this.addrs = addrs;
	}
	@Override
	public String toString() {
		return "Student [studno=" + studno + ", sname=" + sname + ", avg=" + avg + ", addrs=" + addrs + "]";
	}
	
	

}
