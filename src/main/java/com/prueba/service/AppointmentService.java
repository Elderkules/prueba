package com.prueba.service;

import java.util.List;
import java.util.Optional;

import com.prueba.model.Appointment;


public interface AppointmentService {

	Appointment createAppointment(Integer idSchedule, Appointment appointment);
	List <Appointment> getAll();
	Optional <Appointment> getById(Integer id);
	Appointment update(Integer id, Appointment appointment);
	void delete(Integer id);
}
