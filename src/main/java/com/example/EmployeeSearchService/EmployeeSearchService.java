package com.example.EmployeeSearchService;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeSearchService.domain.model.Employee;
import com.example.EmployeeSearchServiceRepository.EmployeeSearchRepository;

@Service
public class EmployeeSearchService {

	@Autowired
	EmployeeSearchRepository empRepository;

	private Map<Long, Employee> EmployeeRepsitory = null;

	public Map<Long, Employee> getEmployeeRepsitory() {
		return EmployeeRepsitory;
	}

	public void setEmployeeRepsitory(Map<Long, Employee> employeeRepsitory) {
		EmployeeRepsitory = employeeRepsitory;

	}
	
	
	public Long createEmp()
	{
		return empRepository.createEmp();
		//add code for create 
	}

	public void check(String CompanyId) {

		EmployeeRepsitory = empRepository.getEmployees(CompanyId).stream()
				.collect(Collectors.toMap(Employee::getEmployeeId, emp -> emp));

		setEmployeeRepsitory(EmployeeRepsitory);
	}

	// EmpRespository Map is created and data is passed back to controller

	public Employee findById(Long id) {
		System.out.println("id is" + id);
		check("");
		return EmployeeRepsitory.get(id);
	}

	public Collection<Employee> findAll() {
		check("");
		return EmployeeRepsitory.values();

	}

}
