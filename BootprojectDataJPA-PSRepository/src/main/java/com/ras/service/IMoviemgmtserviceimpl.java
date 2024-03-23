package com.ras.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
	public Iterable<Movie> displaymoviesbyorder(boolean asc, String... properties) {
		// TODO Auto-generated method stub
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC, properties);
		return movierepo.findAll(sort);
	}

	@Override
	public Page<Movie> generatereport(int pageno, int pagesize, boolean asc, String... props) {
		// TODO Auto-generated method stub
		//create pageable obj
		Pageable pageable=PageRequest.of(pageno, pagesize, Sort.by(asc?Direction.ASC:Direction.DESC, props));
		//get requested page records
		Page<Movie> page=movierepo.findAll(pageable);
		return page;
	}

	@Override
	public void generatemoviereports(int pagesize) {
		// TODO Auto-generated method stub
		//get count of the records
		 
		
	}

	
}
