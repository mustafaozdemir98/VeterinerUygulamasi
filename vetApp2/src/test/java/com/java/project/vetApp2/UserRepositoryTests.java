package com.java.project.vetApp2;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.java.project.vetApp2.repository.UserRepository;

@DataJpaTest
public class UserRepositoryTests {
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	void CheckIfUsernameDoesNotExist() {
		// given
		
		
		String username = "mustafa";
		
		// when
		boolean expected = userRepository.selectExistUsername(username);
		
		//then
		assertThat(expected).isFalse();
	}
	

	
}
