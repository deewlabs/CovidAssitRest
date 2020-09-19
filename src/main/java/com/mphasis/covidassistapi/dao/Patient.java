package com.mphasis.covidassistapi.dao;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.id.IdentityGenerator;

@Entity
@Table(name="PatientInfo")
public class Patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer patientId ;
	private String  name;
	private Integer age;
	private String  sex;
	private String  address ;
	private Double  lattitude;
	private Double longitude;
	private String contactNo;
	private String emergencyContactNo;
	private String emailId;
	private String medicalCondition;
	private String covidSympton;
	private String severity;
	private String ambulanceRequired;
	private String  hospitalRequired;
	private String  internationalTravel;
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getLattitude() {
		return lattitude;
	}
	public void setLattitude(Double lattitude) {
		this.lattitude = lattitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmergencyContactNo() {
		return emergencyContactNo;
	}
	public void setEmergencyContactNo(String emergencyContactNo) {
		this.emergencyContactNo = emergencyContactNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMedicalCondition() {
		return medicalCondition;
	}
	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}
	public String getCovidSympton() {
		return covidSympton;
	}
	public void setCovidSympton(String covidSympton) {
		this.covidSympton = covidSympton;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getAmbulanceRequired() {
		return ambulanceRequired;
	}
	public void setAmbulanceRequired(String ambulanceRequired) {
		this.ambulanceRequired = ambulanceRequired;
	}
	public String getHospitalRequired() {
		return hospitalRequired;
	}
	public void setHospitalRequired(String hospitalRequired) {
		this.hospitalRequired = hospitalRequired;
	}
	public String getInternationalTravel() {
		return internationalTravel;
	}
	public void setInternationalTravel(String internationalTravel) {
		this.internationalTravel = internationalTravel;
	}
	
	
	
	

}
