package com.mphasis.covidassistapi.dao;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PastMedicalCondition")
public class PastMedicalCondition {	

	@Id
	private Integer pastMedConId;
    private String medCon;
    private String severity;
    private String iCURequired;
    private String ventilationRequired;

	public Integer getPastMedConId() {
		return pastMedConId;
	}
	public void setPastMedConId(Integer pastMedConId) {
		this.pastMedConId = pastMedConId;
	}
	public String getMedCon() {
		return medCon;
	}
	public void setMedCon(String medCon) {
		this.medCon = medCon;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getiCURequired() {
		return iCURequired;
	}
	public void setiCURequired(String iCURequired) {
		this.iCURequired = iCURequired;
	}
	public String getVentilationRequired() {
		return ventilationRequired;
	}
	public void setVentilationRequired(String ventilationRequired) {
		this.ventilationRequired = ventilationRequired;
	}
    
}
