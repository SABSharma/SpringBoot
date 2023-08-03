package com.springboot.jpa.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springboot.jpa.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	public List<User>  findByName(String name);
	
	@Query("Select u from User u")
	public List<User> getAllUser();
	
	@Query("Select u From User u where u.name =:n")
	public List<User> getUserByName(@Param("n")  String name);

}
