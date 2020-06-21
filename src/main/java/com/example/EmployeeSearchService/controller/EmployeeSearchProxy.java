package com.example.EmployeeSearchService.controller;

import java.util.Collection;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "EmployeeHibernateJPA")
@RibbonClient(name = "EmployeeHibernateJPA")
public interface EmployeeSearchProxy {
	
	
	
	/*@RequestMapping("/employee/find/{id}")
	public Employee findById(@PathVariable(value = "id") Long id);

	@RequestMapping("/employee/findall")
	public Collection<Employee> findAll();
	*/
	
	
	@RequestMapping("/employeeJPA/create")
	public Long createEmp();
}