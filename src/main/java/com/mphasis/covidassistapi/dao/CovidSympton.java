package com.mphasis.covidassistapi.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CovidSymptons")
public class CovidSympton {
	
	@Id
	private Integer symptonId;
	private String symptons;
	private String severity;
	public Integer getSymptonId() {
		return symptonId;
	}
	public void setSymptonId(Integer symptonId) {
		this.symptonId = symptonId;
	}
	public String getSymptons() {
		return symptons;
	}
	public void setSymptons(String symptons) {
		this.symptons = symptons;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	

}
