package com.mphasis.covidassistapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.covidassistapi.dao.CAServiceMetric;

@Repository
public interface CAmetricRepo extends JpaRepository<CAServiceMetric, Integer>{

}
