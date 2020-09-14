package com.mphasis.covidassistapi.services;

import java.util.List;

import com.mphasis.covidassistapi.dao.CovidSympton;
import com.mphasis.covidassistapi.dao.Hospital;
import com.mphasis.covidassistapi.dao.PastMedicalCondition;
import com.mphasis.covidassistapi.dao.Patient;
import com.mphasis.covidassistapi.modal.PatientInfo;

public interface CovidAssitService {
	
  public List<PatientInfo> getAllPatientList();
  public List<Patient> getAllPatientList1();
  public List<Hospital> getAllHospital();
  public List<PastMedicalCondition> getAllMedicalConditon();
  public List<CovidSympton> getAllCovidSymptons();
  Patient savePatientInfo(PatientInfo patient);

}
