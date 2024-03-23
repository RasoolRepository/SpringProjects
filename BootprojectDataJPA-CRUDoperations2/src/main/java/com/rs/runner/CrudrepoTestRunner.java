package com.rs.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ras.entity.Movie;
import com.ras.service.IMoviemgmtservice;

@Component
public class CrudrepoTestRunner implements CommandLineRunner {
	
	@Autowired
	private IMoviemgmtservice service;
 
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Movie movie=new Movie();
		movie.setMname("RRR");
		movie.setYear("2022");
		movie.setRating(4.5f);
		try {
			System.out.println(service.registermovie(movie));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
