package com.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.prueba.model.Patient;
import com.prueba.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	
		@Autowired
		private PatientService service;

		@GetMapping
		public ResponseEntity<List<Patient>> getAll() {
			return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
		}
		@GetMapping("/{id}")
		public ResponseEntity<Patient> getById(@PathVariable ("id") Integer id) {
			return new ResponseEntity<>(service.getById(id).get(), HttpStatus.OK);
		}
		
		@DeleteMapping("/{id}")
		public ResponseEntity<Void> delete(@PathVariable ("id") Integer id) {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
}
