package com.ras.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Rest_Actor")
public class Actor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer actorid;
	@Column(length = 20)
	private String actorname;
	@Column(length = 20)
	private String category;
	private Long mobileno;
	public Integer getActorid() {
		return actorid;
	}
	public void setActorid(Integer actorid) {
		this.actorid = actorid;
	}
	public String getActorname() {
		return actorname;
	}
	public void setActorname(String actorname) {
		this.actorname = actorname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Long getMobileno() {
		return mobileno;
	}
	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "Actor [actorid=" + actorid + ", actorname=" + actorname + ", category=" + category + ", mobileno="
				+ mobileno + "]";
	}
	public Actor(Integer actorid, String actorname, String category, Long mobileno) {
		super();
		this.actorid = actorid;
		this.actorname = actorname;
		this.category = category;
		this.mobileno = mobileno;
	}
	public Actor() {
		super();
	}
	
	
	

}
