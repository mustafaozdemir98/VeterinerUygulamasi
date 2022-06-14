package com.java.project.vetApp2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.java.project.vetApp2.entities.*;

public interface IPetOwnersRepository extends JpaRepository<PetOwners,Integer>{
	@Query("SELECT p FROM PetOwners p WHERE "
			+ "CONCAT(p.nameSurname,p.address,p.telephone,p.ePosta)"
			+ "LIKE %?1%"
			   )
	public List<PetOwners> getAllPetOwners(String keyword);
}
