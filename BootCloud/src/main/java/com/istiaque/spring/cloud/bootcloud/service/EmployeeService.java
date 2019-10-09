package com.istiaque.spring.cloud.bootcloud.service;

import java.util.List;
import java.util.Optional;

import com.istiaque.spring.cloud.bootcloud.entity.Employee;

public interface EmployeeService {
	Optional<Employee> findEmployeeById(String id);
	List<Employee> FindAllEmployees();
	Employee createEmployee(Employee emp);
	
}
