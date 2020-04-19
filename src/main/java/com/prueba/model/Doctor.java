package com.prueba.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer idUser;
	private Integer specialty;
	private String professionalLicense;
	private String location;
	private String experience;
	private String lenguages;
	private Integer price;
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;
	
	
	
	@OneToMany(targetEntity = Schedule.class,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "idDoctor", referencedColumnName = "id")
	private List<Schedule> schedules;
	
	@OneToMany(targetEntity = Appointment.class,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "idDoctor", referencedColumnName = "id")
	private List<Appointment> appointments;
	
	
	public List<Schedule> getSchedules() {
		return schedules;
	}

	public void setSchedules(List<Schedule> schedules) {
		this.schedules = schedules;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public Doctor() {}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Integer specialty) {
		this.specialty = specialty;
	}

	public String getProfessionalLicense() {
		return professionalLicense;
	}

	public void setProfessionalLicense(String professionalLicense) {
		this.professionalLicense = professionalLicense;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getLenguages() {
		return lenguages;
	}

	public void setLenguages(String lenguages) {
		this.lenguages = lenguages;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	

}