package com.example.EmployeeSearchService.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeSearchService.EmployeeSearchService;
import com.example.EmployeeSearchService.domain.model.Employee;

@RefreshScope
@RestController
public class EmployeeSearchController {

@Autowired
EmployeeSearchService employeeSearchService;
	

/*@Value("${welcome.message}")*/
public String personName;



@RequestMapping("/employee/create")
public Long createNewEmployee()
{
	return employeeSearchService.createEmp();
	
}
	
@RequestMapping("/employee/find/{id}")
public Employee findById(@PathVariable Long id) {
 return employeeSearchService.findById(id);
}
@RequestMapping("/employee/findall")
public Collection < Employee > findAll() {
 return employeeSearchService.findAll();
}

@RequestMapping("/employee/print")
public void  print(String personName) {
  System.out.println(personName);
}

@RequestMapping("/employee")
public String print1() {
 return "dadu";
}

@RequestMapping("/employee/test1")
public String printAgain()
{
	return "ok";
	
}


}
