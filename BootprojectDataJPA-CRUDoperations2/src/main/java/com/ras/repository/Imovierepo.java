package com.ras.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ras.entity.Movie;
@Repository("movierepo")
public interface Imovierepo extends CrudRepository<Movie,Integer> {

}
