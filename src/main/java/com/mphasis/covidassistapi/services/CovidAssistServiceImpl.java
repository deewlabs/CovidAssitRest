package com.mphasis.covidassistapi.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mphasis.covidassistapi.dao.CovidSympton;
import com.mphasis.covidassistapi.dao.Hospital;
import com.mphasis.covidassistapi.dao.PastMedicalCondition;
import com.mphasis.covidassistapi.dao.Patient;
import com.mphasis.covidassistapi.modal.PatientInfo;
import com.mphasis.covidassistapi.repository.CovidSymptonsRepo;
import com.mphasis.covidassistapi.repository.HospitalRepository;
import com.mphasis.covidassistapi.repository.PastMedicalCondtionRepo;
import com.mphasis.covidassistapi.repository.PatientInfoRepository;

@Service
public class CovidAssistServiceImpl implements CovidAssitService {

	private static Logger logger = LoggerFactory.getLogger(CovidAssistServiceImpl.class);
	private final PatientInfoRepository patientRepo;
	private final HospitalRepository hospitalRepo;
	private final PastMedicalCondtionRepo pastMedicalConditionrepo;
	private final CovidSymptonsRepo covidSymptonsRepo;
	
	public CovidAssistServiceImpl(PatientInfoRepository patientRepo,HospitalRepository hospitalRepo,PastMedicalCondtionRepo pastMedicalConditionrepo,
			CovidSymptonsRepo covidSymptonsRepo) {
		this.patientRepo=patientRepo;
		this.hospitalRepo=hospitalRepo;
		this.covidSymptonsRepo=covidSymptonsRepo;
		this.pastMedicalConditionrepo=pastMedicalConditionrepo;
	}
	
	@Override
	public List<PatientInfo> getAllPatientList() {
		// TODO Auto-generated method stub
		List<Patient> patientList = patientRepo.findAll();
		patientList.forEach(d->{
			logger.info("Patient Id={}",d.getPatientId());
		});
		return null;
	}

	@Override
	public List<Patient> getAllPatientList1() {
		List<Patient> patientList = patientRepo.findAll();
		return patientList;
	}

	@Override
	public List<Hospital> getAllHospital() {
		
		return hospitalRepo.findAll();
	}

	@Override
	public Patient savePatientInfo(PatientInfo patient) {
		Integer symptonId = patient.getSymptonId();
		Integer mediConId = patient.getMedicalCondId();
		CovidSympton sympton = null;
		PastMedicalCondition medCon = null;
		if(symptonId!=null) {
			Optional<CovidSympton> symptonOptional = covidSymptonsRepo.findById(symptonId);
			if(symptonOptional.isPresent()) {
				sympton=symptonOptional.get();
			}
		}
		if(mediConId!=null) {
			Optional<PastMedicalCondition> medicalConditionOptions=pastMedicalConditionrepo.findById(mediConId);
			if(medicalConditionOptions.isPresent()) {
				medCon=medicalConditionOptions.get();
			}
		}
		
		Patient newPatient = new Patient();
		newPatient.setAddressLine1(patient.getAddressLine1());
		newPatient.setAddressLine2(patient.getAddressLine2());
		newPatient.setAge(patient.getAge());
		newPatient.setSex(patient.getSex());
		newPatient.setFirstName(patient.getFirstName());
		newPatient.setLastName(patient.getLastName());
		newPatient.setLattitude(patient.getLattitude());
		newPatient.setLongitude(patient.getLongitude());
		newPatient.setCovidSympton(sympton);
		newPatient.setMedicalCondtion(medCon);
		return patientRepo.save(newPatient);
		
		
		
		
	}

	@Override
	public List<PastMedicalCondition> getAllMedicalConditon() {
		// TODO Auto-generated method stub
		return pastMedicalConditionrepo.findAll();
	}

	@Override
	public List<CovidSympton> getAllCovidSymptons() {
		// TODO Auto-generated method stub
		return covidSymptonsRepo.findAll();
	}

	

}
