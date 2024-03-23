package com.ras.entity;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@Column(name = "ENO")
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer Empno;
	@Column(name = "ENAME",length = 20)
	private String empname;
	@Column(name = "DESG",length = 20)
	private String desg;
	@Column(name = "SAL")
	private Integer sal;
	
	public Employee() {
		System.out.println("employee 0-paramconstuctor::");
		
	}
	public Employee(String empname, String desg, Integer sal) {
		System.out.println("employee 3-paramconstuctor::");
		this.empname = empname;
		this.desg = desg;
		this.sal = sal;
	}
	public Integer getEmpno() {
		return Empno;
	}
	public void setEmpno(Integer empno) {
		Empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [Empno=" + Empno + ", empname=" + empname + ", desg=" + desg + ", sal=" + sal + "]";
	}
	
	

}
