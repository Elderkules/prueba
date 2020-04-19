package com.prueba.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.prueba.model.Appointment;

public interface AppointmentRepository extends JpaRepository <Appointment, Integer>{

}


