package com.java.project.vetApp2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.java.project.vetApp2.business.PetOwnersManager;
import com.java.project.vetApp2.entities.PetOwners;
import com.java.project.vetApp2.repository.IPetOwnersRepository;

@ExtendWith(MockitoExtension.class)
public class PetOwnersManagerTests {
	
	@Mock private IPetOwnersRepository petOwnersRepository;
	private PetOwnersManager underTest;
	
	
	@BeforeEach 
	void setUp() {
		underTest = new PetOwnersManager(petOwnersRepository);
	}
	
	@Test
	void canAddPetOwners() {
		// given
		PetOwners petOwners = new PetOwners(
				"ali çelik","konya","1234567","12345@gmail.com"
				);
		// when
		underTest.savePetOwners(petOwners);
		
		//then
		ArgumentCaptor<PetOwners> petsArgumentCaptor = ArgumentCaptor.forClass(PetOwners.class);
		
		verify(petOwnersRepository).save(petsArgumentCaptor.capture());
		
		PetOwners capturedPets = petsArgumentCaptor.getValue();
		
		assertThat(capturedPets).isEqualTo(petOwners);
				
		
	}
	
	
	@Test
	void canGetAllPetOwners() {
		// when
		underTest.getAllPetOwners(null);
		// then
		verify(petOwnersRepository).findAll();
		// 
		
	}
	

	

}
