package com.java.project.vetApp2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.java.project.vetApp2.business.PetsManager;
import com.java.project.vetApp2.entities.Pets;
import com.java.project.vetApp2.repository.IPetsRepository;

@ExtendWith(MockitoExtension.class)
public class PetsManagerTests {
	
	@Mock private IPetsRepository petsRepository;
	private PetsManager underTest;
	
	
	@BeforeEach 
	void setUp() {
		underTest = new PetsManager(petsRepository);
	}
	
	@Test
	void canAddPets() {
		// given
		Pets pets = new Pets(
				"ali","cat","van cat","minnak","1","kedi"
				);
		// when
		underTest.savePets(pets);
		
		//then
		ArgumentCaptor<Pets> petsArgumentCaptor = ArgumentCaptor.forClass(Pets.class);
		
		verify(petsRepository).save(petsArgumentCaptor.capture());
		
		Pets capturedPets = petsArgumentCaptor.getValue();
		
		assertThat(capturedPets).isEqualTo(pets);
				
		
	}
	
	
	@Test
	void canGetAllPets() {
		// when
		underTest.getAllPets(null);
		// then
		verify(petsRepository).findAll();
		// 
		
	}
	

	

}
