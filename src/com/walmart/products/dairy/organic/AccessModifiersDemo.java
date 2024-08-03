package com.walmart.products.dairy.organic;

public class AccessModifiersDemo {

	DataTypesDemo cust1 = new DataTypesDemo();
	String custDetails1 = cust1.createCustomer("sai", "ram", "100", 36112);
	System.out.println("Customer Details = " + custDetails1);
	
	DataTypesDemo i = new DataTypesDemo();
	int a = i.subTwoNumbers(10, 25);
	System.out.println("Total of two numbers are " + a);
	
}
