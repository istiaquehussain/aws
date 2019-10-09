package com.istiaque.spring.cloud.bootcloud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.istiaque.spring.cloud.bootcloud.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	ConcurrentHashMap<String, Employee> employeeDb = new ConcurrentHashMap<String, Employee>();
	@Override
	public Optional<Employee> findEmployeeById(String id) {
		
		return Optional.ofNullable(employeeDb.get(id));
	}

	@Override
	public List<Employee> FindAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> employees=employeeDb.values().stream().collect(Collectors. 
                toCollection(ArrayList::new));
		return employees;
	}

	@Override
	public Employee createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employeeDb.put(emp.getId(), emp);
		return emp;
	}

}
