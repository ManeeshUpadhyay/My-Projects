package com.aartek.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Registration")
public class RegistrationDto {

	private Integer id = null;
	private String firstName = null;
	private String lastName = null;
	private String contact = null;
	private String address = null;
	private String emailId = null;
	private String password = null;

	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "firstName", length = 30, nullable = false)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "lastName", length = 30, nullable = false)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "contact", length = 12, nullable = false)
	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Column(name = "address", length = 100, nullable = false)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "email", length = 25, nullable = false)
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name = "password", length = 20, nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
