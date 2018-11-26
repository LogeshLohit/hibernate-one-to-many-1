package com.employee;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_INTERESTS")
public class EmployeeInterests {
	@Id
	@Column(name = "S_NO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sNo;
	@Column(name = "EMP_ID",insertable=false,updatable=false)
	private String empId;
	@Column(name = "INTEREST")
	private String empInterest;
	@ManyToOne
	@JoinColumn(name="EMP_ID")
	private Employee employee;
	public EmployeeInterests() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeInterests(String empInterest) {
		super();
		this.empInterest = empInterest;
	}

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpInterest() {
		return empInterest;
	}

	public void setEmpInterest(String empInterest) {
		this.empInterest = empInterest;
	}

}
