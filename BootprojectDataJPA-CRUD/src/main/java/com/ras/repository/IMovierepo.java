package com.ras.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ras.entity.Movie;


public interface IMovierepo extends CrudRepository<Movie,Integer> {

}
