package com.java.project.vetApp2.business;

import java.util.List;

import com.java.project.vetApp2.entities.PetOwners;

public interface IPetOwnersService {
	List<PetOwners> getAllPetOwners(String keyword);
	
    PetOwners savePetOwners(PetOwners petOwners);
	
    PetOwners getPetOwnersById(int id);
    PetOwners updatePetOwners(PetOwners petOwners);
	
	void deletePetOwnersById(int id);
}
