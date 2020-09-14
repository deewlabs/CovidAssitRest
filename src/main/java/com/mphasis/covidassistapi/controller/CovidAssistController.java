package com.mphasis.covidassistapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.covidassistapi.dao.CovidSympton;
import com.mphasis.covidassistapi.dao.Hospital;
import com.mphasis.covidassistapi.dao.PastMedicalCondition;
import com.mphasis.covidassistapi.dao.Patient;
import com.mphasis.covidassistapi.modal.PatientInfo;
import com.mphasis.covidassistapi.services.CovidAssitService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(value="/api/ca")
public class CovidAssistController {
	
	private final CovidAssitService service;
	
	public CovidAssistController(CovidAssitService service) {
		this.service=service;
	}
	
	@RequestMapping(value="/allpatient",method=RequestMethod.GET)
	public List<Patient> getAllPatient() {
		return service.getAllPatientList1();
	}
	
	@RequestMapping(value="/allHospital",method=RequestMethod.GET)
	public List<Hospital> getAllHospital() {
		return service.getAllHospital();
	}
	
	@RequestMapping(value="/savePatient",method=RequestMethod.POST)
	public  Patient savePatientInfo(@RequestBody PatientInfo patient) {
		return service.savePatientInfo(patient);
	}
	
	@RequestMapping(value="/allMedicalCondition",method=RequestMethod.GET)
	public List<PastMedicalCondition> getAllMedicalConditon(){
		return service.getAllMedicalConditon();
	}
	
	@RequestMapping(value="/allCovidSymptons",method=RequestMethod.GET)
	public List<CovidSympton> getAllCovidSymptons(){
		return service.getAllCovidSymptons();
	}

}
