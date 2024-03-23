package com.ras.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.ras.entity.Movie;

public interface IMoviemgmtservice {
	//one method can have only one var arg param that to last param of the method
	//var args r internally arrays
	public Iterable<Movie> displaymoviesbyorder(boolean asc,String...properties);
	public Page<Movie> generatereport(int pageno,int pagesize,boolean asc,String...props);
	public void generatemoviereports(int pagesize);
    
    
}
