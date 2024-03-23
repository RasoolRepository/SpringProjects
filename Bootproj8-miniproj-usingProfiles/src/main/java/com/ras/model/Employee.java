package com.ras.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private Integer empno;
	private String ename;
	private String job;
	private Integer sal;
	private Integer deptno;
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer eno) {
		this.empno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + empno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + ", deptno=" + deptno
				+ "]";
	}
	
	
	
	

}
