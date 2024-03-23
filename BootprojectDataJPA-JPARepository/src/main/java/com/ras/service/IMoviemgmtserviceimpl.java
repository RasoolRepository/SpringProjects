package com.ras.service;


import java.util.List;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.ras.entity.Movie;
import com.ras.repository.IMovierepo;

@Service("movieservice")
public class IMoviemgmtserviceimpl implements IMoviemgmtservice {
	@Autowired
	private IMovierepo movierepo;

	@Override
	public String removemoviebyids(List<Integer> ids) {
		// TODO Auto-generated method stub
		List<Movie> list=movierepo.findAllById(ids);
		
		long count=list.size();
		
			movierepo.deleteAllByIdInBatch(ids);
		return count+"no of records deleted";
		
		
	}
	@Override
	public List<Movie> searchmoviebymovie(Movie movie, boolean asc, String... props) {
		// TODO Auto-generated method stub
		Example example=Example.of(movie);
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC,props);
		List<Movie> list=movierepo.findAll(example, sort);
		
		return list;
	}
@Override
public Movie searchmoviebyid(Integer id) {
	// TODO Auto-generated method stub
	Movie movie=movierepo.getById(id);
	System.out.println(movie.getClass());
	return movie;
	
}
	

	
}
