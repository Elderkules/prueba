package com.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.model.Doctor;
import com.prueba.model.Patient;
import com.prueba.model.User;
import com.prueba.service.DoctorService;
import com.prueba.service.PatientService;
import com.prueba.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService service;
	@Autowired
	private DoctorService dService;
	@Autowired
	private PatientService pService;
	
	@GetMapping
	public ResponseEntity<List <User>> getAll(){
		return new ResponseEntity<>(service.getAll(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<User> create(@RequestBody User user) {
		return new ResponseEntity<>(service.createUser(user),HttpStatus.CREATED);
	} 
	
	@PostMapping("/{idUser}/doctor")
	public ResponseEntity<Doctor> createDoc(@PathVariable("idUser") Integer id, @RequestBody Doctor doctor) {
		return new ResponseEntity<>(dService.createDoctor(id, doctor), HttpStatus.CREATED);
	}
	@PostMapping("/{idUser}/patient")
	public ResponseEntity<Patient> createPat(@PathVariable("idUser") Integer id, @RequestBody Patient patient) {
		return new ResponseEntity<>(pService.createPatient(id, patient), HttpStatus.CREATED);
	}
	
	
	@PutMapping("/{idUser}")
	public ResponseEntity<User> update(@PathVariable("idUser") Integer id, @RequestBody User user) {
	return new ResponseEntity<>(service.update(id, user), HttpStatus.CREATED);
	}
	
	@GetMapping("/{idUser}")
	public ResponseEntity<User> getById(@PathVariable("idUser") Integer id) {
	return new ResponseEntity<>(service.getById(id).get(), HttpStatus.OK);
	}
	@GetMapping("/{name}/{lastName}")
	public ResponseEntity<List<User>> getByName(@PathVariable("name") String name, @PathVariable("lastName") String lastName) {
	return new ResponseEntity<>(service.getByName(name, lastName), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable ("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	

	
}
