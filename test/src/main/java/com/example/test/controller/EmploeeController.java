package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.http.HttpStatus.*;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.bene.Employee;
import com.example.test.exception.CustomException;
import com.example.test.service.EmployeeService;

@RestController
@RequestMapping(path = "/employee")
public class EmploeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmployee() throws CustomException {
		List<Employee> employees = employeeService.getAllEmployee();
		return new ResponseEntity<List<Employee>>(employees, OK);
	}

	@PostMapping
	public ResponseEntity<Employee> create(@RequestBody Employee employee) throws CustomException{
		Employee employeeFromDB = employeeService.create(employee);
		return new ResponseEntity<Employee>(employeeFromDB, CREATED);

	}

	@PostMapping(value = "update")
	public ResponseEntity<Employee> update(@RequestBody Employee employee) throws CustomException{
		Employee updatedEmployee = employeeService.create(employee);
		return new ResponseEntity<Employee>(updatedEmployee, OK);

	}

	@DeleteMapping
	public ResponseEntity<Boolean> name(@RequestBody Employee employee) throws CustomException{
		boolean isDeleted = employeeService.delete(employee);
		return new ResponseEntity<Boolean>(isDeleted, OK);
	}

}
