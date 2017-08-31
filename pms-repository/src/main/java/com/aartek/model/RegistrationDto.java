package com.aartek.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Registration")
public class RegistrationDto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "firstName", length = 30, nullable = false)
	private String firstName ;
	@Column(name = "lastName", length = 30, nullable = false)
	private String lastName ;
	@Column(name = "contact", length = 12, nullable = false)
	private String contact ;
	@Column(name = "email", length = 30, nullable = false)
	private String emailId ;
	@Column(name = "password", length = 20, nullable = false)
	private String password;
	@Column(name = "address", length = 20, nullable = false)
	private String address;
	
	/*@OneToMany(fetch = FetchType.LAZY, targetEntity = AddressDto.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "FID", referencedColumnName = "id")
	private List<AddressDto> addressList;
*/
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getFirstName() {
		return firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

/*	public List<AddressDto> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<AddressDto> addressList) {
		this.addressList = addressList;
	}*/

}
