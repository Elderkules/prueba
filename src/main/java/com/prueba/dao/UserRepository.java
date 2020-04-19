package com.prueba.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.prueba.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	@Query(value = "select * from user where name = ? and lastName = ? ", nativeQuery = true)
	List<User>getByName(String name, String lastName);
	
}
