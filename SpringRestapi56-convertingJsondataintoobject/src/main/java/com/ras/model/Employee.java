package com.ras.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String empno;
	private String ename;
	private String[] favcolors;
	private Address empaddrs;//1-D array
	private List<String> nicknames;//1-D array
	private Set<Long> phonenos;//1-D array
	private Map<String,Long> details;//2-D array
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String[] getFavcolors() {
		return favcolors;
	}
	public void setFavcolors(String[] favcolors) {
		this.favcolors = favcolors;
	}
	public Address getEmpaddrs() {
		return empaddrs;
	}
	public void setEmpaddrs(Address empaddrs) {
		this.empaddrs = empaddrs;
	}
	public List<String> getNicknames() {
		return nicknames;
	}
	public void setNicknames(List<String> nicknames) {
		this.nicknames = nicknames;
	}
	public Set<Long> getPhonenos() {
		return phonenos;
	}
	public void setPhonenos(Set<Long> phonenos) {
		this.phonenos = phonenos;
	}
	public Map<String, Long> getDetails() {
		return details;
	}
	public void setDetails(Map<String, Long> details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", favcolors=" + Arrays.toString(favcolors)
				+ ", empaddrs=" + empaddrs + ", nicknames=" + nicknames + ", phonenos=" + phonenos + ", details="
				+ details + "]";
	}
	public Employee(String empno, String ename, String[] favcolors, Address empaddrs, List<String> nicknames,
			Set<Long> phonenos, Map<String, Long> details) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.favcolors = favcolors;
		this.empaddrs = empaddrs;
		this.nicknames = nicknames;
		this.phonenos = phonenos;
		this.details = details;
	}
	
	
	

}
