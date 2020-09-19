package com.mphasis.covidassistapi.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.mphasis.covidassistapi.message.GenerateMsg;
import com.mphasis.covidassistapi.message.GenerateWhatsappMsg;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.mphasis.covidassistapi.dao.CAServiceMetric;
import com.mphasis.covidassistapi.dao.CovidSympton;
import com.mphasis.covidassistapi.dao.Hospital;
import com.mphasis.covidassistapi.dao.PastMedicalCondition;
import com.mphasis.covidassistapi.dao.Patient;
import com.mphasis.covidassistapi.modal.HospitalInfo;
import com.mphasis.covidassistapi.modal.PatientInfo;
import com.mphasis.covidassistapi.repository.CAmetricRepo;
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
	private final CAmetricRepo caMetricRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public CovidAssistServiceImpl(PatientInfoRepository patientRepo,HospitalRepository hospitalRepo,PastMedicalCondtionRepo pastMedicalConditionrepo,
			CovidSymptonsRepo covidSymptonsRepo,CAmetricRepo caMetricRepo) {
		this.patientRepo=patientRepo;
		this.hospitalRepo=hospitalRepo;
		this.covidSymptonsRepo=covidSymptonsRepo;
		this.pastMedicalConditionrepo=pastMedicalConditionrepo;
		this.caMetricRepo=caMetricRepo;
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
		GenerateMsg generateMsg = new GenerateWhatsappMsg();
		String severity =findSeverity(patient.getMedicalCondition(),patient.getCovidSympton(),patient.getAge());
		List<Hospital> suggestedHospital=null;
		Optional<CAServiceMetric> caMetric=caMetricRepo.findById(1);
		CAServiceMetric caServiceMetric = caMetric.get();
		Patient newPatient = new Patient();
		newPatient.setAddress(patient.getAddress());
		newPatient.setAge(patient.getAge());
		newPatient.setSex(patient.getSex());
		newPatient.setName(patient.getName());
		newPatient.setLattitude(patient.getLattitude());
		newPatient.setLongitude(patient.getLongitude());
		newPatient.setEmailId(patient.getEmailId());
		newPatient.setEmergencyContactNo(patient.getEmergencyContactNo());
		newPatient.setInternationalTravel(patient.getInternationalTravel());
		newPatient.setCovidSympton(patient.getCovidSympton());
		newPatient.setMedicalCondition(patient.getMedicalCondition());
		newPatient.setAmbulanceRequired(patient.getAmbulanceRequired());
		newPatient.setHospitalRequired(patient.getHospitalRequired());
		newPatient.setSeverity(severity);
		newPatient.setEmergencyContactNo(patient.getEmergencyContactNo());
		Patient savedEntity=patientRepo.save(newPatient);
		logger.info(newPatient.toString());
		if("Yes".equalsIgnoreCase(patient.getAmbulanceRequired()) && "High".equalsIgnoreCase(severity)) {
			suggestedHospital=hospitalRepo.findHospitalWithHighSeverityAndAmbulance(patient.getLattitude(),patient.getLongitude());
			if(!ObjectUtils.isEmpty(suggestedHospital)) {
				logger.info("Requirement met");
				caServiceMetric.setAmbulanceServiced(caServiceMetric.getAmbulanceServiced()+1);
				caServiceMetric.setVentilatorServiced(caServiceMetric.getVentilatorNotServiced()+1);
				caServiceMetric.setiCUServiced(caServiceMetric.getiCUNotServiced()+1);
				caServiceMetric.setOxygenCylinderServiced(caServiceMetric.getOxygenCylinderServiced()+1);
			}else {
				logger.info("Requirement not met");
				caServiceMetric.setAmbulanceNotServiced(caServiceMetric.getAmbulanceNotServiced()+1);
				caServiceMetric.setVentilatorNotServiced(caServiceMetric.getVentilatorNotServiced()+1);
				caServiceMetric.setiCUNotServiced(caServiceMetric.getiCUNotServiced()+1);
				caServiceMetric.setOxygenCylinderNotServiced(caServiceMetric.getOxygenCylinderNotServiced()+1);
			}
		 
		}
		else if("No".equalsIgnoreCase(patient.getAmbulanceRequired()) && "High".equalsIgnoreCase(severity)) {
			suggestedHospital=hospitalRepo.findHospitalWithHighSeverityAndNoAmbulance(patient.getLattitude(),patient.getLongitude());
			if(!ObjectUtils.isEmpty(suggestedHospital)) {
				logger.info("Requirement met");
				caServiceMetric.setVentilatorServiced(caServiceMetric.getVentilatorNotServiced()+1);
				caServiceMetric.setiCUServiced(caServiceMetric.getiCUNotServiced()+1);
				caServiceMetric.setOxygenCylinderServiced(caServiceMetric.getOxygenCylinderServiced()+1);
			}else {
				logger.info("Requirement not met");
				caServiceMetric.setVentilatorNotServiced(caServiceMetric.getVentilatorNotServiced()+1);
				caServiceMetric.setiCUNotServiced(caServiceMetric.getiCUNotServiced()+1);
				caServiceMetric.setOxygenCylinderNotServiced(caServiceMetric.getOxygenCylinderNotServiced()+1);
			}
			
		}
		else if("Yes".equalsIgnoreCase(patient.getAmbulanceRequired()) && "Low".equalsIgnoreCase(severity)) {
			suggestedHospital=hospitalRepo.findHospitalWithLowSeverityAndAmbulance(patient.getLattitude(),patient.getLongitude());
			if(!ObjectUtils.isEmpty(suggestedHospital)) {
				logger.info("Requirement met");
				caServiceMetric.setAmbulanceServiced(caServiceMetric.getAmbulanceServiced()+1);
				caServiceMetric.setIsolationBedServiced(caServiceMetric.getIsolationBedServiced()+1);
			}else {
				logger.info("Requirement not met");
				caServiceMetric.setAmbulanceNotServiced(caServiceMetric.getAmbulanceNotServiced()+1);
				caServiceMetric.setIsolationBedNotServiced(caServiceMetric.getIsolationBedNotServiced()+1);
			}
			
		 
		}
		else if("No".equalsIgnoreCase(patient.getAmbulanceRequired()) && "Low".equalsIgnoreCase(severity)) {
			suggestedHospital=hospitalRepo.findHospitalWithLowSeverityAndNoAmbulance(patient.getLattitude(),patient.getLongitude());
			if(!ObjectUtils.isEmpty(suggestedHospital)) {
				logger.info("Requirement met");
				caServiceMetric.setIsolationBedServiced(caServiceMetric.getIsolationBedServiced()+1);
			}else {
				logger.info("Requirement not met");
				caServiceMetric.setIsolationBedNotServiced(caServiceMetric.getIsolationBedNotServiced()+1);
			}
		}
		
		caMetricRepo.save(caServiceMetric);
			//send whatsapp messages with hospital info 
		suggestedHospital.forEach(t -> logger.info(t.getHospitalName()));
		generateMsg.generateMsgsUsingHospialsList(suggestedHospital,newPatient.getEmergencyContactNo());
		return savedEntity;
		
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
	
	
	private String findSeverity(String medicalCondition,String symptons,Integer age) {

		if(medicalCondition==null && symptons==null) return "Low";
		if(age==null) return "NA";
		
		if(age <= 16 ||age >= 65) return "High";
		
		List<Integer> medicalCondtions = Arrays.asList(medicalCondition.split(",")).stream().map(Integer::parseInt).collect(Collectors.toList());
		List<Integer> covidSymptons = Arrays.asList(symptons.split(",")).stream().map(Integer::parseInt).collect(Collectors.toList());
		
		List<PastMedicalCondition> cMdicalCon=pastMedicalConditionrepo.findAllById(medicalCondtions);
		List<CovidSympton> csymptons = covidSymptonsRepo.findAllById(covidSymptons);
		Optional<PastMedicalCondition> med=cMdicalCon.stream().findAny().filter(m->"High".equalsIgnoreCase(m.getSeverity()));
		Optional<CovidSympton> sym=csymptons.stream().findAny().filter(m->"High".equalsIgnoreCase(m.getSeverity()));
		
		if(med.isPresent() || sym.isPresent()) 
		{
			return "High";
		}
		 else return "Low";
		
		
		
		
	}

	@Override
	public Hospital saveHospitalInfo(HospitalInfo hospitalInfo) {
		Hospital hospitalEntity = modelMapper.map(hospitalInfo, Hospital.class);
		hospitalEntity.setAvailableAmbulance(hospitalInfo.getTotalAmbulance());
		hospitalEntity.setAvailableIcu(hospitalInfo.getTotalIcu());
		hospitalEntity.setAvailableIsolationBed(hospitalInfo.getTotalIsolationBed());
		hospitalEntity.setAvailableVentilator(hospitalInfo.getTotalVentilator());
		return	hospitalRepo.save(hospitalEntity);
		
	}

	@Override
	public List<CAServiceMetric> dashboard() {
		
		return caMetricRepo.findAll();
	}

	

}
