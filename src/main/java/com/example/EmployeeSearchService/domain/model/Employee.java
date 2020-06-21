package com.example.EmployeeSearchService.domain.model;

public class Employee {
	 public Employee(Long employeeId, String name) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		
	}
	private Long employeeId;
	 private String name;
	 ;
	 public Long getEmployeeId() {
	  return employeeId;
	 }
	 public void setEmployeeId(Long employeeId) {
	  this.employeeId = employeeId;
	 }
	 public String getName() {
	  return name;
	 }
	 public void setName(String name) {
	  this.name = name;
	 }
	
	 @Override
	 public String toString() {
	  return "Employee [employeeId=" + employeeId + ", name=" + name + ", practiceArea=" + ", designation=" +   ", companyInfo=" + "]";
	 }
}
