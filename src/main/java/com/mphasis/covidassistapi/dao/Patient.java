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
	private String  firstName;
	private String  lastName ;
	private Integer age;
	private String  sex;
	private String  addressLine1 ;
	private String  addressLine2 ;
	private Double  lattitude;
	private Double longitude;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pastMedConId")
	private PastMedicalCondition medicalCondtion;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="symptonId")
	private CovidSympton  covidSympton;
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
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
	public PastMedicalCondition getMedicalCondtion() {
		return medicalCondtion;
	}
	public void setMedicalCondtion(PastMedicalCondition medicalCondtion) {
		this.medicalCondtion = medicalCondtion;
	}
	public CovidSympton getCovidSympton() {
		return covidSympton;
	}
	public void setCovidSympton(CovidSympton covidSympton) {
		this.covidSympton = covidSympton;
	}
	

}
