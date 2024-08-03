package com.walmart.products.dairy.organic;

public class MultipleInheritance implements CustomerServiceInt2,CustomerServiceInt  {
	
	public static void main(String[] args) {
		
				MultipleInheritance obj1 = new MultipleInheritance();
				String result =obj1.getGreetings("rama");
				System.out.println(result);
		
				

	}

	@Override
	public String getCustomerName(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCustomerDetails(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getGreetings1(String name) {
		// TODO Auto-generated method stub
		return "core java interview preparation with program";
	}

	
}
