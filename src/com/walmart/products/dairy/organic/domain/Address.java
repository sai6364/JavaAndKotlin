package com.walmart.products.dairy.organic.domain;

public class Address {
	private String id;
	private String houseNumber;
	private String state;
	private String streetName;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	private Long Zipcode;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreetNumber() {
		return streetName;
	}
	public void setStreetNumber(String streetName) {
		this.streetName = streetName;
	}
	public Long getZipcode() {
		return Zipcode;
	}
	public void setZipcode(Long zipcode) {
		Zipcode = zipcode;
	}
}
