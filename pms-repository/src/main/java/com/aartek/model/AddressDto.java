package com.aartek.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class AddressDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AddID")
	private Integer addId = null;

	@Column(name = "COUNTRY", nullable = false, length = 15)
	private String country = null;
	@Column(name = "STATE", nullable = false, length = 20)
	private String state = null;
	@Column(name = "city", nullable = false, length = 20)
	private String city = null;
	@Column(name = "PINCODE", nullable = false, length = 8)
	private Integer pin = null;

	public Integer getAddId() {
		return addId;
	}

	public void setAddId(Integer addId) {
		this.addId = addId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

}
