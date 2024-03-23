package com.ras.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.ras.entity.Movie;
import com.ras.service.IMoviemgmtservice;

@Component
public class CrudRepTestRunner implements CommandLineRunner {
	@Autowired
	private IMoviemgmtservice movieservice;

	@Override
	public void run(String... args) throws Exception {
		/*
		System.out.println("........ for delete by batch ids ");
		try {
			/*List<Integer> it=new ArrayList<>();
			it.add(9);
			it.add(null);//one way deleteding
			
			List<Integer> it=Arrays.asList(null,4);
			String li=movieservice.removemoviebyids(it);
			System.out.println(li);
			
		} 
		catch(NullPointerException ne){
			System.out.println("id(s) must be not null");
			ne.printStackTrace();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}


		System.out.println("......find all.....");
		try {
			Movie movie=new Movie();
			//movie.setMid(5);
			//movie.setMname("rani");
			movie.setYear("2021");
			//movie.setRating(8.9f);
			List<Movie> list=movieservice.searchmoviebymovie(movie, true, "mname","year");
			list.forEach(System.out::println);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/
		System.out.println("..............get by id..........");
		try {
			Movie movie=movieservice.searchmoviebyid(1);
			System.out.println();
			System.out.println(movie);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();		}

}
		


}
