package com.mphasis.covidassistapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages= {"com.mphasis.covidassistapi.repository"})
@EntityScan(basePackages = {"com.mphasis.covidassistapi.dao"})
public class CovidassistapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidassistapiApplication.class, args);
	}

}
