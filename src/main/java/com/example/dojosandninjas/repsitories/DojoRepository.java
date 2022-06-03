package com.example.dojosandninjas.repsitories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.dojosandninjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
	List<Dojo> findAll();
}
