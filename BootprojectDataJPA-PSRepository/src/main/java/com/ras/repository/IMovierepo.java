package com.ras.repository;


import org.springframework.data.repository.PagingAndSortingRepository;


import com.ras.entity.Movie;


public interface IMovierepo extends PagingAndSortingRepository<Movie,Integer>{

}
