package com.mphasis.covidassistapi.modal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HospitalInfo {

	@JsonProperty("hospitalId")
	public Integer hospitalId;
	
	public Integer getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(Integer hospitalId) {
		this.hospitalId = hospitalId;
	}

	@JsonProperty("hospitalName")
	private String hospitalName;
	
	@JsonProperty("hospitalAddress")
	private String hospitalAddress;
	
	@JsonProperty("lattitude")
	private Double lattitude;
	
	@JsonProperty("longitude")
	private Double longitude;
	
	@JsonProperty("contactNo")
	private String contactNo;
	
	@JsonProperty("emailId")
	private String emailId;
	
	@JsonProperty("numberOfAmbulance")
	private Integer totalAmbulance;
	
	
	@JsonProperty("totalIsolationBed")
	private Integer totalIsolationBed;
	
	
	@JsonProperty("totalIcu")
	private Integer totalIcu;
	
	
	@JsonProperty("totalOxygenUnit")
	private Integer totalOxygenUnit;
	
	@JsonProperty("totalVentilator")
	private Integer totalVentilator;
	
	@JsonProperty("ambulanceServiceAvailable")
	private String ambulanceServiceAvailable;
	
	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalAddress() {
		return hospitalAddress;
	}

	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Integer getTotalAmbulance() {
		return totalAmbulance;
	}

	public void setTotalAmbulance(Integer totalAmbulance) {
		this.totalAmbulance = totalAmbulance;
	}

	public Integer getTotalIsolationBed() {
		return totalIsolationBed;
	}

	public void setTotalIsolationBed(Integer totalIsolationBed) {
		this.totalIsolationBed = totalIsolationBed;
	}

	public Integer getTotalIcu() {
		return totalIcu;
	}

	public void setTotalIcu(Integer totalIcu) {
		this.totalIcu = totalIcu;
	}

	public Integer getTotalOxygenUnit() {
		return totalOxygenUnit;
	}

	public void setTotalOxygenUnit(Integer totalOxygenUnit) {
		this.totalOxygenUnit = totalOxygenUnit;
	}

	public Integer getTotalVentilator() {
		return totalVentilator;
	}

	public void setTotalVentilator(Integer totalVentilator) {
		this.totalVentilator = totalVentilator;
	}

	public String getAmbulanceServiceAvailable() {
		return ambulanceServiceAvailable;
	}

	public void setAmbulanceServiceAvailable(String ambulanceServiceAvailable) {
		this.ambulanceServiceAvailable = ambulanceServiceAvailable;
	}
	
	
	
}
