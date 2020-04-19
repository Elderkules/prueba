package com.prueba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.dao.AppointmentRepository;
import com.prueba.model.Appointment;


@Service
public class AppointmentServiceImpl implements AppointmentService{
	
	@Autowired
	private AppointmentRepository repository;

	@Override
	public Appointment createAppointment(Integer idSchedule, Appointment appointment) {
		return repository.save(appointment);
	}

	@Override
	public List<Appointment> getAll() {

		return repository.findAll();
	}

	@Override
	public Optional<Appointment> getById(Integer id) {
		return repository.findById(id);
	}

	
	@Override
	public Appointment update(Integer id, Appointment appointment) {
		Appointment appointmentDB = getById(id).get();
		appointmentDB.setAttentionDate(appointment.getAttentionDate());
		appointmentDB.setAttentionTime(appointment.getAttentionTime());
		appointmentDB.setComments(appointment.getComments());
		return repository.save(appointmentDB);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	
	}
}



	

