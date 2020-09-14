package com.mphasis.covidassistapi.modal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PatientInfo {
	
	@JsonProperty("patientId")
	private Integer patientId ;
	@JsonProperty("firstName")
	private String  firstName;
	@JsonProperty("lastName")
	private String  lastName ;
	@JsonProperty("age")
	private Integer age;
	@JsonProperty("sex")
	private String  sex;
	@JsonProperty("addresslin1")
	private String  addressLine1 ;
	@JsonProperty("addresslin2")
	private String  addressLine2 ;
	@JsonProperty("lattitude")
	private Double  lattitude;
	@JsonProperty("longitude")
	private Double longitude;
	@JsonProperty("symptonId")
	private Integer symptonId;
	@JsonProperty("medicalCondId")
	private Integer medicalCondId;
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
	public Integer getSymptonId() {
		return symptonId;
	}
	public void setSymptonId(Integer symptonId) {
		this.symptonId = symptonId;
	}
	public Integer getMedicalCondId() {
		return medicalCondId;
	}
	public void setMedicalCondId(Integer medicalCondId) {
		this.medicalCondId = medicalCondId;
	}
	
	

}
