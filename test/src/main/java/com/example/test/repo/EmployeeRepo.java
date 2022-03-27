package com.example.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.bene.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
