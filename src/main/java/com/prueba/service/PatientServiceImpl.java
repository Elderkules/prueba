package com.prueba.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.dao.PatientRepository;
import com.prueba.model.Patient;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository repository;

	@Override
	public Patient createPatient(Integer idUser,Patient patient) {
		patient.setIdUser(idUser);
		patient.setCreationDate(new Date());
		return repository.save(patient);
	}

	@Override
	public List<Patient> getAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Patient> getById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public Patient update(Integer id, Patient patient) {
		Patient patientDB = getById(id).get();
		patientDB.setAppointments(patient.getAppointments());
		return repository.save(patientDB);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
