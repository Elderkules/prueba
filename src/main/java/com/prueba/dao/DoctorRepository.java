package com.prueba.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prueba.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer>{
	@Query(value = "select * from doctor where specialty = ?", nativeQuery = true)
	List<Doctor>getBySpecialty(String specialty);
	
	
	

}
