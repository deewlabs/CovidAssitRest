package com.mphasis.covidassistapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.covidassistapi.dao.PastMedicalCondition;

@Repository
public interface PastMedicalCondtionRepo extends JpaRepository<PastMedicalCondition, Integer> {

}
