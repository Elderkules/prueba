package com.prueba.service;

import java.util.List;
import java.util.Optional;

import com.prueba.model.Doctor;
import com.prueba.model.User;


public interface UserService {
	
	User createUser(User user);
	List <User> getAll();
	Doctor crearDoc(Integer idUser,Doctor doctor);
	List<User>getByName(String name, String lastName);
	Optional <User> getById(Integer id);
	User update(Integer id, User user);
	void delete(Integer id);

}
