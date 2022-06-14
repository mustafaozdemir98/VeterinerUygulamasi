package com.java.project.vetApp2.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.java.project.vetApp2.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	@Query("SELECT u FROM User u WHERE u.username= :username")
	public User getUserByUsername(@Param("username") String username);
	
	@Query(""+
	"SELECT CASE WHEN COUNT(u)>0 THEN "+
	"TRUE ELSE FALSE END "+
	"FROM User u "+
	"WHERE u.username = ?1")
	Boolean selectExistUsername(String username);
}
