package com.ras.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.ras.entity.Movie;


public interface IMovierepo extends JpaRepository<Movie,Integer>{

}
