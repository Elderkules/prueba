package com.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.model.Appointment;
import com.prueba.model.Doctor;
import com.prueba.model.Schedule;
import com.prueba.service.AppointmentService;
import com.prueba.service.ScheduleService;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

	
	@Autowired
	private AppointmentService service;
	
	@PostMapping("/{idSchedule}")
	public ResponseEntity<Appointment> create(@PathVariable ("idSchedule")Integer id, @RequestBody Appointment appointment) {
		return new ResponseEntity<>(service.createAppointment(id, appointment),HttpStatus.CREATED);
	} 
	
	@GetMapping
	public ResponseEntity<List<Appointment>> getAll() {
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Appointment> getById(@PathVariable ("id") Integer id) {
		return new ResponseEntity<>(service.getById(id).get(), HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable ("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}