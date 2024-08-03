package com.walmart.products.dairy.organic;

public interface CustomerServiceInt {
	
	 default String getCustomerName(int id) {
		return "rama";
	}
	
	
	default String updateCustomerDetails(String firstName) {
		return " ";
	}

}
