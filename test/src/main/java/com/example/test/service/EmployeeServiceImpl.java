package com.example.test.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.bene.Employee;
import com.example.test.exception.CustomException;
import com.example.test.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public List<Employee> getAllEmployee() throws CustomException {
		try {
			List<Employee> employees = employeeRepo.findAll();
			// Sorting Logic written in Employee bene class by overriding compaterTo method
			Collections.sort(employees);
			return employees;
		} catch (Exception ex) {
			throw new CustomException("Exception occured" + ex.getMessage());
		}
	}

	@Override
	public Employee create(Employee employee) throws CustomException {
		try {
			return employeeRepo.save(employee);
		} catch (Exception ex) {
			throw new CustomException("Failed to create employee");
		}
	}

	@Override
	public boolean delete(Employee employee) throws CustomException {
		try {
			employeeRepo.deleteById(employee.getEmployeeId());
			return true;
		} catch (Exception ex) {
			throw new CustomException("Failed to delete employee");
		}
	}

}
