package com.example.test.bene;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "companyid")
	private Long companyId;
	private String comanyName;

	@OneToMany(targetEntity = Department.class, cascade = { CascadeType.ALL })
	private List<Department> departments;

	@OneToMany(targetEntity = Employee.class, cascade = { CascadeType.ALL })
	private List<Employee> employees;

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(Long companyId, String comanyName, List<Department> departments, List<Employee> employees) {
		super();
		this.companyId = companyId;
		this.comanyName = comanyName;
		this.departments = departments;
		this.employees = employees;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getComanyName() {
		return comanyName;
	}

	public void setComanyName(String comanyName) {
		this.comanyName = comanyName;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", comanyName=" + comanyName + ", departments=" + departments
				+ ", employees=" + employees + "]";
	}

}
