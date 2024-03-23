package com.ras.model;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Employee {
	private String Eid;
	private String Ename;
	private String[] favcolors;
	private List<String> nicknames;
	private Set<Long> phones;
	private Map<String,Long> details;
	private boolean vacinated;
	private LocalDateTime dob;
	//has-a property
	private Company compdetails;
	public String getEid() {
		return Eid;
	}
	public void setEid(String eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String[] getFavcolors() {
		return favcolors;
	}
	public void setFavcolors(String[] favcolors) {
		this.favcolors = favcolors;
	}
	public List<String> getNicknames() {
		return nicknames;
	}
	public void setNicknames(List<String> nicknames) {
		this.nicknames = nicknames;
	}
	public Set<Long> getPhones() {
		return phones;
	}
	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}
	public Map<String, Long> getDetails() {
		return details;
	}
	public void setDetails(Map<String, Long> details) {
		this.details = details;
	}
	public boolean isVacinated() {
		return vacinated;
	}
	public void setVacinated(boolean vacinated) {
		this.vacinated = vacinated;
	}
	public LocalDateTime getDob() {
		return dob;
	}
	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}
	public Company getCompdetails() {
		return compdetails;
	}
	public void setCompdetails(Company compdetails) {
		this.compdetails = compdetails;
	}
	public Employee(String eid, String ename, String[] favcolors, List<String> nicknames, Set<Long> phones,
			Map<String, Long> details, boolean vacinated, LocalDateTime dob, Company compdetails) {
		super();
		Eid = eid;
		Ename = ename;
		this.favcolors = favcolors;
		this.nicknames = nicknames;
		this.phones = phones;
		this.details = details;
		this.vacinated = vacinated;
		this.dob = dob;
		this.compdetails = compdetails;
	}
	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", favcolors=" + Arrays.toString(favcolors)
				+ ", nicknames=" + nicknames + ", phones=" + phones + ", details=" + details + ", vacinated="
				+ vacinated + ", dob=" + dob + ", compdetails=" + compdetails + "]";
	}
	

}
