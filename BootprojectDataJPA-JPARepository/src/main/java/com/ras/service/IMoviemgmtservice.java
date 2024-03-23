package com.ras.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.ras.entity.Movie;

public interface IMoviemgmtservice {
	public String removemoviebyids(List<Integer> ids);
	public List<Movie> searchmoviebymovie(Movie movie,boolean asc,String...props);
	public Movie searchmoviebyid(Integer id);
	
    
    
}
