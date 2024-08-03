package com.walmart.products.dairy.organic;

public class AbstractDemoImpl extends AbstractDemo{
	//Any regular class cannot extend more than one class
	public static void main(String[] args) {
		AbstractDemoImpl obj1 = new AbstractDemoImpl();
		System.out.println(obj1.getCustomerName(0));
		obj1.updateCustomerDetails("testfirstname");

	}

	@Override
	public void updateCustomerDetails(String firstName) {
		System.out.println("I am from AbstractDemoImpl = ");
		
	}

}
