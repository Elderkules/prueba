package com.prueba.service;

import java.util.List;
import java.util.Optional;

import com.prueba.model.Doctor;

public interface DoctorService {

	
	Doctor createDoctor(Integer idUser, Doctor doctor);
	List <Doctor> getAll();
	Optional <Doctor> getById(Integer id);
	List<Doctor>getBySpecialty(String specialty);
	Doctor update(Integer id, Doctor Doctor);
	void delete(Integer id);

}
