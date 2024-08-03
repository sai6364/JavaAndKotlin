package com.walmart.products.dairy.organic;

import java.util.Arrays;

import com.walmart.products.dairy.organic.domain.Address;
import com.walmart.products.dairy.organic.domain.Customer;
//It is writing the some methods using a same method name with different paremeters in a class // method overloading.
public class MethodOverlaodingDemo {
	public Customer findCustomer(String firstName, String lastName) {
		// It goes to the database search for details and it will return from the
		// database.
		Customer cust = new Customer();
		cust.setFirstName(firstName);
		cust.setLastName(lastName);
		Address add1 = new Address();
		add1.setHouseNumber("1233");
		cust.setAddressList(Arrays.asList(add1));
		return cust;
	}

	public Customer findCustomer(int id) {
		// It goes to the database search for details and it will return from the
		// database.
		Customer cust = new Customer();
		cust.setFirstName("Test");
		cust.setLastName("Test lastName");
		Address add1 = new Address();
		add1.setHouseNumber("1233");
		cust.setAddressList(Arrays.asList(add1));
		return cust;
	}

	public Customer findCustomer(Address add1) {
		// It goes to the database search for details and it will return from the
		// database.
		Customer cust = new Customer();
		cust.setFirstName("Test");
		cust.setLastName("Test lastName");

		cust.setAddressList(Arrays.asList(add1));
		return cust;
	}

	public Customer findCustomer(String lastName, int id) {
		// It goes to the database search for details and it will return from the
		// database.
		Customer cust = new Customer();
		cust.setFirstName("Test");
		cust.setId(id);
		cust.setLastName(lastName);
		Address add1 = new Address();
		add1.setHouseNumber("1233");
		cust.setAddressList(Arrays.asList(add1));
		return cust;
	}

	public static void main(String[] args) {
		MethodOverlaodingDemo obj = new MethodOverlaodingDemo();
		Customer cust = obj.findCustomer(200);
		System.out.println(cust.getLastName());
		Customer cust1 = obj.findCustomer("Test",200);
		System.out.println(cust.getFirstName());
		
	}

}
