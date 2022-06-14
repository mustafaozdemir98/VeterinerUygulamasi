package com.java.project.vetApp2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.java.project.vetApp2.entities.Pets;


public interface IPetsRepository extends JpaRepository<Pets,Integer>{
	@Query("SELECT p FROM Pets p WHERE p.name LIKE %?1%"
		   +"OR p.petowner LIKE %?1%"	
		   +"OR p.kind LIKE %?1%"
		   +"OR p.breed LIKE %?1%"
		   +"OR p.petowner LIKE %?1%"
		   +"OR p.explanation LIKE %?1%"
		   )
	public List<Pets> getAllPets(String keyword);

}
