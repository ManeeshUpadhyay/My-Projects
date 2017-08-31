package com.aartek.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class EmployeeDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empid ;
	@Column(name = "EMP_NAME", nullable = false, length = 20)
	private String empName ;
	@Column(name = "EMP_ADD", nullable = false, length = 20)
	private String empAdd ;
	@Column(name = "EMP_CONTACT", nullable = false, length = 20)
	private String empContact;

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}

	public String getEmpContact() {
		return empContact;
	}

	public void setEmpContact(String empContact) {
		this.empContact = empContact;
	}

}
