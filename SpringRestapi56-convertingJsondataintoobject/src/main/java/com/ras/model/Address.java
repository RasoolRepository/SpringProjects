package com.ras.model;

public class Address {
	private String houseno;
	private String area;
	private String city;
	private Long pinno;
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getPinno() {
		return pinno;
	}
	public void setPinno(Long pinno) {
		this.pinno = pinno;
	}
	public Address(String houseno, String area, String city, Long pinno) {
		super();
		this.houseno = houseno;
		this.area = area;
		this.city = city;
		this.pinno = pinno;
	}
	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", area=" + area + ", city=" + city + ", pinno=" + pinno + "]";
	}
	

}
