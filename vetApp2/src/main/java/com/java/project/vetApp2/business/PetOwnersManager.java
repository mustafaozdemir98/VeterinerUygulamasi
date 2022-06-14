package com.java.project.vetApp2.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.project.vetApp2.entities.PetOwners;
import com.java.project.vetApp2.repository.IPetOwnersRepository;

@Service
public class PetOwnersManager implements IPetOwnersService{

	private IPetOwnersRepository petOwnersRepository;
	
	public PetOwnersManager(IPetOwnersRepository petOwnersRepository) {
		super();
		this.petOwnersRepository = petOwnersRepository;
	}

	@Override
	public List<PetOwners> getAllPetOwners(String keyword) {
		if(keyword != null) {
			return petOwnersRepository.getAllPetOwners(keyword);
		}
		return petOwnersRepository.findAll();
	}

	@Override
	public PetOwners savePetOwners(PetOwners petOwners) {
		return petOwnersRepository.save(petOwners);
	}

	@Override
	public PetOwners getPetOwnersById(int id) {
		return petOwnersRepository.findById(id).get();
	}

	@Override
	public PetOwners updatePetOwners(PetOwners petOwners) {
		return petOwnersRepository.save(petOwners);
	}

	@Override
	public void deletePetOwnersById(int id) {
		petOwnersRepository.deleteById(id);
		
	}

	
}
