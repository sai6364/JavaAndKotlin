package com.walmart.products.dairy.organic;

public class DataTypesDemo {
	
	final double fedTax1 = 7.8;
	public String createCustomer(String firstName, String lastName, String houseNumber, int zipcode) {
		return "sai";
	}

	public int subTwoNumbers(int a, int b) {
		return a - b;
	}

	public double subTwoNumbers(double a, double b) {
		return a - b;
	}

	public static void main(String[] args) {

		int miles = 10;
		System.out.println("miles to drive: " + miles);
		
		DataTypesDemo cust1 = new DataTypesDemo();
		String custDetails1 = cust1.createCustomer("sai", "ram", "100", 36112);
		System.out.println("Customer Details = " + custDetails1);
		
		DataTypesDemo i = new DataTypesDemo();
		int a = i.subTwoNumbers(10, 25);
		System.out.println("Total of two numbers are " + a);
		
		DataTypesDemo n = new DataTypesDemo();
		double b = i.subTwoNumbers(10.5, 25);
		System.out.println("Total of two numbers are " + b);
		
		
	}

}
