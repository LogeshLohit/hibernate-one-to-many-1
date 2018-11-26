package com.employee;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEES")
public class Employee {

	private int empId;

	private String empName;

	private String designation;
	private Set<EmployeeInterests> employeeInterests = new HashSet<>();

	public Employee() {

	}

	@OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
	public Set<EmployeeInterests> getEmployeeInterests() {
		return employeeInterests;
	}

	/*
	 * public boolean addInterest(EmployeeInterests interest) {
	 * interest.setEmployee(this); return getEmployeeInterests().add(interest);
	 * }
	 */
	
	public Employee(int empId, String empName, String designation, Set<EmployeeInterests> employeeInterests) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.employeeInterests = employeeInterests;
	}

	public void setEmployeeInterests(Set<EmployeeInterests> employeeInterests) {
		this.employeeInterests = employeeInterests;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMP_ID")
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Column(name = "EMP_NAME")
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Column(name = "EMP_DESIG")
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation
				+ ", employeeInterests=" + "]";
	}

}
