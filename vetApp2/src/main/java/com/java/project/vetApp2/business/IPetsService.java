package com.java.project.vetApp2.business;

import java.util.List;

import com.java.project.vetApp2.entities.Pets;

public interface IPetsService {

	
	public List<Pets> getAllPets(String keyword);

	
	Pets savePets(Pets pets);
	
	Pets getPetsById(int id);
	Pets updatePets(Pets pets);
	
	void deletePetsById(int id);
}
