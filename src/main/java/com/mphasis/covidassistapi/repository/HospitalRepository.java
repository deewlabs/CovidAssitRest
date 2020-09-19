package com.mphasis.covidassistapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mphasis.covidassistapi.dao.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer>{
	

	@Query(value="select * from Hospitals a, \r\n" + 
			" (SELECT hospitalId,( 3959 * acos(cos(radians(37)) * cos(radians(lattitude)) * cos(radians(longitude) - radians(:patLongitude)) + sin(radians(:patLatitude)) * sin(radians(lattitude )))\r\n" + 
			") AS distance FROM Hospitals where availableambulance <> 0 and ( AvailableOxygenUnit <> 0 or availableventilator <> 0 or availableicu <> 0) ORDER BY distance LIMIT 2) b where a.hospitalId = b.hospitalId",nativeQuery=true)
	public List<Hospital> findHospitalWithHighSeverityAndAmbulance(@Param("patLatitude") Double patLatitude, @Param("patLongitude") Double patLongitude);
	
	@Query(value="select * from Hospitals a, \r\n" + 
			" (SELECT hospitalId,( 3959 * acos(cos(radians(37)) * cos(radians(lattitude)) * cos(radians(longitude) - radians(:patLongitude)) + sin(radians(:patLatitude)) * sin(radians(lattitude )))\r\n" + 
			") AS distance FROM Hospitals where availableambulance <> 0 and availableisolationbed <> 0 ORDER BY distance LIMIT 2) b where a.hospitalId = b.hospitalId",nativeQuery=true)
	public List<Hospital> findHospitalWithLowSeverityAndAmbulance(@Param("patLatitude") Double patLatitude, @Param("patLongitude") Double patLongitude);
	
	@Query(value="select * from Hospitals a, \r\n" + 
			" (SELECT hospitalId,( 3959 * acos(cos(radians(37)) * cos(radians(lattitude)) * cos(radians(longitude) - radians(:patLongitude)) + sin(radians(:patLatitude)) * sin(radians(lattitude )))\r\n" + 
			") AS distance FROM Hospitals where   AvailableOxygenUnit <> 0 or availableventilator <> 0 or availableicu <> 0 ORDER BY distance LIMIT 2) b where a.hospitalId = b.hospitalId",nativeQuery=true)
	public List<Hospital> findHospitalWithHighSeverityAndNoAmbulance(@Param("patLatitude") Double patLatitude, @Param("patLongitude") Double patLongitude);
	
	@Query(value="select * from Hospitals a, \r\n" + 
			" (SELECT hospitalId,( 3959 * acos(cos(radians(37)) * cos(radians(lattitude)) * cos(radians(longitude) - radians(:patLongitude)) + sin(radians(:patLatitude)) * sin(radians(lattitude )))\r\n" + 
			") AS distance FROM Hospitals where  availableisolationbed <> 0 ORDER BY distance LIMIT 2) b where a.hospitalId = b.hospitalId",nativeQuery=true)
	public List<Hospital> findHospitalWithLowSeverityAndNoAmbulance(@Param("patLatitude") Double patLatitude, @Param("patLongitude") Double patLongitude);
	
	

}
