package com.java.project.vetApp2.controller;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.java.project.vetApp2.business.*;
import com.java.project.vetApp2.entities.Pets;

@Controller
public class PetsController {
	private IPetsService petsService;

	public PetsController(IPetsService petsService) {
		super();
		this.petsService = petsService;
	}


	
	@GetMapping("/pets")
	public String listPets(Model model,@Param("keyword") String keyword) {
		/* String keyword = "cat"; */
		model.addAttribute("pets", petsService.getAllPets(keyword));
		model.addAttribute("keyword", keyword);
		return "pets";
	}

	@GetMapping("/pets/new")
	public String createPetForm(Model model) {

		// create pet object to hold pet form data
		Pets pets = new Pets();
		model.addAttribute("pets", pets);
		return "create_pets";

	}

	@PostMapping("/pets")
	public String savePets(@ModelAttribute("pets") Pets pets) {
		petsService.savePets(pets);
		return "redirect:/pets";
	}

	@GetMapping("/pets/edit/{id}")
	public String editPetsForm(@PathVariable int id, Model model) {
		model.addAttribute("pets", petsService.getPetsById(id));
		return "edit_pets";
	}

	@PostMapping("/pets/{id}")
	public String updatePets(@PathVariable int id, @ModelAttribute("pets") Pets pets, Model model) {
		// get pets from database by id
		Pets existingPets = petsService.getPetsById(id);
		existingPets.setId(id);
	    existingPets.setPetowner(pets.getPetowner());
		existingPets.setKind(pets.getKind());
		existingPets.setBreed(pets.getBreed());
		existingPets.setName(pets.getName());
		existingPets.setAge(pets.getAge());
		existingPets.setExplanation(pets.getExplanation());
		;
		// save updated pets object
		petsService.updatePets(existingPets);
		return "redirect:/pets";
	}

	// handler method to handle delete pets request

	
	
	  @GetMapping("/pets/delete/{id}") 
	  public String deletePets(@PathVariable int id) {
	  petsService.deletePetsById(id); 
	  return "redirect:/pets"; }
	 
	  @GetMapping("/403")
	  public String error403() {
		  return "403";
	  }

}


