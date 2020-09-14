package com.mphasis.covidassistapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.covidassistapi.dao.Patient;

@Repository
public interface PatientInfoRepository extends JpaRepository<Patient, Integer> {
	
	

}
