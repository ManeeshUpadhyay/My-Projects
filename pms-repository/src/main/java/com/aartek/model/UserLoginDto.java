package com.aartek.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Login")
public class UserLoginDto {

	private Integer id;
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
