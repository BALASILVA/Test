package com.example.test.service;

import java.util.List;

import com.example.test.bene.Employee;
import com.example.test.exception.CustomException;

public interface EmployeeService  {

	Employee create(Employee employee) throws CustomException;

	boolean delete(Employee employee) throws CustomException;

	List<Employee> getAllEmployee() throws CustomException;

}
