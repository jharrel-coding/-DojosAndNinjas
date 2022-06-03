package com.example.dojosandninjas.repsitories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.dojosandninjas.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long>{
	List<Ninja> findAll();

}
