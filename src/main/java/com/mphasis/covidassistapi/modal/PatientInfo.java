package com.mphasis.covidassistapi.modal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PatientInfo {
	
	@JsonProperty("name")
	private String  name;
	@JsonProperty("age")
	private Integer age;
	@JsonProperty("sex")
	private String  sex;
	@JsonProperty("address")
	private String  address ;
	@JsonProperty("lattitude")
	private Double  lattitude;
	@JsonProperty("longitude")
	private Double longitude;
	@JsonProperty("contactNo")
	private String contactNo;
	@JsonProperty("emergencyContactNo")
	private String emergencyContactNo;
	@JsonProperty("emailId")
	private String emailId;
	@JsonProperty("medicalCondition")
	private String medicalCondition;
	@JsonProperty("covidSympton")
	private String covidSympton;
	@JsonProperty("severity")
	private String severity;
	@JsonProperty("ambulanceRequired")
	private String ambulanceRequired;
	@JsonProperty("hospitalRequired")
	private String  hospitalRequired;
	@JsonProperty("internationalTravel")
	private String  internationalTravel;
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
