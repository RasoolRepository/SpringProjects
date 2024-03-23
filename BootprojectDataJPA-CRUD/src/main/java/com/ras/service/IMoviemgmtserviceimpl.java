package com.ras.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ras.entity.Movie;
import com.ras.repository.IMovierepo;

@Service("movieservice")
public class IMoviemgmtserviceimpl implements IMoviemgmtservice {
	@Autowired
	private IMovierepo movierepo;

	@Override
	public String registermovie(Movie movie) {
		System.out.println("before data ::"+movie);
		// TODO Auto-generated method stub
		
		Movie movie1=movierepo.save(movie);
		System.out.println("after saving"+movie1);
		return "employee registered successfully"+movie1.getMid();
	}

	@Override
	public long fetchmoviescount() {
		// TODO Auto-generated method stub
		return movierepo.count();
	}

	@Override
	public boolean checkmoviebyid(Integer mid) {
		// TODO Auto-generated method stub
		return movierepo.existsById(mid);
	}

	@Override
	public Iterable<Movie> findall() {
		// TODO Auto-generated method stub
		return movierepo.findAll();
	}

	@Override
	public Iterable<Movie> findallbyids(List<Integer> mids) {
		// TODO Auto-generated method stub
		return movierepo.findAllById(mids);
	}
	@Override
	public Movie findsingleid(int mid) {
		// TODO Auto-generated method stub
		Optional<Movie> opt=movierepo.findById(mid);
		if(opt.isPresent()) {
			return opt.get();
		}
		else
			throw new IllegalArgumentException("record not found");
			
		
	}

	@Override
	public String groupmovieregistration(List<Movie> movielist) {
		// TODO Auto-generated method stub
		Iterable<Movie> savemovie=movierepo.saveAll(movielist);
		List<Integer> listids=new ArrayList<>();
		if (savemovie!=null&&((List<Movie>) savemovie).size()>0) {
			savemovie.forEach(m->{
				listids.add(m.getMid());
				
			});
			
			
		}
		return listids.toString()+"movies are saved";
		
	}

	@Override
	public String updatemoviedetails(Integer mid,String newyear, Float rating) {
		// TODO Auto-generated method stub
		Optional<Movie> opt=movierepo.findById(mid);
		if(opt.isPresent()) {
			Movie movie=opt.get();
			movie.setYear(newyear);
			movie.setRating(rating);
			movierepo.save(movie);
			return "movie updated"+mid;
	}
	else {
		return"movie not available...";
	}
		

	}

	@Override
	public String updatemovie(Movie movie) {
		Optional<Movie> opt=movierepo.findById(movie.getMid());
		if(opt.isPresent()) {
			movierepo.save(movie);
			return"movie is updated";
			
		}
		else {
			return"movie is not available";
		}
	}

	@Override
	public String deletebyid(int id) {
		// TODO Auto-generated method stub
		Movie movie=movierepo.findById(id).orElseThrow(()->new IllegalArgumentException("movie not found"));
		movierepo.delete(movie);
		return "movie deleted successfully";
	}

	@Override
	public String deletemovie(Movie movie) {
		// TODO Auto-generated method stub
		movierepo.delete(movie);
		return "record deleted";
	}

	@Override
	public String removeallmovies() {
		// TODO Auto-generated method stub
		long count=movierepo.count();
		
		if(count!=0)
			movierepo.deleteAll();
		return "no of records deleted"+count ;
	}

	@Override
	public String deleteallbyids(List<Integer> ids) {
		// TODO Auto-generated method stub
		 
		
		Iterable<Movie> it=movierepo.findAllById(ids);
		long count=((List<Movie>) it).size();
		if(ids.size()!=0&&count==ids.size()) {
			movierepo.deleteAllById(ids);
		return ((List<Movie>) it).size()+"no of records deleted";
		}
		else {
			return"no ids to given deleted or some ids are not available to deleted";
		}
		
	}	

	

	
	/*
	@Override
	public Movie findsingleid(int mid) {
		// TODO Auto-generated method stub
		return movierepo.findById(mid).orElseThrow(()->new IllegalArgumentException("receords not found"));
	}

	
	@Override
	public Optional<?> gathermoviebyid(int mid) {
		// TODO Auto-generated method stub
		Optional<Movie> opt=movierepo.findById(mid);
		if(opt.isEmpty()) {
			return Optional.empty();
		}
		else
			return opt;
	}
	

	@Override
	public Movie findsingleid1(int mid) {
		// TODO Auto-generated method stub
		return movierepo.findById(mid).orElse(new Movie());//if record is present return entity obj
		                                                  //otherwise empty entity obj
	}
*/

	
}
