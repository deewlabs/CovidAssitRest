package com.mphasis.covidassistapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.covidassistapi.dao.CovidSympton;

@Repository
public interface CovidSymptonsRepo extends JpaRepository<CovidSympton, Integer>{

}
