package com.mphasis.covidassistapi.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CAServiceMetric")
public class CAServiceMetric {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer metricId;
	private Integer ambulanceServiced;
	private Integer ambulanceNotServiced;
	private Integer iCUServiced ;
	private Integer iCUNotServiced ;
	private Integer ventilatorServiced ;
	private Integer ventilatorNotServiced ;
	private Integer isolationBedServiced ;
	private Integer isolationBedNotServiced ;
	private Integer oxygenCylinderServiced ;
	private Integer oxygenCylinderNotServiced ;
	public Integer getMetricId() {
		return metricId;
	}
	public void setMetricId(Integer metricId) {
		this.metricId = metricId;
	}
	public Integer getAmbulanceServiced() {
		return ambulanceServiced;
	}
	public void setAmbulanceServiced(Integer ambulanceServiced) {
		this.ambulanceServiced = ambulanceServiced;
	}
	public Integer getAmbulanceNotServiced() {
		return ambulanceNotServiced;
	}
	public void setAmbulanceNotServiced(Integer ambulanceNotServiced) {
		this.ambulanceNotServiced = ambulanceNotServiced;
	}
	public Integer getiCUServiced() {
		return iCUServiced;
	}
	public void setiCUServiced(Integer iCUServiced) {
		this.iCUServiced = iCUServiced;
	}
	public Integer getiCUNotServiced() {
		return iCUNotServiced;
	}
	public void setiCUNotServiced(Integer iCUNotServiced) {
		this.iCUNotServiced = iCUNotServiced;
	}
	public Integer getVentilatorServiced() {
		return ventilatorServiced;
	}
	public void setVentilatorServiced(Integer ventilatorServiced) {
		this.ventilatorServiced = ventilatorServiced;
	}
	public Integer getVentilatorNotServiced() {
		return ventilatorNotServiced;
	}
	public void setVentilatorNotServiced(Integer ventilatorNotServiced) {
		this.ventilatorNotServiced = ventilatorNotServiced;
	}
	public Integer getIsolationBedServiced() {
		return isolationBedServiced;
	}
	public void setIsolationBedServiced(Integer isolationBedServiced) {
		this.isolationBedServiced = isolationBedServiced;
	}
	public Integer getIsolationBedNotServiced() {
		return isolationBedNotServiced;
	}
	public void setIsolationBedNotServiced(Integer isolationBedNotServiced) {
		this.isolationBedNotServiced = isolationBedNotServiced;
	}
	public Integer getOxygenCylinderServiced() {
		return oxygenCylinderServiced;
	}
	public void setOxygenCylinderServiced(Integer oxygenCylinderServiced) {
		this.oxygenCylinderServiced = oxygenCylinderServiced;
	}
	public Integer getOxygenCylinderNotServiced() {
		return oxygenCylinderNotServiced;
	}
	public void setOxygenCylinderNotServiced(Integer oxygenCylinderNotServiced) {
		this.oxygenCylinderNotServiced = oxygenCylinderNotServiced;
	}
	

	
}
