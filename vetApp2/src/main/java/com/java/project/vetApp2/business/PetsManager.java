package com.java.project.vetApp2.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.project.vetApp2.entities.Pets;
import com.java.project.vetApp2.repository.IPetsRepository;

@Service
public class PetsManager implements IPetsService{

	private IPetsRepository petsRepository;
	
	public PetsManager(IPetsRepository petsRepository) {
		super();
		this.petsRepository = petsRepository;
	}

	@Override
	public List<Pets> getAllPets(String keyword) {
		if(keyword != null) {
			return petsRepository.getAllPets(keyword);
		}
		return petsRepository.findAll();
	}

	@Override
	public Pets savePets(Pets pets) {
		return petsRepository.save(pets);
	}

	@Override
	public Pets getPetsById(int id) {
		return petsRepository.findById(id).get();
	}

	@Override
	public Pets updatePets(Pets pets) {
		return petsRepository.save(pets);
	}

	@Override
	public void deletePetsById(int id) {
		petsRepository.deleteById(id);
		
	}



	
}
