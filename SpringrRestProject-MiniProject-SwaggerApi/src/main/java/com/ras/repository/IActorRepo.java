package com.ras.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ras.model.Actor;

public interface IActorRepo extends CrudRepository<Actor, Integer> {
	@Query("from Actor where category in(:c1,:c2) order by category")//JPQL query
	public List<Actor> getactorsbycategory(@Param("c1") String category1,@Param("c2") String category2);

}
