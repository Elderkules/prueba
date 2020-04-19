package com.prueba.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String lastName;
	private String gender;
	@Column(nullable = false ,unique = true)
	private String email;
	private String dateOfBirth;
	private String password;
	private String celphone;
	private String profilePicture;
	private Integer userType;
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;
	
	@OneToMany(targetEntity = Doctor.class,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "idUser", referencedColumnName = "id")
	private List<Doctor> doctor; 




	@OneToMany(targetEntity = Patient.class,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "idUser", referencedColumnName = "id")
	private List<Patient> patient; 
	
	public User() {}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCelphone() {
		return celphone;
	}

	public void setCelphone(String celphone) {
		this.celphone = celphone;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}


	public List<Doctor> getDoctor() {
		return doctor;
	}


	public void setDoctor(List<Doctor> doctor) {
		this.doctor = doctor;
	}
	public List<Patient> getPatient() {
		return patient;
	}


	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}






}
