package com.ras.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ras.model.Actor;


public interface IActormgmtService {
	
	public String registeractor(Actor actor);
	public Iterable<Actor> getallactors();
	public Actor getactorbyid(int id);
	public List<Actor> fetchactorsbycategory(String catergory1,String category2);
	public String UpdateActor(Actor actor);
	public String deletebyid(int id);
	

}
