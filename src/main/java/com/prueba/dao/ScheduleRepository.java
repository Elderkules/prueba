package com.prueba.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.model.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer>{

}
