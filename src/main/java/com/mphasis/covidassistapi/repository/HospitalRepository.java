package com.mphasis.covidassistapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.covidassistapi.dao.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer>{

}
