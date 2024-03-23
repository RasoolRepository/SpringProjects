package com.ras.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("personinfo")
@ConfigurationProperties(prefix = "pinfo")
public class Personinfo {
	private Integer pid;
	private String pname;
	//array type
	private String[] favcolors;
	//collection type
	private List<String> studies;
	private Set<Long> phonenumbers;
	private Map<String, Long> iddetails;
	//HAS-A property
	private Jobdetails jobinfo;
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setFavcolors(String[] favcolors) {
		this.favcolors = favcolors;
	}
	public void setStudies(List<String> studies) {
		this.studies = studies;
	}
	public void setPhonenumbers(Set<Long> phonenumbers) {
		this.phonenumbers = phonenumbers;
	}
	public void setIddetails(Map<String, Long> iddetails) {
		this.iddetails = iddetails;
	}
	public void setJobinfo(Jobdetails jobinfo) {
		this.jobinfo = jobinfo;
	}
	@Override
	public String toString() {
		return "Personinfo [pid=" + pid + ", pname=" + pname + ", favcolors=" + Arrays.toString(favcolors)
				+ ", studies=" + studies + ", phonenumbers=" + phonenumbers + ", iddetails=" + iddetails + ", jobinfo="
				+ jobinfo + "]";
	}
	

}
