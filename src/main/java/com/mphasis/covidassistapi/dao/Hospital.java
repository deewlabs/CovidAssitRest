package com.mphasis.covidassistapi.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Hospitals")
public class Hospital {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer hospitalId;
	private String hospitalName;
	private String hospitalAddress;
	private Double lattitude;
	private Double longitude;
	private String contactNo;
	private String emailId;
	private String ambulanceServiceAvailable;
	private Integer totalAmbulance;
	private Integer availableAmbulance;
	private Integer totalIsolationBed;
	private Integer availableIsolationBed;
	private Integer totalIcu;
	private Integer availableIcu;
	private Integer totalOxygenUnit;
	private Integer totalVentilator;
	private Integer availableVentilator;
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(Integer hospitalId) {
		this.hospitalId = hospitalId;
	}
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
	public String getAmbulanceServiceAvailable() {
		return ambulanceServiceAvailable;
	}
	public void setAmbulanceServiceAvailable(String ambulanceServiceAvailable) {
		this.ambulanceServiceAvailable = ambulanceServiceAvailable;
	}
	public Integer getTotalAmbulance() {
		return totalAmbulance;
	}
	public void setTotalAmbulance(Integer totalAmbulance) {
		this.totalAmbulance = totalAmbulance;
	}
	public Integer getAvailableAmbulance() {
		return availableAmbulance;
	}
	public void setAvailableAmbulance(Integer availableAmbulance) {
		this.availableAmbulance = availableAmbulance;
	}
	public Integer getTotalIsolationBed() {
		return totalIsolationBed;
	}
	public void setTotalIsolationBed(Integer totalIsolationBed) {
		this.totalIsolationBed = totalIsolationBed;
	}
	public Integer getAvailableIsolationBed() {
		return availableIsolationBed;
	}
	public void setAvailableIsolationBed(Integer availableIsolationBed) {
		this.availableIsolationBed = availableIsolationBed;
	}
	public Integer getTotalIcu() {
		return totalIcu;
	}
	public void setTotalIcu(Integer totalIcu) {
		this.totalIcu = totalIcu;
	}
	public Integer getAvailableIcu() {
		return availableIcu;
	}
	public void setAvailableIcu(Integer availableIcu) {
		this.availableIcu = availableIcu;
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
	public Integer getAvailableVentilator() {
		return availableVentilator;
	}
	public void setAvailableVentilator(Integer availableVentilator) {
		this.availableVentilator = availableVentilator;
	}


	@Override
	public String toString() {
		return hospitalName +
				", Address : " + hospitalAddress +
				", Contact Number : "+ contactNo +
				", Url : "+url ;
	}
	
}
