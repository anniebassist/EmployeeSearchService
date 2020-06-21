package com.example.EmployeeSearchService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.example.EmployeeSearchServiceRepository.EmployeeSearchRepository;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class EmployeeSearchApp {
   
	@Bean 
	   public EmployeeSearchRepository emp(){
	      return new EmployeeSearchRepository();
	   }
	
	public static void main(String[] args) {
        SpringApplication.run(EmployeeSearchApp.class, args);
    }
}