package com.example.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dojosandninjas.models.Ninja;
import com.example.dojosandninjas.repsitories.NinjaRepository;

@Service
public class NinjaServices {
	@Autowired
	private NinjaRepository ninjaRepository;
//	******Create******
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}

	
//	******Read ONE******
	public Ninja findNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
		return optionalNinja !=null ? optionalNinja.get() : null;
	}
	
//	******Read ALL******
	public List<Ninja> allNinjas()	{
		return ninjaRepository.findAll();
	}
	
//	******Update******
	public void updateNinja(Ninja ninja) {
		ninjaRepository.save(ninja);
	}
//	******Destroy/Delete******
	public void deleteNinja(Long id) {
		ninjaRepository.deleteById(id);
	}
}
