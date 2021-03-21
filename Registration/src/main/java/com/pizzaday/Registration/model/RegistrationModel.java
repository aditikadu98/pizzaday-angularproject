package com.pizzaday.Registration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegistrationModel {
	
	
	private int id;
	private String username;
	private String emailId;
	private String password;
	private String address;
	private String city;
	private String state;
	private int zipCode;
	
	public RegistrationModel() {
		// TODO Auto-generated constructor stub
	}
	public RegistrationModel(int id,String username, String emailId, String password, String address, String city, String state,
			int zipCode) {
		super();
		this.id = id;
		this.username = username;
		this.emailId = emailId;
		this.password = password;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
}
