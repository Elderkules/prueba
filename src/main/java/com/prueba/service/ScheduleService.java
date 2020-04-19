package com.prueba.service;

import java.util.List;
import java.util.Optional;

import com.prueba.model.Schedule;

public interface ScheduleService {

	Schedule createSchedule(Integer idDoctor, Schedule schedule);
	List <Schedule> getAll();
	Optional <Schedule> getById(Integer id);
	Schedule update(Integer id, Schedule schedule);
	void delete(Integer id);
}
