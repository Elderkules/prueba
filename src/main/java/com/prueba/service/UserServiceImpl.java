package com.prueba.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.dao.DoctorRepository;
import com.prueba.dao.UserRepository;
import com.prueba.model.Doctor;
import com.prueba.model.User;

import at.favre.lib.crypto.bcrypt.BCrypt;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;
	@Autowired
	private DoctorRepository dRepository;
	
	@Override
	public User createUser(User user) {
		user.setCreationDate(new Date());
		return repository.save(user);
	}

	@Override
	public List<User> getAll() {

		return repository.findAll();
	}

	@Override
	public Optional<User> getById(Integer id) {
		return repository.findById(id);
	}
	@Override
	public Doctor crearDoc(Integer idUser, Doctor doctor) {
		doctor.setIdUser(idUser);
		return dRepository.save(doctor);
	}

	@Override
	public User update(Integer id, User user) {
		User userDB = getById(id).get();
		userDB.setName(user.getName());
		userDB.setLastName(user.getLastName());
		userDB.setCelphone(user.getCelphone());
		userDB.setPassword(user.getPassword());
		userDB.setProfilePicture(user.getProfilePicture());
		userDB.setDoctor(user.getDoctor());
		userDB.setPatient(user.getPatient());
		return repository.save(userDB);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public List<User> getByName(String name, String lastName) {
		
		return repository.getByName(name, lastName);
	}

}
