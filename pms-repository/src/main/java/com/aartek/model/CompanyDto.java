package com.aartek.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class CompanyDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "company_Name", nullable = false, length = 20)
	private String comName;
	@Column(name = "company_Add", nullable = false, length = 20)
	private String comAddress;
	@Column(name = "contact", nullable = false, length = 12)
	private String contact;
	@OneToMany(targetEntity = EmployeeDto.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "FID", referencedColumnName = "id")
	private List<EmployeeDto> empList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getComAddress() {
		return comAddress;
	}

	public void setComAddress(String comAddress) {
		this.comAddress = comAddress;
	}

	

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public List<EmployeeDto> getEmpList() {
		return empList;
	}

	public void setEmpList(List<EmployeeDto> empList) {
		this.empList = empList;
	
	}

	
}
