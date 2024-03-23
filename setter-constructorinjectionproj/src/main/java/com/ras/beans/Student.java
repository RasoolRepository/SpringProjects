package com.ras.beans;

public class Student {

private String sname;
private String collegename;
private int age;
private String qlfy;

public void setSname(String sname) {
	this.sname = sname;
}

public void setCollegename(String collegename) {
	this.collegename = collegename;
}

public void setAge(int age) {
	this.age = age;
}

public void setQlfy(String qlfy) {
	this.qlfy = qlfy;
}

@Override
public String toString() {
	return "Student [sname=" + sname + ", collegename=" + collegename + ", age=" + age + ", qlfy=" + qlfy + "]";
}

}
