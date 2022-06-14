package com.java.project.vetApp2.controller;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.java.project.vetApp2.business.*;
import com.java.project.vetApp2.entities.PetOwners;


@Controller
public class PetOwnersController {
	private IPetOwnersService petOwnersService;

	public PetOwnersController(IPetOwnersService petOwnersService) {
		super();
		this.petOwnersService = petOwnersService;
	}
	
	
	@GetMapping("/petowners")
	public String listPetOwners(Model model,@Param("keyword") String keyword) {
		/* String keyword = "konya"; */
		model.addAttribute("petowners", petOwnersService.getAllPetOwners(keyword));
		model.addAttribute("keyword", keyword);
		return "petowners";
	}
	
	@GetMapping("/petowners/new")
	public String createPetOwnersForm(Model model) {
		
		// create pet object to hold pet form data
		PetOwners petOwners = new PetOwners();
		model.addAttribute("petowners", petOwners);
		return "create_petowners";
		
	}
	
	@PostMapping("/petowners")
	public String savePetOwners(@ModelAttribute("petowners") PetOwners petOwners) {
		petOwnersService.savePetOwners(petOwners);
		return "redirect:/petowners";
	}
	
	@GetMapping("/petowners/edit/{id}")
	public String editPetOwnersForm(@PathVariable int id,Model model) {
		model.addAttribute("petowners", petOwnersService.getPetOwnersById(id));
		return "edit_petOwners";
	}
	
	@PostMapping("/petowners/{id}")
	public String updatePetOwners(@PathVariable int id, @ModelAttribute("petowners") PetOwners petOwners, Model model) {
		// get petOwners from database by id
		PetOwners existingPetOwners = petOwnersService.getPetOwnersById(id);
		existingPetOwners.setId(id);
		existingPetOwners.setNameSurname(petOwners.getNameSurname());
		existingPetOwners.setAddress(petOwners.getAddress());
		existingPetOwners.setTelephone(petOwners.getTelephone());
		existingPetOwners.setePosta(petOwners.getePosta());
		;
		// save updated pets object
		petOwnersService.updatePetOwners(existingPetOwners);
		return "redirect:/petowners";
	}
	
	// handler method to handle delete pets request
	
	@GetMapping("/petowners/delete/{id}")
	public String deletePetOwners(@PathVariable int id) {
		petOwnersService.deletePetOwnersById(id);
		return "redirect:/petowners";
	}

	
}
	

