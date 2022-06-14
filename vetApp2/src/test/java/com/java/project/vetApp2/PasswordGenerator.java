package com.java.project.vetApp2;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

	
	  public static void main(String[] args) { BCryptPasswordEncoder encoder = new
	  BCryptPasswordEncoder(); String rawPassword = "murat1"; 
	  
	  String encodedPassword = encoder.encode(rawPassword);
	  
	  System.out.println(encodedPassword);
	  
	  }
	 

}
