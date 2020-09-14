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
	public String hospitalName;
	public String hospitalAddress;
	public Double lattitude;
	public Double longitude;
	public String locality;
	public Integer totalICU;
	public Integer totalVentilator;
	public Integer totalAmbulance;
	public Integer availableIcu;
	public Integer availableVentilator;
	public Integer availableAmbulance;
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
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public Integer getTotalICU() {
		return totalICU;
	}
	public void setTotalICU(Integer totalICU) {
		this.totalICU = totalICU;
	}
	public Integer getTotalVentilator() {
		return totalVentilator;
	}
	public void setTotalVentilator(Integer totalVentilator) {
		this.totalVentilator = totalVentilator;
	}
	public Integer getTotalAmbulance() {
		return totalAmbulance;
	}
	public void setTotalAmbulance(Integer totalAmbulance) {
		this.totalAmbulance = totalAmbulance;
	}
	public Integer getAvailableIcu() {
		return availableIcu;
	}
	public void setAvailableIcu(Integer availableIcu) {
		this.availableIcu = availableIcu;
	}
	public Integer getAvailableVentilator() {
		return availableVentilator;
	}
	public void setAvailableVentilator(Integer availableVentilator) {
		this.availableVentilator = availableVentilator;
	}
	public Integer getAvailableAmbulance() {
		return availableAmbulance;
	}
	public void setAvailableAmbulance(Integer availableAmbulance) {
		this.availableAmbulance = availableAmbulance;
	}
	
	
	
	

}
