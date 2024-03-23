package com.ras.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ras.entity.Movie;
import com.ras.repository.Imovierepo;

@Service("service")
public class IMoviemgmtserviceimpl implements IMoviemgmtservice {
	@Autowired
	private Imovierepo movierepo;//injects dynamicaly generated proxy cls object
	
	

	@Override
	public String registermovie(Movie movie) {
		System.out.println("inmemory proxy cls name:: "+movierepo.getClass()+"......"+Arrays.toString(movierepo.getClass().getInterfaces()));
		// TODO Auto-generated method stub
		System.out.println("before saving::"+movie);
		Movie movie1=movierepo.save(movie);
		System.out.println("after saving::"+movie1);
		return "movie registered with id value ::"+movie1.getMid();
	}

}
