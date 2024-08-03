package com.walmart.products.dairy.organic.domain;

import java.util.List;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private List<Address> addressList;
	
	public void setId(int identity) {
		this.id = identity;
	}
	
	public int getId() {
		return id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	
	}
	public void setAddressList(List<Address>addressList) {
		this.addressList = addressList;
	}
	public List<Address> getAddressList()
	{
		return addressList;
	}
	
}
