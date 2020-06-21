package com.example.EmployeeSearchServiceRepository;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.EmployeeSearchService.controller.EmployeeSearchProxy;
import com.example.EmployeeSearchService.domain.model.Employee;

@Repository
public class EmployeeSearchRepository {

@Autowired EmployeeSearchProxy proxy;	
	
/*
 *  The below code creates the client implementation of the Rest call at runtime to invoke the controller service
 *   in HibernateJPA project
 */
public Long createEmp()
{
	return proxy.createEmp();	
}



public List <Employee> getEmployees(String compId)
{
	
// this part needs to handle the data fetch from the DB	
List<Employee> emps=Arrays.asList(
		new Employee(123L,"Anirban-from Rep"),
		new Employee(456L,"Ambika-from repo"),
		new Employee(100L,"Aditya-from repo"));

return  emps;


}



}
