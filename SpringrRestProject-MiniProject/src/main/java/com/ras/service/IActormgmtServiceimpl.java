package com.ras.service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ras.exeption.ActornotfoundException;
import com.ras.model.Actor;
import com.ras.repository.IActorRepo;
@Service("service")
public class IActormgmtServiceimpl implements IActormgmtService {
	@Autowired
	private IActorRepo repo;

	@Override
	public String registeractor(Actor actor) {
		// TODO Auto-generated method stub
		Actor actor1=repo.save(actor);
		return "Actor registered successfully.."+actor1.getActorid();
	}
	/*
	@Override
	public Iterable<Actor> getallactors() {
		Iterable<Actor> it=repo.findAll();
		List<Actor> list=(List<Actor>) it;// arrage strings in sorting process
		list.sort((t1,t2)->t1.getActorname().compareTo(t2.getActorname()));
		return list;
	}*/
	@Override
	public Iterable<Actor> getallactors() {
		Iterable<Actor> it=repo.findAll();
		Collections.sort((List<Actor>)it,(t1,t2)->t1.getActorname().compareTo(t2.getActorname()));
		return it;
	}
	@Override
	public Actor getactorbyid(int id) {
		// TODO Auto-generated method stub
		//Actor actor=repo.findById(id) .get();
		Actor actor=repo.findById(id).orElseThrow(()->new IllegalArgumentException());
		
		return actor ;
	}
	@Override
	public List<Actor> fetchactorsbycategory(String catergory1, String category2) {
		// TODO Auto-generated method stub
		List<Actor> list=repo.getactorsbycategory(catergory1, category2);
		return list;
	}
	@Override
	public String UpdateActor(Actor actor)   {
		// TODO Auto-generated method stub
		Optional<Actor> opt=repo.findById(actor.getActorid());
		if(opt.isPresent()) {
			repo.save(actor);
			return"actor information updated";
		}
		else {
			throw new ActornotfoundException("actor not found");
		}
	}
	@Override
	public String deletebyid(int id) {
		// TODO Auto-generated method stub
		Optional<Actor> opt=repo.findById(id);
		if(opt.isPresent()) {
			repo.deleteById(id);
			return "actor information deleted"+id;
		}
		else {
			throw new ActornotfoundException("actor not found");
			
			
		}
	}

}
