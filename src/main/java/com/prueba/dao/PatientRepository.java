package com.prueba.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{

}
