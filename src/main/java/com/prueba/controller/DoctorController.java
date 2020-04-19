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
import com.prueba.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	private DoctorService service;

	@GetMapping
	public ResponseEntity<List<Doctor>> getAll() {
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Doctor> getById(@PathVariable ("id") Integer id) {
		return new ResponseEntity<>(service.getById(id).get(), HttpStatus.OK);
	}
	
	@GetMapping("/{specialty}")
	public ResponseEntity<List<Doctor>> getBySpecialty(@PathVariable ("specialty") String specialty) {
		return new ResponseEntity<>(service.getBySpecialty(specialty), HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable ("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}


}
