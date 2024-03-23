package com.ras.service;

import java.util.List;
import java.util.Optional;

import com.ras.entity.Movie;

public interface IMoviemgmtservice {
	
	public String registermovie(Movie movie);
	public long fetchmoviescount();    
	public boolean checkmoviebyid(Integer mid);
	public Iterable<Movie> findall();
	public Iterable<Movie> findallbyids(List<Integer> mids);
	public Movie findsingleid(int mid);
    public String groupmovieregistration(List<Movie> movielist );
    public String updatemoviedetails(Integer mid,String newyear,Float rating);
    public String updatemovie(Movie movie);
    public String deletebyid(int id);
    public String deletemovie(Movie movie);
    public String removeallmovies();
    public String deleteallbyids(List<Integer> ids);
    
    
}
