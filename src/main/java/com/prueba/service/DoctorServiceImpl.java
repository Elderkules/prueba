package com.prueba.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.dao.DoctorRepository;
import com.prueba.model.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepository repository;

	@Override
	public Doctor createDoctor(Integer idUser, Doctor doctor) {
		doctor.setIdUser(idUser);
		doctor.setCreationDate(new Date());
		return repository.save(doctor);
	}

	@Override
	public List<Doctor> getAll() {

		return repository.findAll();
	}

	@Override
	public Optional<Doctor> getById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public Doctor update(Integer id, Doctor doctor) {
		Doctor doctorDB = getById(id).get();
		doctorDB.setAppointments(doctor.getAppointments());
		doctorDB.setExperience(doctor.getExperience());
		doctorDB.setLenguages(doctor.getLenguages());
		doctorDB.setLocation(doctor.getLocation());
		doctorDB.setPrice(doctor.getPrice());
		doctorDB.setProfessionalLicense(doctor.getProfessionalLicense());
		doctorDB.setSchedules(doctor.getSchedules());
		doctorDB.setSpecialty(doctor.getSpecialty());
		return repository.save(doctorDB);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public List<Doctor> getBySpecialty(String specialty) {
		return repository.getBySpecialty(specialty);
	}
}
