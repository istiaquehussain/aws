package com.istiaque.spring.cloud.bootcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.istiaque.spring.cloud.bootcloud.entity.Employee;
import com.istiaque.spring.cloud.bootcloud.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees/id/{id}")
	public ResponseEntity<?> findEmployeeById(@PathVariable("id") String id)
	{
		Employee employee = employeeService.findEmployeeById(id).orElse(null);
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}
	@GetMapping("/employees")
	public ResponseEntity<?> findAllEmployees()
	{
		List<Employee> employees= employeeService.FindAllEmployees();
		return new ResponseEntity<>(employees,HttpStatus.OK);
	}
	@PostMapping("/employees")
	public ResponseEntity<?> createEmployee(@RequestBody Employee emp)
	{
		System.out.println("Employees ##### "+emp);
		Employee employee = employeeService.createEmployee(emp);
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}

}
