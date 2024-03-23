package com.ras.model;

import java.time.LocalDateTime;

public class Errordetails {
	private LocalDateTime time;
	private String msg;
	private String status;
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Errordetails [time=" + time + ", msg=" + msg + ", status=" + status + "]";
	}
	public Errordetails(LocalDateTime time, String msg, String status) {
		super();
		this.time = time;
		this.msg = msg;
		this.status = status;
	}
	public Errordetails() {
		super();
	}
	
	

}
