package com.example.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dojosandninjas.models.Dojo;
import com.example.dojosandninjas.repsitories.DojoRepository;

@Service
public class DojoServices {
	@Autowired
	private DojoRepository dojoRepository;
//	******Create******
	public Dojo createDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
	}

	
//	******Read ONE******
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		return optionalDojo !=null ? optionalDojo.get() : null;
	}
//	******Read ALL******
	public List<Dojo> allDojos()	{
		return dojoRepository.findAll();
	}
//	******Update******
	public void updateDojo(Dojo dojo) {
		dojoRepository.save(dojo);
	}
//	******Destroy/Delete******
	public void deleteDojo(Long id) {
		dojoRepository.deleteById(id);
	}
}
