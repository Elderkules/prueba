package com.prueba.service;

import java.util.List;
import java.util.Optional;

import com.prueba.model.Patient;

public interface PatientService {

	Patient createPatient(Integer idUser, Patient patient);
	List <Patient> getAll();
	Optional <Patient> getById(Integer id);
	Patient update(Integer id, Patient patient);
	void delete(Integer id);

}
