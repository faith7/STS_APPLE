package com.yoon.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface AlienRepo extends CrudRepository<Alien, Integer> {
	public List<Alien> findById(int id);
}
