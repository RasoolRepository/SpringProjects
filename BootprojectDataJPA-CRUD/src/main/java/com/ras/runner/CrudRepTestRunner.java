package com.ras.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ras.entity.Movie;
import com.ras.service.IMoviemgmtservice;

@Component
public class CrudRepTestRunner implements CommandLineRunner {
	@Autowired
	private IMoviemgmtservice movieservice;


	@Override
	public void run(String... args) throws Exception {
		
		/*Movie movie=new Movie();
		movie.setMname("Bahubali");
		movie.setRating(4.5f);
		movie.setYear("2022");
		try {
			System.out.println(movieservice.registermovie(movie));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			System.out.println("movies count::"+movieservice.fetchmoviescount());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			System.out.println("check movie id is available or not"+movieservice.checkmoviebyid(2));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			Iterable<Movie> itr=movieservice.findall();
			//for each method
			//itr.forEach(movie->System.out.println(movie));
			//for each method +method reference
			//itr.forEach(System.out::println);
			//enhanced for 
			/*for(Movie m:itr) {
				System.out.println(m);
		
			}
			//stream api+foreach+method refernce
			Arrays.asList(itr).stream().forEach(System.out::println);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			List<Integer> list=new ArrayList<>();
			list.add(1);
			list.add(101);
			System.out.println("emps list:;"+movieservice.findallbyids(list));
			System.out.println("emps list by ids"+movieservice.findallbyids(List.of(1,101)));//java 9
			System.out.println("emps list by ids"+movieservice.findallbyids(Arrays.asList(1,101)));//java 9
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			Optional<?> opt=movieservice.gathermoviebyid(10);
			if (opt.isEmpty()) {
				System.out.println(opt.get());
				
			}
			else
				System.out.println("record not found");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		
	}
		
		System.out.println("updated details");
		try {
			Movie movie=new Movie("RRR","2022",9.6f);
			movie.setMid(101);
			String res=movieservice.updatemovie(movie);
			System.out.println(res);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("delete by id");
		try {
			System.out.println(movieservice.deletebyid(2));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("deleted by movie");
		
		try {
			Movie movie=new Movie();
			movie.setMid(1);
			movieservice.deletemovie(movie);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("remove all movies");
		try {
			System.out.println(movieservice.removeallmovies());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			System.out.println("find by movieid::"+movieservice.findsingleid(10));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("saveall methods....");
		try {
			String res=movieservice.groupmovieregistration(List.of(new Movie("RRR","2022",7.8f),
				                                             new Movie("avsr","2021",8.0f)));
			System.out.println(res);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/
		try {
			System.out.println(movieservice.deleteallbyids(List.of(952,953)));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
