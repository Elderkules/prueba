package com.prueba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.dao.ScheduleRepository;
import com.prueba.model.Appointment;
import com.prueba.model.Schedule;

@Service
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	private ScheduleRepository repository;

	
	@Override
	public Schedule createSchedule(Integer idDoctor, Schedule schedule) {
		schedule.setIdDoctor(idDoctor);
		return repository.save(schedule);
	}
	
	
	@Override
	public List<Schedule> getAll() {

		return repository.findAll();
	}

	@Override
	public Optional<Schedule> getById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public Schedule update(Integer id, Schedule schedule) {
		Schedule scheduleDB = getById(id).get();
		scheduleDB.setAttentionDate(schedule.getAttentionDate());
		scheduleDB.setEndTime(schedule.getEndTime());
		scheduleDB.setStartTime(schedule.getStartTime());
		return repository.save(scheduleDB);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
