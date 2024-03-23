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
		// TODO Auto-generated method stub
		/*System.out.println("........Find Sort Method..............");
		Iterable<Movie> itr=movieservice.displaymoviesbyorder(true, "year","mname");
		itr.forEach(System.out::println);
		*/
		try {
			Page<Movie> page=movieservice.generatereport(3, 2, true,"mname");
			System.out.println("page number::"+page.getNumber());
			System.out.println("pages count::"+page.getTotalPages());
			System.out.println("is it first page"+page.isFirst());
			System.out.println("is it last page"+page.isLast());
			System.out.println(" page size::"+page.getSize());
			System.out.println("page elemnts count"+page.getNumberOfElements());
			if(!page.isEmpty()) {
			List<Movie> list=page.getContent();
			list.forEach(System.out::println);
			}
			else
				System.out.println("no page found");
				
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}


	
		


}
