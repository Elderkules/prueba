package com.prueba.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer idDoctor;
	private Integer idPatient;
	private Integer idSchedule;
	private String attentionDate;
	private String attentionTime;
	private Integer status;
	private String comments;
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;
	
	public Appointment() {}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAttentionDate() {
		return attentionDate;
	}
	public void setAttentionDate(String attentionDate) {
		this.attentionDate = attentionDate;
	}
	public String getAttentionTime() {
		return attentionTime;
	}
	public void setAttentionTime(String attentionTime) {
		this.attentionTime = attentionTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Integer getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(Integer idDoctor) {
		this.idDoctor = idDoctor;
	}

	public Integer getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(Integer idPatient) {
		this.idPatient = idPatient;
	}

	public Integer getIdSchedule() {
		return idSchedule;
	}

	public void setIdSchedule(Integer idSchedule) {
		this.idSchedule = idSchedule;
	}
	

}
