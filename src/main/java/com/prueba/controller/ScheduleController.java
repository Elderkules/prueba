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

import com.prueba.model.Doctor;
import com.prueba.model.Schedule;
import com.prueba.model.User;
import com.prueba.service.ScheduleService;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {
	
	@Autowired
	private ScheduleService service;
	
	@PostMapping("/{idDoctor}")
	public ResponseEntity<Schedule> create(@PathVariable ("idDoctor")Integer id, @RequestBody Schedule schedule) {
		return new ResponseEntity<>(service.createSchedule(id, schedule),HttpStatus.CREATED);
	} 

	@GetMapping
	public ResponseEntity<List<Schedule>> getAll() {
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Schedule> getById(@PathVariable ("id") Integer id) {
		return new ResponseEntity<>(service.getById(id).get(), HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable ("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
