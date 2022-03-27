package com.example.test.bene;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements Comparable<Employee> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employeeid")
	private Long employeeId;

	@Column(name = "employeename")
	private String employeeName;

	@Column(name = "designation")
	private String designation;

	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "departmentId")
	private Department department;

	@Column(name = "salary")
	private Long salary;

	@OneToMany(targetEntity = Skill.class, cascade = { CascadeType.ALL })
	private List<Skill> skills;

	public Employee() {
	}

	public Employee(Long employeeId, String employeeName, String designation, Department department, Long salary,
			List<Skill> skills) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
		this.skills = skills;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", designation=" + designation
				+ ", department=" + department + ", salary=" + salary + ", skills=" + skills + "]";
	}

	@Override
	public int compareTo(Employee obj) {
		if (this.salary == obj.salary)
			return 0;
		else if (this.salary > obj.salary)
			return -1;
		else
			return 1;
	}

}
