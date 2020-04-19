package com.prueba.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Schedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer idDoctor;
	private String attentionDate;
	private String startTime;
	private String endTime;
	private Integer appointmentQty;
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;

	@OneToMany(targetEntity = Appointment.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "idSchedule", referencedColumnName = "id")
	List<Appointment> appointment;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(Integer idDoctor) {
		this.idDoctor = idDoctor;
	}

	public String getAttentionDate() {
		return attentionDate;
	}

	public void setAttentionDate(String attentionDate) {
		this.attentionDate = attentionDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Integer getAppointmentQty() {
		return appointmentQty;
	}

	public void setAppointmentQty(Integer appointmentQty) {
		this.appointmentQty = appointmentQty;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public List<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppointment(List<Appointment> appointment) {
		this.appointment = appointment;
	}

}
