package com.mphasis.covidassistapi.dao;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="PatientInformation")
public class Patient {
	
	private long patientId;
	private String firstName;
	private String lastName;
	private Integer age;
	@Max(value=1)
	private Character sex;
	

}
